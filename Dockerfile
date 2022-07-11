FROM openjdk:11
VOLUME /tmp
ADD ./target/TechnicalInterview-0.0.1-SNAPSHOT.jar TechnicalInterview.jar
ENTRYPOINT ["java","-jar","/TechnicalInterview.jar"]
