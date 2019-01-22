Dockerfile

```
# requires Docker version 17.05.0-ce-rc1, build 2878a85
FROM maven:3.5-jdk-8 as BUILDCONFIGSERVER
COPY src /usr/src/myapp/src
COPY pom.xml /usr/src/myapp
RUN mvn -f /usr/src/myapp/pom.xml clean package -DskipTests
FROM openjdk:alpine
COPY --from=BUILDCONFIGSERVER /usr/src/myapp/target/*.jar /maven/
CMD java $JAVA_OPTS -jar maven/*.jar
```
```
docker build . -t configclient
docker build . -t configserver
```

``` 
docker run -it configclient
docker run -it configserver
```
```
docker run -it server-mariadb bash
docker run -it client-mariadb bash
```

### SpringCloud-Client-Server

Sources:

https://medium.com/@kishansingh.x/spring-cloud-config-server-with-jdbc-backend-a8a629846115

https://github.com/TechPrimers/docker-mysql-spring-boot-example

https://dzone.com/articles/spring-cloud-config-server-for-the-impatient

-------------------------------------------------------------------


https://docs.docker.com/samples/library/mariadb/

https://spring.io/projects/spring-cloud-config#samples

https://hub.docker.com/r/hyness/spring-cloud-config-server/dockerfile

