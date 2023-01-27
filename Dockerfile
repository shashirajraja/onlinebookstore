FROM anapsix/alpine-java
FROM maven as build
WORKDIR /app
COPY . .
RUN mvn install 
RUN mvn clean package 

FROM openjdk:11.0
WORKDIR /app
COPY --from=build /app/leanquality/targer/onlinebookstore.war /app/
EXPOSE 9090
CMD ["java","-war","/app/leanquality/targer/onlinebookstore.war"]
