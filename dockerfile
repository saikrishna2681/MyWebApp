FROM openjdk:12-alpine
FROM tomcat
COPY target/MavenWebApp.war /webapp.war

CMD ["java" , "-jar" , "/webapp.war"]

EXPOSE 9081
