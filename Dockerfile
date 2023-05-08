#define base docker image
FROM openjdk:11
EXPOSE 5001

ADD target/jenkins-image.jar jenkins-image.jar
ENTRYPOINT ["java","-jar", "jenkins-image.jar"]
