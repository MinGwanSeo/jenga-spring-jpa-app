FROM gradle:jdk11

WORKDIR /app
COPY ./ ./
RUN gradle clean build --no-daemon
EXPOSE 8080
CMD java -jar build/libs/jenga1-0.0.1-SNAPSHOT.jar