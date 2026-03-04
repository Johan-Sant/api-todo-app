FROM eclipse-temurin:17-jre

WORKDIR /sysx/progs

COPY target/todoapp-0.0.1-SNAPSHOT.jar /sysx/progs/app.jar

ENTRYPOINT ["java"]

CMD ["-XX:+UseSerialGC","-Xss512k","-Xms128m","-Xmx512m","-jar","/sysx/progs/app.jar","--spring.config.location=./application.yml"]

