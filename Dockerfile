#For build
FROM openjdk:17

WORKDIR /app

COPY mvnw .

COPY .mvn .mvn

COPY pom.xml .

COPY src src

RUN ./mvnw package -DskipTests

COPY target/*.jar app.jar

#For Run
# FROM openjdk:17

EXPOSE 8080

CMD ["java", "-jar", "app.jar"]