FROM openjdk:8-jre-alpine
EXPOSE 8081
ADD /build/libs/rest-0.0.1-SNAPSHOT.jar rest-0.0.1-SNAPSHOT.jar
#CMD java - jar rest-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","rest-0.0.1-SNAPSHOT.jar"]
