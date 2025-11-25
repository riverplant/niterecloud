# mvn clean package -DsikpTests
FROM eclipse-temurin:17-jdk

LABEL author=riverplant

#相當於定義了當前的目錄: cd /app
WORKDIR /app

#將target/*.jar複製到了/app/app.jar
COPY target/*.jar /app.jar

EXPOSE 8080

ENTRYPOINT ["java","-jar","/app.jar"]

#通過這個命令來運行，就可以將自己的應用構建成鏡像
#docker build -f Dockerfile -t myjavaapp:v1.0 .

#docker run -d -p 8888:8080 myjavaapp:v1.0  啓動容器，可以訪問了