FROM adoptopenjdk/openjdk11
EXPOSE 8081
COPY ./target/authorization-0.0.1-SNAPSHOT.jar  authorization-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar", "authorization-0.0.1-SNAPSHOT.jar"]
