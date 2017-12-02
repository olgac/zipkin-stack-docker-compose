FROM openjdk:8-jdk-alpine
ENV SPRING_PROFILES_ACTIVE=docker
COPY target/application.jar /var/app/application.jar
ENTRYPOINT ["/usr/bin/java"]
CMD ["-jar", "/var/app/application.jar"]
VOLUME /var/app
EXPOSE 8080