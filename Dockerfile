FROM openjdk:8
ADD target/jaeger-demo-0.0.1-SNAPSHOT.jar jaeger-demo-0.0.1-SNAPSHOT.jar
EXPOSE 8085
ENTRYPOINT ["java", "-jar", "jaeger-demo-0.0.1-SNAPSHOT.jar"]