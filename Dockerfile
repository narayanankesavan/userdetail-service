FROM openjdk:17-oracle
EXPOSE 9003

COPY ./target/userdetail-service-0.0.1-SNAPSHOT.jar /usr/app/

WORKDIR /usr/app

ENTRYPOINT ["java","-jar","userdetail-service-0.0.1-SNAPSHOT.jar"]
