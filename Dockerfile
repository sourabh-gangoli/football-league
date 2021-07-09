# For Java 8, try this
FROM openjdk:8-jdk-alpine

# For Java 11, try this
# FROM adoptopenjdk/openjdk11:alpine-jre

# Refer to Maven build -> finalName
ARG JAR_FILE=target/football-league.jar

# cd /opt/app
WORKDIR /opt/app

# cp target/football-league.jar /opt/app/football-league.jar
COPY ${JAR_FILE} football-league.jar
EXPOSE 8085
# java -jar /opt/app/football-league.jar
ENTRYPOINT ["java","-jar","football-league.jar"]
# sudo docker build -t spring-boot:1.0 .
# sudo docker run -d -p 8085:8085 -t spring-boot:1.0
#docker build -t springio/football-league .
#docker run -p 8080:8080 springio/football-league