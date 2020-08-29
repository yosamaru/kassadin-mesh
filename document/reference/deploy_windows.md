# kassadin-swarm 在Windows环境下的部署

## 开发环境搭建

> `kassadin-swarm`中使用到的环境和`kassadin`项目中大致相同，具体可以查看[kassadin在Windows环境下的部署](https://github.com/macrozheng/kassadin-learning/blob/master/docs/deploy/kassadin_deploy_windows.md)。

简易环境搭建流程：

- 安装IDEA并导入项目源码；
- 安装MySql，创建一个`kassadin`数据库，并导入`/document/sql/kassadin.sql`文件；
- 安装Redis、Elasticsearch、MongoDB、RabbitMQ等环境。

## 项目部署

> `kassadin-swarm`项目启动有先后顺序，大家要按照以下顺序启动。

### 启动注册中心`kassadin-registory`

- 直接运行com.yosamaru.kassadin.kassadinRegistryApplication的main函数即可；
- 运行完成后可以通过注册中心控制台查看：http://localhost:8001

### 启动配置中心`kassadin-config`

- 直接运行com.yosamaru.kassadin.kassadinConfigApplication的main函数即可；
- 访问以下接口获取kassadin-admin在dev环境下的配置信息：http://localhost:8301/master/admin-dev.yml

### 启动监控中心`kassadin-monitor`

- 直接运行com.yosamaru.kassadin.kassadinMonitorApplication的main函数即可；
- 运行完成后可以通过监控中心控制台查看：http://localhost:8101
- 输入账号密码`macro:123456`可以登录查看。

### 启动网关服务`kassadin-gateway`

- 直接运行com.yosamaru.kassadin.kassadinGatewayApplication的main函数即可；
- 访问以下接口获取动态路由规则：http://localhost:8201/actuator/gateway/routes

### 启动后台管理服务`kassadin-admin`

- 直接运行com.yosamaru.kassadin.kassadinAdminApplication的main函数即可；
- 通过`kassadin-gateway`网关服务访问接口文档：http://localhost:8201/kassadin-admin/swagger-ui.html

![](../resource/kassadin_swarm_windows_06.png)

- 登录接口地址：http://localhost:8201/kassadin-admin/admin/login
- 访问登录接口获取到token后放入认证的头信息即可正常访问其他需要登录的接口：

![](../resource/kassadin_swarm_windows_09.png)

### 启动前台服务`kassadin-portal`

- 直接运行com.yosamaru.kassadin.portal.kassadinPortalApplication的main函数即可；
- 通过`kassadin-gateway`网关服务访问接口文档：http://localhost:8201/kassadin-portal/swagger-ui.html

![](../resource/kassadin_swarm_windows_07.png)

- 登录接口地址：http://localhost:8201/kassadin-portal/sso/login
- 调用需要登录的接口方式同`kassadin-admin`。

### 启动搜索服务`kassadin-search`

- 直接运行com.yosamaru.kassadin.search.kassadinSearchApplication的main函数即可；
- 通过`kassadin-gateway`网关服务访问接口文档：http://localhost:8201/kassadin-search/swagger-ui.html

![](../resource/kassadin_swarm_windows_10.png)

### 启动测试服务`kassadin-demo`

- 直接运行com.yosamaru.kassadin.kassadinAdminApplication的main函数即可；
- 通过`kassadin-gateway`网关服务访问接口文档：http://localhost:8201/kassadin-demo/swagger-ui.html

![](../resource/kassadin_swarm_windows_08.png)

- 可以通过调用FeignAdminController、FeignPortalController、FeignSearchController来测试使用Feign的远程调用功能。

## 效果展示

- 注册中心服务信息：

![](../resource/kassadin_swarm_windows_01.png)

- 监控中心服务概览信息：

![](../resource/kassadin_swarm_windows_02.png)

![](../resource/kassadin_swarm_windows_03.png)

- 监控中心单应用详情信息：

![](../resource/kassadin_swarm_windows_04.png)

![](../resource/kassadin_swarm_windows_05.png)


