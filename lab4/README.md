# Game Development Builder Example

This repository contains a Java-based game development inspired example that demonstrates the use of the Builder pattern. The example includes two classes: `Character` and `Item`. The `Character` class defines a game character with attributes like name, level, and health. The `Item` class defines a game item with attributes like name and type.

## Prerequisites

Before you begin, ensure you have the following installed on your system:

- Java JDK 11
- Maven 3.8.4 or higher
- Docker

## Project Structure

- `src/main/java/` - Contains the Java source files.
  - `com.example.Character.java` - Defines a game character using Lombok's Builder pattern.
  - `com.example.Item.java` - Defines a game item with attributes like name and type.
  - `com.example.Main.java` - Main class demonstrating the use of `Character` and `Item`.
- `Dockerfile` - Configuration file for Docker to build the Java application.
- `docker-compose.yml` - Docker Compose file to orchestrate the Docker container.
- `pom.xml` - Maven configuration file with project settings, dependencies, and build configuration.

## Running the Project using Docker Compose

To run the project using Docker Compose, follow these steps:

1. Build the Docker image:

   ```bash
   docker compose up
   ```

## Running the Project using Docker

To run the project using Docker, follow these steps:

1. Build the Docker image:

   ```bash
   docker build -t game-dev-builder-example .
   ```

2. Run the Docker container:

   ```bash
    docker run game-dev-builder-example
    ```

## Building the Project and running locally

To build the project, follow these steps:

1. Clone the repository:

   ```bash
   git clone [repository-url]
   cd [repository-directory]
   ```

2. Build the project using Maven:

   ```bash
    mvn clean package
    ```

3. Run the project:

   ```bash
   java -jar target/game-dev-builder-example-1.0.jar
   ```
