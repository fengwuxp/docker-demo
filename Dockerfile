FROM java:8

ARG PORT=8080

ADD ./target/demo-1.0.0-SNAPSHOT.jar  /fengwuxp/app.jar

EXPOSE $PORT
WORKDIR /fengwuxp

ENTRYPOINT ["java", "-jar", "/fengwuxp/app.jar"]
