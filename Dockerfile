FROM maven as build
WORKDIR /app
COPY . .
RUN mvn clean package 

FROM openjdk:11.0
WORKDIR /app
COPY --from=build /leanquality/targer/onlinebookstore.war /app/
EXPOSE 9090
CMD ["java","-war","onlinebookstore.war"]
