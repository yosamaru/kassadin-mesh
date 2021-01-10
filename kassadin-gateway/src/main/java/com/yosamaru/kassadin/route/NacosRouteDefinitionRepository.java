package com.yosamaru.kassadin.route;

import com.alibaba.cloud.nacos.NacosConfigManager;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.nacos.api.config.listener.Listener;
import com.alibaba.nacos.api.exception.NacosException;
import com.yosamaru.kassadin.config.GatewayConfig;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.cloud.gateway.event.RefreshRoutesEvent;
import org.springframework.cloud.gateway.route.RouteDefinition;
import org.springframework.cloud.gateway.route.RouteDefinitionRepository;
import org.springframework.context.ApplicationEventPublisher;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

/**
 * Spring Cloud Gateway  中加载路由信息分别由以下几个类负责
 * <p>
 * PropertiesRouteDefinitionLocator：从配置文件中读取路由信息(如YML、Properties等)
 * RouteDefinitionRepository：从存储器中读取路由信息(如内存、配置中心、Redis、MySQL等)
 * DiscoveryClientRouteDefinitionLocator：从注册中心中读取路由信息(如Nacos、Eurka、Zookeeper等)
 * <p>
 * <p>
 * 自定义路由加载的实现类
 */
@Slf4j
public class NacosRouteDefinitionRepository implements RouteDefinitionRepository {

    private ApplicationEventPublisher publisher;

    private NacosConfigManager nacosConfigManager;

    public NacosRouteDefinitionRepository(ApplicationEventPublisher publisher, NacosConfigManager nacosConfigManager) {
        this.publisher = publisher;
        this.nacosConfigManager = nacosConfigManager;
        addListener();
    }

    @Override
    public Flux<RouteDefinition> getRouteDefinitions() {
        try {
            String config = nacosConfigManager.getConfigService().getConfig(GatewayConfig.NACOS_ROUTE_DATA_ID, GatewayConfig.NACOS_ROUTE_GROUP, 5000);
            List<RouteDefinition> routeDefinitions = getListByStr(config);
            return Flux.fromIterable(routeDefinitions);
        } catch (NacosException e) {
            log.error("获取RouteDefinition异常！", e);
        }
        return Flux.fromIterable(new ArrayList<>());
    }

    /**
     * 添加Nacos监听
     */
    private void addListener() {
        try {
            nacosConfigManager.getConfigService().addListener(GatewayConfig.NACOS_ROUTE_DATA_ID, GatewayConfig.NACOS_ROUTE_GROUP, new Listener() {
                @Override
                public Executor getExecutor() {
                    return null;
                }

                @Override
                public void receiveConfigInfo(String configInfo) {
                    publisher.publishEvent(new RefreshRoutesEvent(this));
                }
            });
        } catch (NacosException e) {
            log.error("Nacos添加监听异常！", e);
        }
    }

    @Override
    public Mono<Void> save(Mono<RouteDefinition> route) {
        return null;
    }

    @Override
    public Mono<Void> delete(Mono<String> routeId) {
        return null;
    }

    private List<RouteDefinition> getListByStr(String config) {
        if (StringUtils.isNotBlank(config)) {
            return JSONObject.parseArray(config, RouteDefinition.class);
        }
        return new ArrayList<>(0);
    }
}