FROM openjdk:8-jre-alpine

ARG JAR_FILE
EXPOSE 7000

ADD target/$JAR_FILE /helloWorld.jar

CMD ["java", "-jar", "/helloWorld.jar"]