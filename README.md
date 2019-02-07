Run:
config-server
config-client
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

### Fundamentally

https://www.jianshu.com/p/2ef6a9259112

### SpringCloud-Client-Server Properties table:

Sources:

https://medium.com/@nani2ratna/spring-cloud-config-server-with-jdbc-55de8f7ec86d

------------------------------------------------------------

https://medium.com/@kishansingh.x/spring-cloud-config-server-with-jdbc-backend-a8a629846115

https://github.com/alejandro-du/mysql-jdbc-vaadin

https://github.com/rashidi/jdbc-env-repo-sample

https://www.javainuse.com/spring/bootjdbc

https://spring.io/projects/spring-cloud-config#samples

https://dzone.com/articles/spring-cloud-config-server-for-the-impatient

https://dzone.com/articles/creating-a-springboot-configuration-server-using-d

https://o7planning.org/en/11727/understanding-spring-cloud-config-client-with-example

https://o7planning.org/en/11723/understanding-spring-cloud-config-server-with-example

https://vaadin.com/blog/building-a-web-ui-for-mysql-databases-in-plain-java-


-------------------------------------------------------------------
 ### Docker resources:

https://www.baeldung.com/dockerizing-spring-boot-application

https://docs.docker.com/samples/library/mariadb/

https://hub.docker.com/r/hyness/spring-cloud-config-server/dockerfile

https://github.com/TechPrimers/docker-mysql-spring-boot-example




---------------------------

### Vault/secrets

https://medium.com/@Ankitthakur/spring-boot-spring-vault-e9e973a17036

https://www.baeldung.com/spring-vault

https://spring.io/blog/2016/06/24/managing-secrets-with-vault

https://github.com/spansari/db-config-server

https://github.com/spring-projects/spring-vault

https://projects.spring.io/spring-vault/

https://dzone.com/articles/managing-secrets-with-vault





https://www.hashicorp.com/resources/how-to-use-vault-with-spring-applications





