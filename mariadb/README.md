## MariaDB Dockerfile

https://docs.docker.com/samples/library/mariadb/#connect-to-mariadb-from-the-mysql-command-line-client


This repository contains **Dockerfile** of [MariaDB](https://mariadb.org/) for [Docker](https://www.docker.com/)'s [automated build](https://registry.hub.docker.com/u/dockerfile/mariadb/) published to the public [Docker Hub Registry](https://registry.hub.docker.com/).


### Base Docker Image

* [dockerfile/ubuntu](http://dockerfile.github.io/#/ubuntu)


### Installation

1. Install [Docker](https://www.docker.com/).

2. Download [automated build](https://registry.hub.docker.com/u/dockerfile/mariadb/) from public [Docker Hub Registry](https://registry.hub.docker.com/): `docker pull dockerfile/mariadb`

   (alternatively, you can build an image from Dockerfile: `docker build -t="dockerfile/mariadb" github.com/dockerfile/mariadb`)


### Usage

#### Run `mysqld-safe`

    docker run -d --name mysql -p 3306:3306 dockerfile/mariadb

#### Run `mysql`

    docker run -it --rm --link mysql:mysql dockerfile/mariadb bash -c 'mysql -h $MYSQL_PORT_3306_TCP_ADDR'
    
    
 ----------------------------------------
 
### Usage-tested*

```
docker search mariadb
```
```
docker run -p 3307:3307 --name some-mysql -e MYSQL_ROOT_PASSWORD=abc123 -d mysql:latest
   ```
   ```
   docker exec -it some-mariadb bash
   ```
   ```
   docker exec -it some-mariadb mysql -u root -p
```
