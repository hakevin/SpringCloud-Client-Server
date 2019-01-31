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
docker build . -t config-server
docker build . -t config-client

```

``` 
docker run -it -p 8888:8888 config-server
docker run -it -p 7777:7777 config-client

```

mysql -u root -p

Run SQL command in "schema-mariadb.sql" to the shell to create the employee database. Spring does not make it automatically for us. 

Should test this with Docker Monday. 

### Wednesday

https://vaadin.com/blog/building-a-web-ui-for-mysql-databases-in-plain-java-

https://www.jianshu.com/p/2ef6a9259112

### SpringCloud-Client-Server

Sources:

Properties table

https://medium.com/@nani2ratna/spring-cloud-config-server-with-jdbc-55de8f7ec86d

https://github.com/alejandro-du/mysql-jdbc-vaadin


------------------------------------------------------------

https://medium.com/@kishansingh.x/spring-cloud-config-server-with-jdbc-backend-a8a629846115

https://medium.com/@nani2ratna/spring-cloud-config-server-with-jdbc-55de8f7ec86d

https://github.com/TechPrimers/docker-mysql-spring-boot-example

https://www.javainuse.com/spring/bootjdbc

https://github.com/spansari/db-config-server

https://github.com/rashidi/jdbc-env-repo-sample

https://dzone.com/articles/spring-cloud-config-server-for-the-impatient

https://dzone.com/articles/creating-a-springboot-configuration-server-using-d

https://o7planning.org/en/11727/understanding-spring-cloud-config-client-with-example

https://o7planning.org/en/11723/understanding-spring-cloud-config-server-with-example

-------------------------------------------------------------------


https://docs.docker.com/samples/library/mariadb/

https://spring.io/projects/spring-cloud-config#samples

https://hub.docker.com/r/hyness/spring-cloud-config-server/dockerfile




---------------------------



