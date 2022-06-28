################### Stage 2: A minimal docker image with command to run the app 
FROM openjdk:8-jre-alpine
ENV APP_FILE tipocambio-0.0.1-SNAPSHOT.jar

ENV APP_HOME /usr/apps

ENV APP_SOURCE tipocambio/target

ARG JAR_FILE=target/tipocambio-0.0.1-SNAPSHOT.jar
COPY $JAR_FILE $APP_HOME/
WORKDIR $APP_HOME
ENTRYPOINT ["sh", "-c"]
CMD ["exec java -Djava.security.egd=file:/dev/./urandom -jar $APP_FILE"]
EXPOSE 8081

# mvn clean install
# docker build  -t renatomartindc/bcp:0.0.1 -f Dockerfile .
# docker push renatomartindc/bcp:0.0.1

