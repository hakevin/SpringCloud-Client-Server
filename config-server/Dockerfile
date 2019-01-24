# requires Docker version 17.05.0-ce-rc1, build 2878a85
FROM maven:3.5-jdk-8 as BUILDCONFIGSERVER
COPY src /Users/C94145/Downloads/SpringCloudMdb-Docker/config-server/src
COPY pom.xml /Users/C94145/Downloads/SpringCloudMdb-Docker/config-server
RUN mvn -f /Users/C94145/Downloads/SpringCloudMdb-Docker/config-server/pom.xml clean package -DskipTests
FROM openjdk:alpine
COPY --from=BUILDCONFIGSERVER /Users/C94145/Downloads/SpringCloudMdb-Docker/config-server/target/*.jar /maven/
CMD java $JAVA_OPTS -jar maven/*.jar