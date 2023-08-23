# spring-boot-layout

#### 介绍
SpringBoot 基本开发模式
<br/>
该项目中包括了用 SpringBoot 构建日常开发中一系列基本内容，对于框架的搭建有很大的参考价值，大家可以参考，同时可以直接应用于自己的实际的项目开发中
<br/>
后续会逐步完善，包括 开发、构建、上线、运维等一系列流程，之后会转向 SpringCloud等进阶内容

#### 开发环境
* 开发IDE：[IDEA](https://www.jetbrains.com/idea/download/)
* 数据库： [mysql5.7](https://dev.mysql.com/downloads/mysql/)
* JDK: [JDK8](https://www.oracle.com/java/technologies/downloads/#java8-linux)
* Erlang环境：该项目没有采用Maven进行项目构建，Maven通过xml进行依赖管理，导致整个配置文件太过臃肿，另外灵活性也不是很强，所以我采用Gradle进行项目构建和依赖管理，通过简单的一些配置就可以轻松的实现组件化的功能

#### 工程介绍
项目中数据库地址自行替换，提供了一个Hello表，两个接口用来测试
<br/>
* get接口，通过名称查询
```shell script
curl --location 'http://127.0.0.1:8010/hello/test/get?name='
```
* post接口，更新名称通过Id
```shell script
curl --location 'http://127.0.0.1:8010/hello/test/post' \
--header 'Content-Type: application/json' \
--data '{
    "id" : 1,
    "name": "newName"
}'
```
* swagger访问地址
```shell script
  http://127.0.0.1:8010/swagger-ui.html
```
![](https://upload-images.jianshu.io/upload_images/8396943-3c2757ff87212c69.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)
