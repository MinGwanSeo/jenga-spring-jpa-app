# jenga-spring-jpa-app

## 1. (로컬 작업 시,)로컬 DB Mysql docker container 생성하기
- 로컬의 DB 세팅이 완료되면, docker-compose 를 이용해서, 다중 컨테이너로 세팅할 예정이다. 지금은 일단 별도 컨테이너로 생성한다.
- mysql 이미지 다운받기
  ```
  docker pull  mysql
  ```
    - m1 mac 인 경우, --platform linux/amd64 옵션을 추가해준다.
      ```
      docker pull --platform linux/amd64 mysql
      ```

- 가져온 이미지로 mysql container run 하기
  ```
  docker run -d -p 33061:3306 -e MYSQL_ROOT_PASSWORD=root --name mysql_container mysql
  ```
  - 내 컴퓨터의 33061 포트를 사용
  - root 계정의 비밀번호를 root 로 설정한다.
  - mysql 이미지를 mysql_container 라는 이름으로 컨테이너를 만든다.
  - m1 mac 인 경우, --platform linux/amd64 옵션을 추가해준다.
    ```
    docker run --platform linux/amd64 -d -p 33061:3306 -e MYSQL_ROOT_PASSWORD=root --name mysql_container mysql
    ```

## 2. Dockerfile 로 애플리케이션 이미지 만들기
```
docker build -t jenga-springboot-app:0.0.1 .
```
- 로컬 DB 이용 시, -f 옵션으로 Dockerfile을 지정하여, 이미지 만든다.
  ```
  docker build -f Dockerfile.local -t jenga-springboot-app:0.0.1 .
  ```
 
# 3. 만든 이미지로 container를 생성한다.
```
docker run -d --name jenga-api-server -p 8080:8080 jenga-springboot-app:0.0.1
```
