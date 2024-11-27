FROM ubuntu:latest

ADD target/*.jar micro-services.jar
ENTRYPOINT ["java","-jar","/micro-services.jar"]