FROM openjdk:8
EXPOSE 8005
ADD target/e2edevops-0.0.1-SNAPSHOT.jar appdevops.jar
ENTRYPOINT ["java","-jar","/appdevops.jar"]