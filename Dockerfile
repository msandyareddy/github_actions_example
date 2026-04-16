# Use an official JDK 17 base image
FROM eclipse-temurin:17-jdk-alpine

EXPOSE 8080


# Copy the executable jar from the host to the container
ADD target/github_actions_cicd_sample.jar github_actions_cicd_sample.jar

# Command to run the application
ENTRYPOINT ["java", "-jar", "github_actions_cicd_sample.jar"]