FROM openjdk:8
RUN mkdir -p /home/todos-app
COPY ./target/todos-application-mysql.jar /home/todos-app/todos-application-mysql.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "/home/todos-app/todos-application-mysql.jar"]