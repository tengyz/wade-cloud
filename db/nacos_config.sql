/*
 Navicat Premium Data Transfer

 Source Server         : 39.108.82.198--3307--zmd
 Source Server Type    : MySQL
 Source Server Version : 50715
 Source Host           : 39.108.82.198:3307
 Source Schema         : nacos_config

 Target Server Type    : MySQL
 Target Server Version : 50715
 File Encoding         : 65001

 Date: 16/04/2021 18:26:21
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for config_info
-- ----------------------------
DROP TABLE IF EXISTS `config_info`;
CREATE TABLE `config_info`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `data_id` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL COMMENT 'data_id',
  `group_id` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL,
  `content` longtext CHARACTER SET utf8 COLLATE utf8_bin NOT NULL COMMENT 'content',
  `md5` varchar(32) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL COMMENT 'md5',
  `gmt_create` datetime(0) NOT NULL DEFAULT CURRENT_TIMESTAMP(0) COMMENT '创建时间',
  `gmt_modified` datetime(0) NOT NULL DEFAULT CURRENT_TIMESTAMP(0) COMMENT '修改时间',
  `src_user` text CHARACTER SET utf8 COLLATE utf8_bin NULL COMMENT 'source user',
  `src_ip` varchar(20) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL COMMENT 'source ip',
  `app_name` varchar(128) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL,
  `tenant_id` varchar(128) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT '' COMMENT '租户字段',
  `c_desc` varchar(256) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL,
  `c_use` varchar(64) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL,
  `effect` varchar(64) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL,
  `type` varchar(64) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL,
  `c_schema` text CHARACTER SET utf8 COLLATE utf8_bin NULL,
  PRIMARY KEY (`id`) USING BTREE,
  UNIQUE INDEX `uk_configinfo_datagrouptenant`(`data_id`, `group_id`, `tenant_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 100 CHARACTER SET = utf8 COLLATE = utf8_bin COMMENT = 'config_info' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of config_info
-- ----------------------------
INSERT INTO `config_info` VALUES (1, 'application-dev.yml', 'DEFAULT_GROUP', 'spring:\n  main:\n    allow-bean-definition-overriding: true\n\n#请求处理的超时时间\nribbon:\n  ReadTimeout: 10000\n  ConnectTimeout: 10000\n\n# feign 配置\nfeign:\n  sentinel:\n    enabled: true\n  okhttp:\n    enabled: true\n  httpclient:\n    enabled: false\n  client:\n    config:\n      default:\n        connectTimeout: 10000\n        readTimeout: 10000\n  compression:\n    request:\n      enabled: true\n    response:\n      enabled: true\n# 暴露监控端点\nmanagement:\n  endpoints:\n    web:\n      exposure:\n        include: \'*\'\n\n\n\n', 'feb1ae168b1bcee6bd74e75ec97f185c', '2019-11-29 16:31:20', '2020-11-28 04:31:43', NULL, '192.168.186.1', '', '', '通用配置', 'null', 'null', 'yaml', 'null');
INSERT INTO `config_info` VALUES (2, 'twwade-gateway-dev.yml', 'DEFAULT_GROUP', 'spring:\r\n  redis:\r\n    host: 127.0.0.1\r\n    port: 6379\r\n    password: 123456\r\n  cloud:\r\n    gateway:\r\n      discovery:\r\n        locator:\r\n          lowerCaseServiceId: true\r\n          enabled: true\r\n      routes:\r\n        # 认证中心\r\n        - id: twwade-auth\r\n          uri: lb://twwade-auth\r\n          predicates:\r\n            - Path=/auth/**\r\n          filters:\r\n            # 验证码处理\r\n            - CacheRequestFilter\r\n            - ValidateCodeFilter\r\n            - StripPrefix=1\r\n        # 代码生成\r\n        - id: twwade-gen\r\n          uri: lb://twwade-gen\r\n          predicates:\r\n            - Path=/code/**\r\n          filters:\r\n            - StripPrefix=1\r\n        # 系统模块\r\n        - id: twwade-system\r\n          uri: lb://twwade-system\r\n          predicates:\r\n            - Path=/system/**\r\n          filters:\r\n            - StripPrefix=1\r\n        # 示例demo模块\r\n        - id: twwade-demo\r\n          uri: lb://twwade-demo\r\n          predicates:\r\n            - Path=/demo/**\r\n          filters:\r\n            - StripPrefix=1\r\n\r\n# 不校验白名单\r\nignore:\r\n  whites:\r\n    - /auth/logout\r\n    - /auth/login\r\n    - /csrf\r\n    - /user/createTree\r\n    - /user/getAuthCode\r\n', 'c685de52a4327dd9624390a67e4696fc', '2020-05-14 14:17:55', '2021-04-16 18:21:09', NULL, '127.0.0.1', '', '', '网关模块', 'null', 'null', 'yaml', 'null');
INSERT INTO `config_info` VALUES (3, 'twwade-auth-dev.yml', 'DEFAULT_GROUP', 'spring: \r\n  redis:\r\n    host: 127.0.0.1\r\n    port: 32704\r\n    password: 1234567\r\n    # 连接超时时间（毫秒）\r\n    timeout: 3600\r\n    jedis:\r\n      pool:\r\n        max-wait: 3600\r\n        max-active: 1\r\n        min-idle: 1\r\n        max-idle: 1\r\n  shardingsphere:\r\n      enabled: true\r\n      datasource:\r\n        names: master,slave1\r\n        master:\r\n          type: com.alibaba.druid.pool.DruidDataSource\r\n          driver-class-name: com.mysql.cj.jdbc.Driver\r\n          url: jdbc:mysql://127.0.0.1:3306/tkdata?useUnicode=true&characterEncoding=utf8&tinyInt1isBit=false&useSSL=false&serverTimezone=GMT\r\n          username: root\r\n          password: 123456\r\n          maximum-pool-size: 1\r\n        slave1:\r\n          type: com.alibaba.druid.pool.DruidDataSource\r\n          driver-class-name: com.mysql.cj.jdbc.Driver\r\n          url: jdbc:mysql://127.0.0.1:3306/tkdata?useUnicode=true&characterEncoding=utf8&tinyInt1isBit=false&useSSL=false&serverTimezone=GMT\r\n          username: root\r\n          password: 123456\r\n          maximum-pool-size: 1\r\n\r\n      #  读写分离\r\n      masterslave:\r\n        name: db1s2 #读写分离数据源名称\r\n        masterDataSourceName: master #主库数据源名称\r\n        slaveDataSourceNames: slave1 #从库数据源名称列表\r\n        loadBalanceAlgorithmType: ROUND_ROBIN #从库负载均衡算法类型，可选值：ROUND_ROBIN，RANDOM。若`loadBalanceAlgorithmClassName`存在则忽略该配置\r\n      props:\r\n        sql: # 开启SQL显示，默认值: false，注意：仅配置读写分离时不会打印日志！！！\r\n          show: true\r\n      sharding:\r\n        default-data-source-name: slave1\r\n \r\n#mybatis plus\r\nmybatis-plus:\r\n  mapper-locations: classpath:mapper/**\r\n  #实体扫描，多个package用逗号或者分号分隔\r\n  #typeAliasesPackage: com.chinaunicom\r\n  global-config:\r\n    #刷新mapper 调试神器\r\n    db-config:\r\n      #主键类型  0:\"数据库ID自增\", 1:\"用户输入ID\",2:\"全局唯一ID (数字类型唯一ID)\", 3:\"全局唯一ID UUID\";\r\n      id-type: AUTO\r\n      #字段策略 0:\"忽略判断\",1:\"非 NULL 判断\"),2:\"非空判断\"\r\n      field-strategy: not_empty\r\n      #驼峰下划线转换\r\n      column-underline: true\r\n      #数据库大写下划线转换\r\n      #capital-mode: true\r\n      #逻辑删除配置\r\n      logic-delete-value: 1\r\n      logic-not-delete-value: 0\r\n      db-type: mysql\r\n    refresh: true\r\n  configuration:\r\n    map-underscore-to-camel-case: true\r\n    cache-enabled: false\r\n    # 开启mybatis sql打印\r\n    log-impl: org.apache.ibatis.logging.stdout.StdOutImpl\r\n  #配置feign调用\r\nfeign:\r\n  hystrix:\r\n    enabled: true\r\n  #okhttp:\r\n  #  enabled: false #远程调用使用OKHttp，需要导入OKHttp架包\r\n  #  httpclient:\r\n  #  enabled: false #远程调用使用HttpClient，需要导入HttpClient架包\r\n\r\n#配置负载，该处的时间需要小于熔断的时间，总的执行时间不会超过hystrix熔断时间\r\nribbon:\r\n  ConnectTimeout: 1500 #ribbon 连接服务超时时长\r\n  ReadTimeout: 6000 #ribbon 读取超时时长\r\n  MaxAutoRetries: 1  #请求当前服务重试次数\r\n  MaxAutoRetriesNextServer: 1 #切换服务重试次数，需要有多个服务\r\n  #OkToRetryOnAllOperations: false #对于get请求，连接超时后会进入重试，而POST和PUT等请求不会重试，慎重使用该项\r\n  #eureka:\r\n  #  enabled: false #使用eureka服务端负载\r\n\r\n#配置熔断时间，大于该时间时，自动触发熔断\r\nhystrix:\r\n  command:\r\n    default:\r\n      execution:\r\n        isolation:\r\n          thread:\r\n            timeoutInMilliseconds: 18000 # 全局熔断超时时长：6s', 'eb666e5df7eaa16ed246ab045155812b', '2020-05-14 13:20:49', '2021-04-16 18:22:37', NULL, '127.0.0.1', '', '', '认证中心', 'null', 'null', 'yaml', 'null');
INSERT INTO `config_info` VALUES (4, 'twwade-monitor-dev.yml', 'DEFAULT_GROUP', '# Spring\r\nspring: \r\n  security:\r\n    user:\r\n      name: tw\r\n      password: 1qazXSW@\r\n  boot:\r\n    admin:\r\n      ui:\r\n        title: tw-wade服务状态监控\r\n  redis:\r\n    host: 127.0.0.1\r\n    port: 6379\r\n    password: 123456\r\n  shardingsphere:\r\n      enabled: true\r\n      datasource:\r\n        names: master,slave1\r\n        master:\r\n          type: com.alibaba.druid.pool.DruidDataSource\r\n          driver-class-name: com.mysql.cj.jdbc.Driver\r\n          url: jdbc:mysql://127.0.0.1:3306/test?useUnicode=true&characterEncoding=utf8&tinyInt1isBit=false&useSSL=false&serverTimezone=GMT\r\n          username: root\r\n          password: 123456\r\n          maximum-pool-size: 1\r\n        slave1:\r\n          type: com.alibaba.druid.pool.DruidDataSource\r\n          driver-class-name: com.mysql.cj.jdbc.Driver\r\n          url: jdbc:mysql://127.0.0.1:3306/test?useUnicode=true&characterEncoding=utf8&tinyInt1isBit=false&useSSL=false&serverTimezone=GMT\r\n          username: root\r\n          password: 123456\r\n          maximum-pool-size: 1\r\n\r\n      #  读写分离\r\n      masterslave:\r\n        name: db1s2 #读写分离数据源名称\r\n        masterDataSourceName: master #主库数据源名称\r\n        slaveDataSourceNames: slave1 #从库数据源名称列表\r\n        loadBalanceAlgorithmType: ROUND_ROBIN #从库负载均衡算法类型，可选值：ROUND_ROBIN，RANDOM。若`loadBalanceAlgorithmClassName`存在则忽略该配置\r\n      props:\r\n        sql: # 开启SQL显示，默认值: false，注意：仅配置读写分离时不会打印日志！！！\r\n          show: true\r\n      sharding:\r\n        default-data-source-name: slave1\r\n \r\n#mybatis plus\r\nmybatis-plus:\r\n  mapper-locations: classpath:/mapper/*.xml\r\n  #实体扫描，多个package用逗号或者分号分隔\r\n  #typeAliasesPackage: com.chinaunicom\r\n  global-config:\r\n    #刷新mapper 调试神器\r\n    db-config:\r\n      #主键类型  0:\"数据库ID自增\", 1:\"用户输入ID\",2:\"全局唯一ID (数字类型唯一ID)\", 3:\"全局唯一ID UUID\";\r\n      id-type: AUTO\r\n      #字段策略 0:\"忽略判断\",1:\"非 NULL 判断\"),2:\"非空判断\"\r\n      field-strategy: not_empty\r\n      #驼峰下划线转换\r\n      column-underline: true\r\n      #数据库大写下划线转换\r\n      #capital-mode: true\r\n      #逻辑删除配置\r\n      logic-delete-value: 1\r\n      logic-not-delete-value: 0\r\n      db-type: mysql\r\n    refresh: true\r\n  configuration:\r\n    map-underscore-to-camel-case: true\r\n    cache-enabled: false\r\n    # 开启mybatis sql打印\r\n    log-impl: org.apache.ibatis.logging.stdout.StdOutImpl', 'fff7f15ce0c4b4ca7e621f947008f44e', '2020-05-19 15:14:01', '2021-04-16 18:23:52', NULL, '127.0.0.1', '', '', '监控中心', 'null', 'null', 'yaml', 'null');
INSERT INTO `config_info` VALUES (5, 'twwade-system-dev.yml', 'DEFAULT_GROUP', '#日志文件\r\n#logging:\r\n#  config: classpath:pro_log4j.xml\r\n#设置远程fegin接口调用本地的\r\nsystem_api_url: \"\"\r\n\r\n# Spring\r\nspring:\r\n  redis:\r\n    host: 127.0.0.1\r\n    port: 6379\r\n    password: 1234567\r\n  shardingsphere:\r\n      enabled: true\r\n      datasource:\r\n        names: master,slave1\r\n        master:\r\n          type: com.alibaba.druid.pool.DruidDataSource\r\n          driver-class-name: com.mysql.cj.jdbc.Driver\r\n          url: jdbc:mysql://10.242.31.199:3079/tkdata?useUnicode=true&characterEncoding=utf8&tinyInt1isBit=false&useSSL=false&serverTimezone=GMT\r\n          username: root\r\n          password: mlaw@2019*Tw\r\n          filters: stat,wall,config,log4j\r\n          maxActive: 10\r\n          minIdle: 6\r\n          initialSize: 6\r\n          maxWait: 60000\r\n          removeAbandoned: true\r\n          removeAbandonedTimeout: 1800\r\n          timeBetweenEvictionRunsMillis: 300000\r\n          minEvictableIdleTimeMillis: 900000\r\n          validationQuery: select \'x\'\r\n          testOnBorrow: true\r\n          testOnReturn: true\r\n          testWhileIdle: true\r\n          keepAlive: true\r\n          poolPreparedStatements: false\r\n          maxOpenPreparedStatements: -1\r\n          maxPoolPreparedStatementPerConnectionSize: 10\r\n          useGlobalDataSourceStat: true\r\n          connectProperties: druid.stat.mergeSql=true;druid.stat.slowSqlMillis=500\r\n        slave1:\r\n          type: com.alibaba.druid.pool.DruidDataSource\r\n          driver-class-name: com.mysql.cj.jdbc.Driver\r\n          url: jdbc:mysql://10.242.31.199:3079/tkdata?useUnicode=true&characterEncoding=utf8&tinyInt1isBit=false&useSSL=false&serverTimezone=GMT\r\n          username: root\r\n          password: mlaw@2019*Tw\r\n          filters: stat,wall,config,log4j\r\n          maxActive: 10\r\n          minIdle: 6\r\n          initialSize: 6\r\n          maxWait: 60000\r\n          removeAbandoned: true\r\n          removeAbandonedTimeout: 1800\r\n          timeBetweenEvictionRunsMillis: 300000\r\n          minEvictableIdleTimeMillis: 900000\r\n          validationQuery: select \'x\'\r\n          testOnBorrow: true\r\n          testOnReturn: true\r\n          testWhileIdle: true\r\n          keepAlive: true\r\n          poolPreparedStatements: false\r\n          maxOpenPreparedStatements: -1\r\n          maxPoolPreparedStatementPerConnectionSize: 10\r\n          useGlobalDataSourceStat: true\r\n          connectProperties: druid.stat.mergeSql=true;druid.stat.slowSqlMillis=500\r\n\r\n      #  读写分离\r\n      masterslave:\r\n        name: db1s2 #读写分离数据源名称\r\n        masterDataSourceName: master #主库数据源名称\r\n        slaveDataSourceNames: slave1 #从库数据源名称列表\r\n        loadBalanceAlgorithmType: ROUND_ROBIN #从库负载均衡算法类型，可选值：ROUND_ROBIN，RANDOM。若`loadBalanceAlgorithmClassName`存在则忽略该配置\r\n      props:\r\n        sql: # 开启SQL显示，默认值: false，注意：仅配置读写分离时不会打印日志！！！\r\n          show: true\r\n      sharding:\r\n        default-data-source-name: slave1\r\n \r\n#mybatis plus\r\nmybatis-plus:\r\n  mapper-locations: classpath:/mapper/*.xml\r\n  #实体扫描，多个package用逗号或者分号分隔\r\n  #typeAliasesPackage: com.chinaunicom\r\n  global-config:\r\n    #刷新mapper 调试神器\r\n    db-config:\r\n      #主键类型  0:\"数据库ID自增\", 1:\"用户输入ID\",2:\"全局唯一ID (数字类型唯一ID)\", 3:\"全局唯一ID UUID\";\r\n      id-type: AUTO\r\n      #字段策略 0:\"忽略判断\",1:\"非 NULL 判断\"),2:\"非空判断\"\r\n      field-strategy: not_empty\r\n      #驼峰下划线转换\r\n      column-underline: true\r\n      #数据库大写下划线转换\r\n      #capital-mode: true\r\n      #逻辑删除配置\r\n      logic-delete-value: 1\r\n      logic-not-delete-value: 0\r\n      db-type: mysql\r\n    refresh: true\r\n  configuration:\r\n    map-underscore-to-camel-case: true\r\n    cache-enabled: false\r\n    # 开启mybatis sql打印\r\n    log-impl: org.apache.ibatis.logging.stdout.StdOutImpl\r\n    # 关闭一级缓存\r\n    local-cache-scope: statement\r\n\r\nprofiles:\r\n    active: dev #设置当前环境为dev', 'f6e76eb1661957ca057e695097456008', '2020-05-14 13:37:04', '2021-04-16 18:19:34', NULL, '127.0.0.1', '', '', '系统模块', 'null', 'null', 'yaml', 'null');
INSERT INTO `config_info` VALUES (8, 'sentinel-twwade-gateway', 'DEFAULT_GROUP', '[\r\n    {\r\n        \"resource\": \"twwade-auth\",\r\n        \"count\": 500,\r\n        \"grade\": 1,\r\n        \"limitApp\": \"default\",\r\n        \"strategy\": 0,\r\n        \"controlBehavior\": 0\r\n    },\r\n	{\r\n        \"resource\": \"twwade-system\",\r\n        \"count\": 1000,\r\n        \"grade\": 1,\r\n        \"limitApp\": \"default\",\r\n        \"strategy\": 0,\r\n        \"controlBehavior\": 0\r\n    },\r\n	{\r\n        \"resource\": \"twwade-gen\",\r\n        \"count\": 200,\r\n        \"grade\": 1,\r\n        \"limitApp\": \"default\",\r\n        \"strategy\": 0,\r\n        \"controlBehavior\": 0\r\n    }\r\n]', '3be6c56494d0846d8e5bbf1fb0ac0faa', '2020-06-09 12:14:01', '2020-10-21 15:56:01', NULL, '0:0:0:0:0:0:0:1', '', '', 'null', 'null', 'null', 'json', 'null');
INSERT INTO `config_info` VALUES (34, 'twwade-demo-dev.yml', 'DEFAULT_GROUP', '# Spring\r\nspring: \r\n  redis:\r\n    host: 127.0.0.1\r\n    port: 6379\r\n    password: 123456\r\n  shardingsphere:\r\n      enabled: true\r\n      datasource:\r\n        names: master,slave1\r\n        master:\r\n          type: com.alibaba.druid.pool.DruidDataSource\r\n          driver-class-name: com.mysql.cj.jdbc.Driver\r\n          url: jdbc:mysql://127.0.0.1:3306/test?useUnicode=true&characterEncoding=utf8&tinyInt1isBit=false&useSSL=false&serverTimezone=GMT\r\n          username: root\r\n          password: 123456\r\n          maximum-pool-size: 1\r\n        slave1:\r\n          type: com.alibaba.druid.pool.DruidDataSource\r\n          driver-class-name: com.mysql.cj.jdbc.Driver\r\n          url: jdbc:mysql://127.0.0.1:3306/test?useUnicode=true&characterEncoding=utf8&tinyInt1isBit=false&useSSL=false&serverTimezone=GMT\r\n          username: root\r\n          password: 123456\r\n          maximum-pool-size: 1\r\n\r\n      #  读写分离\r\n      masterslave:\r\n        name: db1s2 #读写分离数据源名称\r\n        masterDataSourceName: master #主库数据源名称\r\n        slaveDataSourceNames: slave1 #从库数据源名称列表\r\n        loadBalanceAlgorithmType: ROUND_ROBIN #从库负载均衡算法类型，可选值：ROUND_ROBIN，RANDOM。若`loadBalanceAlgorithmClassName`存在则忽略该配置\r\n      props:\r\n        sql: # 开启SQL显示，默认值: false，注意：仅配置读写分离时不会打印日志！！！\r\n          show: true\r\n      sharding:\r\n        default-data-source-name: slave1\r\n \r\n#mybatis plus\r\nmybatis-plus:\r\n  mapper-locations: classpath:/mapper/*.xml\r\n  #实体扫描，多个package用逗号或者分号分隔\r\n  #typeAliasesPackage: com.chinaunicom\r\n  global-config:\r\n    #刷新mapper 调试神器\r\n    db-config:\r\n      #主键类型  0:\"数据库ID自增\", 1:\"用户输入ID\",2:\"全局唯一ID (数字类型唯一ID)\", 3:\"全局唯一ID UUID\";\r\n      id-type: AUTO\r\n      #字段策略 0:\"忽略判断\",1:\"非 NULL 判断\"),2:\"非空判断\"\r\n      field-strategy: not_empty\r\n      #驼峰下划线转换\r\n      column-underline: true\r\n      #数据库大写下划线转换\r\n      #capital-mode: true\r\n      #逻辑删除配置\r\n      logic-delete-value: 1\r\n      logic-not-delete-value: 0\r\n      db-type: mysql\r\n    refresh: true\r\n  configuration:\r\n    map-underscore-to-camel-case: true\r\n    cache-enabled: false\r\n    # 开启mybatis sql打印\r\n    log-impl: org.apache.ibatis.logging.stdout.StdOutImpl', 'ffc4cca91f3399cb56e4bd093055d627', '2020-10-23 10:16:53', '2021-04-16 18:25:09', NULL, '127.0.0.1', '', '', '示例', 'null', 'null', 'yaml', 'null');

-- ----------------------------
-- Table structure for config_info_aggr
-- ----------------------------
DROP TABLE IF EXISTS `config_info_aggr`;
CREATE TABLE `config_info_aggr`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `data_id` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL COMMENT 'data_id',
  `group_id` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL COMMENT 'group_id',
  `datum_id` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL COMMENT 'datum_id',
  `content` longtext CHARACTER SET utf8 COLLATE utf8_bin NOT NULL COMMENT '内容',
  `gmt_modified` datetime(0) NOT NULL COMMENT '修改时间',
  `app_name` varchar(128) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL,
  `tenant_id` varchar(128) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT '' COMMENT '租户字段',
  PRIMARY KEY (`id`) USING BTREE,
  UNIQUE INDEX `uk_configinfoaggr_datagrouptenantdatum`(`data_id`, `group_id`, `tenant_id`, `datum_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_bin COMMENT = '增加租户字段' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of config_info_aggr
-- ----------------------------

-- ----------------------------
-- Table structure for config_info_beta
-- ----------------------------
DROP TABLE IF EXISTS `config_info_beta`;
CREATE TABLE `config_info_beta`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `data_id` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL COMMENT 'data_id',
  `group_id` varchar(128) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL COMMENT 'group_id',
  `app_name` varchar(128) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL COMMENT 'app_name',
  `content` longtext CHARACTER SET utf8 COLLATE utf8_bin NOT NULL COMMENT 'content',
  `beta_ips` varchar(1024) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL COMMENT 'betaIps',
  `md5` varchar(32) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL COMMENT 'md5',
  `gmt_create` datetime(0) NOT NULL DEFAULT CURRENT_TIMESTAMP(0) COMMENT '创建时间',
  `gmt_modified` datetime(0) NOT NULL DEFAULT CURRENT_TIMESTAMP(0) COMMENT '修改时间',
  `src_user` text CHARACTER SET utf8 COLLATE utf8_bin NULL COMMENT 'source user',
  `src_ip` varchar(20) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL COMMENT 'source ip',
  `tenant_id` varchar(128) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT '' COMMENT '租户字段',
  PRIMARY KEY (`id`) USING BTREE,
  UNIQUE INDEX `uk_configinfobeta_datagrouptenant`(`data_id`, `group_id`, `tenant_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_bin COMMENT = 'config_info_beta' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of config_info_beta
-- ----------------------------

-- ----------------------------
-- Table structure for config_info_tag
-- ----------------------------
DROP TABLE IF EXISTS `config_info_tag`;
CREATE TABLE `config_info_tag`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `data_id` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL COMMENT 'data_id',
  `group_id` varchar(128) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL COMMENT 'group_id',
  `tenant_id` varchar(128) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT '' COMMENT 'tenant_id',
  `tag_id` varchar(128) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL COMMENT 'tag_id',
  `app_name` varchar(128) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL COMMENT 'app_name',
  `content` longtext CHARACTER SET utf8 COLLATE utf8_bin NOT NULL COMMENT 'content',
  `md5` varchar(32) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL COMMENT 'md5',
  `gmt_create` datetime(0) NOT NULL DEFAULT CURRENT_TIMESTAMP(0) COMMENT '创建时间',
  `gmt_modified` datetime(0) NOT NULL DEFAULT CURRENT_TIMESTAMP(0) COMMENT '修改时间',
  `src_user` text CHARACTER SET utf8 COLLATE utf8_bin NULL COMMENT 'source user',
  `src_ip` varchar(20) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL COMMENT 'source ip',
  PRIMARY KEY (`id`) USING BTREE,
  UNIQUE INDEX `uk_configinfotag_datagrouptenanttag`(`data_id`, `group_id`, `tenant_id`, `tag_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_bin COMMENT = 'config_info_tag' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of config_info_tag
-- ----------------------------

-- ----------------------------
-- Table structure for config_tags_relation
-- ----------------------------
DROP TABLE IF EXISTS `config_tags_relation`;
CREATE TABLE `config_tags_relation`  (
  `id` bigint(20) NOT NULL COMMENT 'id',
  `tag_name` varchar(128) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL COMMENT 'tag_name',
  `tag_type` varchar(64) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL COMMENT 'tag_type',
  `data_id` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL COMMENT 'data_id',
  `group_id` varchar(128) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL COMMENT 'group_id',
  `tenant_id` varchar(128) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT '' COMMENT 'tenant_id',
  `nid` bigint(20) NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`nid`) USING BTREE,
  UNIQUE INDEX `uk_configtagrelation_configidtag`(`id`, `tag_name`, `tag_type`) USING BTREE,
  INDEX `idx_tenant_id`(`tenant_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_bin COMMENT = 'config_tag_relation' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of config_tags_relation
-- ----------------------------

-- ----------------------------
-- Table structure for group_capacity
-- ----------------------------
DROP TABLE IF EXISTS `group_capacity`;
CREATE TABLE `group_capacity`  (
  `id` bigint(20) UNSIGNED NOT NULL AUTO_INCREMENT COMMENT '主键ID',
  `group_id` varchar(128) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL DEFAULT '' COMMENT 'Group ID，空字符表示整个集群',
  `quota` int(10) UNSIGNED NOT NULL DEFAULT 0 COMMENT '配额，0表示使用默认值',
  `usage` int(10) UNSIGNED NOT NULL DEFAULT 0 COMMENT '使用量',
  `max_size` int(10) UNSIGNED NOT NULL DEFAULT 0 COMMENT '单个配置大小上限，单位为字节，0表示使用默认值',
  `max_aggr_count` int(10) UNSIGNED NOT NULL DEFAULT 0 COMMENT '聚合子配置最大个数，，0表示使用默认值',
  `max_aggr_size` int(10) UNSIGNED NOT NULL DEFAULT 0 COMMENT '单个聚合数据的子配置大小上限，单位为字节，0表示使用默认值',
  `max_history_count` int(10) UNSIGNED NOT NULL DEFAULT 0 COMMENT '最大变更历史数量',
  `gmt_create` datetime(0) NOT NULL DEFAULT CURRENT_TIMESTAMP(0) COMMENT '创建时间',
  `gmt_modified` datetime(0) NOT NULL DEFAULT CURRENT_TIMESTAMP(0) COMMENT '修改时间',
  PRIMARY KEY (`id`) USING BTREE,
  UNIQUE INDEX `uk_group_id`(`group_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_bin COMMENT = '集群、各Group容量信息表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of group_capacity
-- ----------------------------

-- ----------------------------
-- Table structure for his_config_info
-- ----------------------------
DROP TABLE IF EXISTS `his_config_info`;
CREATE TABLE `his_config_info`  (
  `id` bigint(64) UNSIGNED NOT NULL,
  `nid` bigint(20) UNSIGNED NOT NULL AUTO_INCREMENT,
  `data_id` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL,
  `group_id` varchar(128) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL,
  `app_name` varchar(128) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL COMMENT 'app_name',
  `content` longtext CHARACTER SET utf8 COLLATE utf8_bin NOT NULL,
  `md5` varchar(32) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL,
  `gmt_create` datetime(0) NOT NULL DEFAULT CURRENT_TIMESTAMP(0),
  `gmt_modified` datetime(0) NOT NULL DEFAULT CURRENT_TIMESTAMP(0),
  `src_user` text CHARACTER SET utf8 COLLATE utf8_bin NULL,
  `src_ip` varchar(20) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL,
  `op_type` char(10) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL,
  `tenant_id` varchar(128) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT '' COMMENT '租户字段',
  PRIMARY KEY (`nid`) USING BTREE,
  INDEX `idx_gmt_create`(`gmt_create`) USING BTREE,
  INDEX `idx_gmt_modified`(`gmt_modified`) USING BTREE,
  INDEX `idx_did`(`data_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 131 CHARACTER SET = utf8 COLLATE = utf8_bin COMMENT = '多租户改造' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of his_config_info
-- ----------------------------

-- ----------------------------
-- Table structure for permissions
-- ----------------------------
DROP TABLE IF EXISTS `permissions`;
CREATE TABLE `permissions`  (
  `role` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `resource` varchar(512) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `action` varchar(8) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  UNIQUE INDEX `uk_role_permission`(`role`, `resource`, `action`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of permissions
-- ----------------------------

-- ----------------------------
-- Table structure for roles
-- ----------------------------
DROP TABLE IF EXISTS `roles`;
CREATE TABLE `roles`  (
  `username` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `role` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  UNIQUE INDEX `idx_user_role`(`username`, `role`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of roles
-- ----------------------------
INSERT INTO `roles` VALUES ('nacos', 'ROLE_ADMIN');

-- ----------------------------
-- Table structure for tenant_capacity
-- ----------------------------
DROP TABLE IF EXISTS `tenant_capacity`;
CREATE TABLE `tenant_capacity`  (
  `id` bigint(20) UNSIGNED NOT NULL AUTO_INCREMENT COMMENT '主键ID',
  `tenant_id` varchar(128) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL DEFAULT '' COMMENT 'Tenant ID',
  `quota` int(10) UNSIGNED NOT NULL DEFAULT 0 COMMENT '配额，0表示使用默认值',
  `usage` int(10) UNSIGNED NOT NULL DEFAULT 0 COMMENT '使用量',
  `max_size` int(10) UNSIGNED NOT NULL DEFAULT 0 COMMENT '单个配置大小上限，单位为字节，0表示使用默认值',
  `max_aggr_count` int(10) UNSIGNED NOT NULL DEFAULT 0 COMMENT '聚合子配置最大个数',
  `max_aggr_size` int(10) UNSIGNED NOT NULL DEFAULT 0 COMMENT '单个聚合数据的子配置大小上限，单位为字节，0表示使用默认值',
  `max_history_count` int(10) UNSIGNED NOT NULL DEFAULT 0 COMMENT '最大变更历史数量',
  `gmt_create` datetime(0) NOT NULL DEFAULT CURRENT_TIMESTAMP(0) COMMENT '创建时间',
  `gmt_modified` datetime(0) NOT NULL DEFAULT CURRENT_TIMESTAMP(0) COMMENT '修改时间',
  PRIMARY KEY (`id`) USING BTREE,
  UNIQUE INDEX `uk_tenant_id`(`tenant_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_bin COMMENT = '租户容量信息表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of tenant_capacity
-- ----------------------------

-- ----------------------------
-- Table structure for tenant_info
-- ----------------------------
DROP TABLE IF EXISTS `tenant_info`;
CREATE TABLE `tenant_info`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `kp` varchar(128) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL COMMENT 'kp',
  `tenant_id` varchar(128) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT '' COMMENT 'tenant_id',
  `tenant_name` varchar(128) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT '' COMMENT 'tenant_name',
  `tenant_desc` varchar(256) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL COMMENT 'tenant_desc',
  `create_source` varchar(32) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL COMMENT 'create_source',
  `gmt_create` bigint(20) NOT NULL COMMENT '创建时间',
  `gmt_modified` bigint(20) NOT NULL COMMENT '修改时间',
  PRIMARY KEY (`id`) USING BTREE,
  UNIQUE INDEX `uk_tenant_info_kptenantid`(`kp`, `tenant_id`) USING BTREE,
  INDEX `idx_tenant_id`(`tenant_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_bin COMMENT = 'tenant_info' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of tenant_info
-- ----------------------------

-- ----------------------------
-- Table structure for users
-- ----------------------------
DROP TABLE IF EXISTS `users`;
CREATE TABLE `users`  (
  `username` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `password` varchar(500) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `enabled` tinyint(1) NOT NULL,
  PRIMARY KEY (`username`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of users
-- ----------------------------
INSERT INTO `users` VALUES ('nacos', '$2a$10$EuWPZHzz32dJN7jexM34MOeYirDdFAZm2kuWj7VEOJhhZkDrxfvUu', 1);

SET FOREIGN_KEY_CHECKS = 1;
