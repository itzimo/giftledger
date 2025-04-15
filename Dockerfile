#AdoptOpenJDK 停止发布 OpenJDK 二进制，而 Eclipse Temurin 是它的延伸，提供更好的稳定性
FROM eclipse-temurin:8-jre
ENV TZ=Asia/Shanghai
RUN ln -snf /usr/share/zoneinfo/$TZ /etc/localtime && echo $TZ > /etc/timezone
WORKDIR /home/app

# 复制构建结果
COPY target/*.jar /home/app/service.jar

# 启动服务（从环境变量中读取 JAVA_OPTS）
ENTRYPOINT ["sh", "-c", "java ${JAVA_OPTS} -jar service.jar"]
