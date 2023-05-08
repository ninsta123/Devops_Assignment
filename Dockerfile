#define base docker image
FROM openjdk:11
EXPOSE 5051
#LABEL maintainer="adarshdocker"
ADD target/jenkinscicd-docker-image.jar jenkinscicd-docker-image.jar
ENTRYPOINT ["java","-jar", "jenkinscicd-docker-image.jar"]