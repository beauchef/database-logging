# database-logging
Logging database access in Java apps

# 1. Requirements

On Windows 10:

* [Docker 18.06+ & Docker Compose 1.22.0+](https://store.docker.com/editions/community/docker-ce-desktop-windows)
* [Maven 3.x](https://maven.apache.org/)

# 2. Getting Started

Assuming that the working directory is `C:\dev`, first start the [Elastic stack](https://github.com/deviantony/docker-elk):

    > C:
    > cd \dev\docker-elk
    > docker-compose up
    
This will start Kibana locally (accessible at [http://localhost:5601](http://localhost:5601)) inside Docker.

Then start the Spring Boot application.
  
    > cd ..
    > mvn spring-boot:run

More to come...
