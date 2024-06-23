#from se refuere a la imagen base que se va a utilizar para crear la imagen  de la aplicacion
FROM openjdk:17

VOLUME /tmp
EXPOSE 8761
ADD ./target/s01_exp_eureka-server-0.0.1-SNAPSHOT.jar eureka-server.jar
#cuando se ejecuta la imagen hace un java -jar eureka-server.jar
ENTRYPOINT ["java","-jar","/eureka-server.jar"]