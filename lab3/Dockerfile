FROM openjdk:17-jdk-slim

# Set the working directory to /app
WORKDIR /app

# Copy the source code into the container
COPY . /app

# Compile the Java sources
RUN javac -d build -sourcepath . -cp . game/Main.java game/entity/*.java game/gameobject/*.java game/worldobject/*.java 
