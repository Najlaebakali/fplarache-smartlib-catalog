# Utilisation de l'image officielle OpenJDK comme base
FROM openjdk:17-jdk-slim
VOLUME /tmp
# Copier le fichier JAR de l'application généré dans le conteneur
COPY target/*.jar app.jar
# Exposer le port sur lequel l'application va tourner
ENTRYPOINT ["java", "-jar", "/app.jar"]
EXPOSE 80
