FROM gradle:jdk11

WORKDIR /app
COPY ./ ./
RUN gradle clean build --no-daemon
CMD java -jar build/libs/*.jar
