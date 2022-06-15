FROM amazoncorretto:11
EXPOSE 5000
ADD target/springrestapi-0.0.1-SNAPSHOT.jar springrestapi.jar
CMD ["java","-jar","/springrestapi.jar"]