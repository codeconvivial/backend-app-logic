# Base image
FROM eclipse-temurin:17-jdk-alpine

# Set the working directory
WORKDIR /app

# Copy the Maven Wrapper files
COPY  ./mvnw ./mvnw
COPY .mvn .mvn

# Copy the project configuration files
COPY pom.xml .

# Download the project dependencies
RUN --mount=type=cache,target=/root/.m2 ./mvnw dependency:go-offline -B

# Copy the application source code
COPY src ./src

# Expose the container port
EXPOSE 8080

# Build and run the application as dev
CMD ["./mvnw", "spring-boot:run"]