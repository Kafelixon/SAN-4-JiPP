# Use an official Maven image
FROM maven:3.8.4-openjdk-11-slim as build

# Set the working directory
WORKDIR /app

# Copy the pom.xml file and install dependencies
COPY pom.xml .
RUN mvn dependency:go-offline

# Copy the source code
COPY src/ ./src

# Build the application
RUN mvn package

# Use OpenJDK for running the application
FROM openjdk:11-jre-slim

WORKDIR /app

# Copy the built jar file
COPY --from=build /app/target/game-dev-builder-example-1.0.jar /app/

RUN java -version
# RUN javac -version

# Command to run the application
CMD ["java", "-jar", "game-dev-builder-example-1.0.jar"]