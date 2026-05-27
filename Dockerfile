FROM tomcat:8-jre17-temurin-jammy
COPY target/onlinebookstore.war /usr/local/tomcat/webapps/onlinebookstore.war
