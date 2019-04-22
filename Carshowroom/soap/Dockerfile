FROM openjdk:8-jre-alpine
EXPOSE 9000
ADD /build/libs/soap-0.0.1-SNAPSHOT.jar soap-0.0.1-SNAPSHOT.jar
#CMD java - jar soap-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","soap-0.0.1-SNAPSHOT.jar"]
