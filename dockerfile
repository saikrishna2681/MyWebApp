FROM openjdk:12-alpine
FROM tomcat
COPY target/MavenWebApp.war /usr/local/tomcat/webapps

CMD ["java" , "-jar" , "/webapp.war"]

CMD ["catalina.sh", "run"]
