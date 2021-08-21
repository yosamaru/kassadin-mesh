package com.yosamaru.admin.config;

import com.yosamaru.redis.RedisHandler;
import lombok.extern.slf4j.Slf4j;
import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.oauth2.common.exceptions.InvalidClientException;
import org.springframework.security.oauth2.provider.ClientDetails;
import org.springframework.security.oauth2.provider.client.BaseClientDetails;
import org.springframework.security.oauth2.provider.client.JdbcClientDetailsService;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.io.IOException;


@Slf4j
@Component
public class ClientDetailsServiceImpl extends JdbcClientDetailsService {

    @Autowired
    private RedisHandler redisHandler;

    @Autowired
    private ObjectMapper objectMapper;

    public ClientDetailsServiceImpl(DataSource dataSource) {
        super(dataSource);
    }

    @Override
    public ClientDetails loadClientByClientId(String clientId) throws InvalidClientException {
        ClientDetails client = getClientDetails(clientId);
        if (client != null) {
            return client;
        } else {
            client = super.loadClientByClientId(clientId);
            setClientDetails(clientId, client);
        }
        return client;
    }

    /**
     * 缓存中保存
     * @param clientId
     * @param clientDetails
     */
    private void setClientDetails(final String clientId, final ClientDetails clientDetails) {
        String s = null;
        try {
            s = objectMapper.writeValueAsString(clientDetails);
        } catch (IOException e) {
            log.error(e.getMessage());
        }
        redisHandler.set(clientId, s);
    }

    /**
     * 缓存中获取
     * @param clientId
     * @return
     */
    private BaseClientDetails getClientDetails(final String clientId) {
        BaseClientDetails baseClient = null;
        String object = redisHandler.get(clientId);
        if (object != null) {
            try {
                baseClient = objectMapper.readValue(object, BaseClientDetails.class);
            } catch (IOException e) {
                log.error(e.getMessage());
            }
        }
        return baseClient;
    }
}
