FROM openjdk:17
EXPOSE 7081
ADD ./target/s01_exp_consumidor-0.0.1-SNAPSHOT.jar consumidor.jar
ENTRYPOINT ["java","-jar","/consumidor.jar"]