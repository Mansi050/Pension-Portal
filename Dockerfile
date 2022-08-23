FROM openjdk:17
EXPOSE 8091
ADD target/ProcessManagementPortal-0.0.1-SNAPSHOT.jar ProcessManagementPortal-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["sh", "-c", "java ${JAVA_OPTS} -jar ProcessManagementPortal-0.0.1-SNAPSHOT.jar"]
