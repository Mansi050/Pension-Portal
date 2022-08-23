FROM openjdk:17
EXPOSE 8091
ADD target/portalservice.jar portalservice.jar
ENTRYPOINT ["sh", "-c", "java ${JAVA_OPTS} -jar portalservice.jar"]
