FROM openjdk:8
EXPOSE 8080
ADD target/springboot-codepipeline-order-service.jar springboot-codepipeline-order-service.jar
ENTRYPOINT ["java","-jar", "/springboot-codepipeline-order-service.jar"]
