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
docker build . -t configserver
docker build . -t configclient

```

``` 
docker run -it -p 8888:8888 configserver
docker run -it -p 8080:8080 configclient

```

mysql -u root -p

Run SQL command in "schema-mariadb.sql" to the shell to create the employee database. Spring does not make it automatically for us. 

Should test this with Docker Monday. 

### SpringCloud-Client-Server

Sources:
Tuesday:

https://o7planning.org/en/11727/understanding-spring-cloud-config-client-with-example

https://o7planning.org/en/11723/understanding-spring-cloud-config-server-with-example

------------------------------------------------------------

https://medium.com/@kishansingh.x/spring-cloud-config-server-with-jdbc-backend-a8a629846115

https://medium.com/@nani2ratna/spring-cloud-config-server-with-jdbc-55de8f7ec86d

https://github.com/TechPrimers/docker-mysql-spring-boot-example

https://www.javainuse.com/spring/bootjdbc

https://github.com/rashidi/jdbc-env-repo-sample

https://dzone.com/articles/spring-cloud-config-server-for-the-impatient

https://dzone.com/articles/creating-a-springboot-configuration-server-using-d

-------------------------------------------------------------------


https://docs.docker.com/samples/library/mariadb/

https://spring.io/projects/spring-cloud-config#samples

https://hub.docker.com/r/hyness/spring-cloud-config-server/dockerfile




---------------------------



