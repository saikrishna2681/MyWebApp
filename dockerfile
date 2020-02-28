FROM openjdk:12-alpine
FROM tomcat
COPY web-thymeleaf/target/web-thymeleaf-1.0.jar /demo.jar

CMD ["java" , "-jar" , "/demo.jar"]

EXPOSE 9080
