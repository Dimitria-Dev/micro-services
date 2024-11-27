FROM ubuntu:latest
LABEL authors="dimitrianeizil"

EXPOSE 8080
ADD target/micro-services.jar micro-services.jar
ENTRYPOINT ["java","-jar","/micro-services.jar"]