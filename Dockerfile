FROM ubuntu:latest
LABEL authors="sumant.pathak"
WORKDIR /app
COPY target/*.jar app.jar
CMD ["java", "-jar", "app.jar"]
