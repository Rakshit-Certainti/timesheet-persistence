# Use an OpenJDK runtime as a base image
FROM openjdk:17

# Set the working directory in the container
WORKDIR /app

# Copy the executable JAR file from the target directory into the container at the defined path
COPY target/*.jar demo-0.0.1-SNAPSHOT.jar


# Expose the port that your Spring Boot application runs on
EXPOSE 8081

# Specify the command to run your application
CMD ["java", "-jar", "demo-0.0.1-SNAPSHOT.jar"]
