FROM gradle:jdk11

EXPOSE 8080
COPY ./build/libs/jenga1-0.0.1-SNAPSHOT.jar /usr/local/jenga1-0.0.1-SNAPSHOT.jar
RUN chmod +x /usr/local/jenga1-0.0.1-SNAPSHOT.jar
WORKDIR /usr/local
ENTRYPOINT ["java", "-jar", "jenga1-0.0.1-SNAPSHOT.jar"]
