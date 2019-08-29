# futamilktea-parent
基于spring-cloud的微服务框架

## 1.模块

```properties
futamilktea-common 公共包 放一些通用类
futamilktea-common-db 数据库包 包含数据库相关依赖
futamilktea-eureka eureka注册中心
futamilktea-gateway 网关 
futamilktea-service 服务模块 作为父模块引用一些依赖
futamilktea-service-account 用户相关业务
futamilktea-service-search 搜索相关业务(本意是给elasticsearch操作的)
futamilktea-service-api 接口模块 方便引用的
futamilktea-service-account-api 用户实体类包含feign远程调用接口
futamilktea-service-search-api 搜索相关实体类
```

## 2.使用的相关技术

一下两个技术都是方便操作数据库的

pageHelper 可以拦截sql 对查询进行分页

mybatis.tk 包含通用增删改查的方法,方便调用

```
pageHelper文档 https://pagehelper.github.io/docs/howtouse/
mybatis.tk文档 http://www.mybatis.tk/
```

