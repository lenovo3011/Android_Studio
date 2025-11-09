FROM jelastic/maven:3.9.5-openjdk-21 AS build
COPY . .
RUN mvn clean package -DskipTests

FROM mcr.microsoft.com/openjdk/jdk:21-ubuntu

COPY --from=build /target/AIRESTAPI-0.0.1-SNAPSHOT.jar airestapi.jar

EXPOSE 8080
ENTRYPOINT ["java" , "-jar" , "airestapi.jar"]