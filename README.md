## tw-wade架构说明:Web Application Developer Environment Plus

## 平台简介

* 采用前后端分离的模式，微服务版本前端(基于 [springcloud]。
* 后端采用Spring Boot、Spring Cloud & Alibaba。
* 注册中心、配置中心选型Nacos，权限认证使用Redis。
* 流量控制框架选型Sentinel。

#### 核心依赖

| 依赖                   | 版本          |
| ---------------------- | ------------- |
| Spring Boot            | 2.3.4.RELEASE |
| Spring Cloud           | Hoxton.SR8    |
| Spring Security OAuth2 | 2.3.6         |
| mybatis                | 2.1.3         |



## 系统模块

~~~
com.twwade     
├── twwade-ui              // 前端框架 [80]
│ 
├── twwade-common          // 通用模块
│       └── twwade-common-core                         // 核心模块
│       └── twwade-common-datascope                    // 权限范围
│       └── twwade-common-log                          // 日志记录
│       └── twwade-common-redis                        // 缓存服务
│       └── twwade-common-security                     // 安全模块
│  
├── twwade-business           // 业务模块
│       └── twwade-system                              // 系统模块 [9204]
│       └── twwade-template                            // 标准文本管理模块[9205]
│       └── twwade-scene                               // scene场景管理模块 [9206]
│       └── twwade-report                              // 综合查询模块 [9207]
│       └── twwade-demo                                // demo模块 [9999]
│       └── twwade-demo                                // 系统模块 [9208]
│       └── twwade-gen                                 // 代码生成 [9203]
│	 └── twwade-api                                 // 接口API模块
│		    └── twwade-api-system                	// 系统接口
│       
├── twwade-platform          // 微服务平台公共组件
│       └── twwade-gateway                             // 网关模块 [9100]
│		└── twwade-auth                                // 认证中心 [9101]
│		└── twwade-monitor                      // 监控中心 [9102]
├── twwade-components       // 组件化
│       └── twwade-xxx                      // xxx [xxx]
├──pom.xml                  // 公共依赖
├── doc                   // 文档
├── db                    // 数据库脚本
~~~



## 内置功能

1.  操作日志：系统正常操作日志记录和查询；系统异常信息日志记录和查询。
2.  登录日志：系统登录日志记录查询包含登录异常。
3.  代码生成：前后端代码的生成（java、html、xml、sql）支持CRUD下载 。
4.  系统接口：根据业务代码自动生成相关的api接口文档。
5.  服务监控：监视当前系统CPU、内存、磁盘、堆栈等相关信息。
6.  在线构建器：拖动表单元素生成相应的HTML代码。
7.  连接池监视：监视当前系统数据库连接池状态，可进行分析SQL找出系统性能瓶颈。

## 启动方法地址

1.先启动nacos服务
导入db目录下面的nacos_config.sql文件到mysql数据库nacos_config中.
修改TwWade-Cloud\nacos\conf\application.properties数据库配置.
bin目录执行：sh startup.sh -m standalone
访问地址：http://localhost:8848/nacos
账号密码：nacos/nacos

2.启动redis
\TwWade-Cloud\redis

3.启动网关，授权，系统管理系统等等

## 测试方法
1.登陆地址：http://127.0.0.1:9100/auth/login
输入json参数
{
    "username": "admin",
    "password": "admin123",
    "code": "54",
    "uuid": "1e4f3a7022cf4613b37ef4813b50876d"
}

返回:
{
    "code": 200,
    "msg": null,
    "data": {
        "access_token": "9a6f13fe-3343-4d62-a9ef-d3c30988f4a0",
        "expires_in": 43200
    }
}

2.访问业务接口：把登陆接口返回的access_token，放入head里面
key/value
Authorization Bearer 19c98be0-31af-4047-8824-7a1193636f61
实例:
http://127.0.0.1:9100/demo/user/list
开发时添加head参数:dev-version

3.限流控制台
http://localhost:8080/#/dashboard/
登陆名为sentinel，密码为sentinel

4.接口文档生成
http://apidocjs.com
安装
npm  install apidoc -g
生成
apidoc -i msb-modules/ -o apidoc/
