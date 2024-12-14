FROM openjdk:21
WORKDIR /apps
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} contas-teste.jar
ENTRYPOINT ["java", "-jar", "/apps/contas-teste.jar"]

#Contaseste-0-0-1-SNAPSHOT.jar
#docker build -t contas-teste-docker .
#docker run -p 8080:8080 contas-teste-docker
#docker exec -it app bash