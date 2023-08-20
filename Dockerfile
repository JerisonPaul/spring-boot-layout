FROM centos:7
MAINTAINER test dockerfile <donglinbj@foxmail.com>

ARG JAR_FILE=build/libs/spring-boot-layout-1.0-SNAPSHOT.jar
COPY ${JAR_FILE} /opt/data/layout.jar

# jdk地址自行调整
ADD jdk-8u231-linux-x64.tar.gz /usr/local/java

ENV MYPATH /opt/data
WORKDIR $MYPATH

ENV JAVA_HOME /usr/local/java/jdk1.8.0_231
ENV PATH $PATH:$JAVA_HOME/bin
ENV LANG="en_US.UTF-8"
ENV TERM=xterm

RUN yum -y install vim net-tools
RUN ln -sf /usr/share/zoneinfo/Asia/Shanghai /etc/localtime && echo 'Asia/Shanghai' >/etc/timezone

# 将启动命令写入启动脚本 start.sh
RUN mkdir -p /opt/data
RUN echo '$JAVA_HOME/bin/java -jar $CATALINA_OPTS /opt/data/layout.jar'> /opt/data/start.sh && chmod +x /opt/data/start.sh
CMD ["/bin/bash", "/opt/data/start.sh"]