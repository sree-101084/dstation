FROM openjdk:12-alpine

VOLUME /tmp

EXPOSE 5000

COPY target/employee-*.jar /demo.jar

CMD ["java" , "-jar" , "/demo.jar"] 