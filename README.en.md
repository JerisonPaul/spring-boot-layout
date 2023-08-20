# spring-boot-layout

#### Description
SpringBoot Basic Layout Mode

#### Development Environment
* Develop IDE：[IDEA](https://www.jetbrains.com/idea/download/)
* DB： [mysql5.7](https://dev.mysql.com/downloads/mysql/)
* JDK: [JDK8](https://www.oracle.com/java/technologies/downloads/#java8-linux)
* Erlang：This project did not use Maven for project construction. Maven used XML for dependency management, which resulted in the entire configuration file being too cumbersome and not very flexible. Therefore, I used Gradle for project construction and dependency management. With simple configurations, I can easily achieve componentized functionality

#### Engineering Introduction
In the project, the database address is self replaced, and a Hello table is provided with two interfaces for testing
<br/>
get api，findByName
```shell script
curl --location 'http://127.0.0.1:8010/hello/test/get?name='
```
post api，updateNameById
```shell script
curl --location 'http://127.0.0.1:8010/hello/test/post' \
--header 'Content-Type: application/json' \
--data '{
    "id" : 1,
    "name": "newName"
}'
```
                 