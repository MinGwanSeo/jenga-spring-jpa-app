FROM gradle:jdk11


# 서버에서 jar 파일 생성
CMD java -jar -Dspring.profiles.active=prod build/libs/jenga1-0.0.1-SNAPSHOT.jar

WORKDIR /app

# jar 파일을 도커컨테이너에 copy
COPY ./build/libs/jenga1-0.0.1-SNAPSHOT.jar /usr/local/jenga1-0.0.1-SNAPSHOT.jar

RUN gradle clean build --no-daemon

EXPOSE 8080
# 권한 수정

RUN chmod +x /usr/local/jenga1-0.0.1-SNAPSHOT.jar

CMD java -jar build/libs/jenga1-0.0.1-SNAPSHOT.jar
