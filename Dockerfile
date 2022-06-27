################### Stage 2: A minimal docker image with command to run the app 
FROM openjdk:8-jre-alpine
ENV APP_FILE ms-certificate-0.0.1.jar

ENV APP_HOME /usr/apps

ENV APP_SOURCE ms-certificate/target

ARG JAR_FILE=target/ms-certificate-0.0.1.jar
COPY $JAR_FILE $APP_HOME/
WORKDIR $APP_HOME
ENTRYPOINT ["sh", "-c"]
CMD ["exec java -Djava.security.egd=file:/dev/./urandom -jar $APP_FILE"]
EXPOSE 8081

# mvn clean install
# docker build  -t proyectocadena/ms-certificate:0.7.7 -f Dockerfile .
# docker push proyectocadena/ms-certificate:0.7.7

