FROM openjdk:12-alpine
FROM tomcat
COPY MavenWebApp\target\MavenWebApp.war /demo.war

CMD ["java" , "-jar" , "/demo.war"]

EXPOSE 9081
