FORM maven as build
WORKDIR /app
COPY . .
RUN mvn install 

FROM openjdk:11.0
WORKDIR /app
COPY --from=build /app/targer/onlinebookstore.war /app/
EXPOSE 9090
CMD ["java","-war","onlinebookstore.war"]