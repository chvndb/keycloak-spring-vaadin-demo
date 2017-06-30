# Keycloak, Spring & Vaadin Demo

Vaadin demo backed by Spring Boot (embedded Tomcat) and Keycloak.

### General

A showcase on how a Vaadin application can be setup using Gradle, Spring Boot and secured with Keycloak. It is based on [security-sample-shared](https://github.com/peholmst/vaadin4spring/tree/master/samples/security-sample-shared).

The main purpose of this demo is to understand the full build and configuration process to allow the different technologies to work together.

### Dependencies
This demo has been tested with following dependencies:
* JDK 8
* Docker >= 17.03.1-ce
* docker-compose >= 1.11.2

### Build, Deploy and Configure

Clone the repository

    % git clone https://github.com/chvndb/keycloak-spring-vaadin-demo.git

    % cd keycloak-spring-vaadin-demo

Create the demo docker network

    % ./gradlew network

Compile the source code, start the application server and deploy

    % ./gradlew start

Add keycloak demo Realm

    % open http://localhost:5050/auth/admin/master/console

    % login with user: demo, password: demo

    % import realm using file `src/main/docker/keycloak/data/keycloak.json`

Go to application

    % open http://localhost:8080/

    % login with user: admin, password: admin

    % login with user: user, password: user

Stop and clean up

    % ./gradlew stop

### Development

Any code changes can be redeployed without doing a full restart.
Start coding and redeploy with:

    % ./gradlew redeploy
