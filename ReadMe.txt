This contains the set of instructions required to build and run the Spring Web Security application.

This application demonstrate the simple usage of Java Spring security Basic Authentication. Application has developed using Spring MVC pattern.

Contents :
==========
.
├── pom.xml
├── ReadMe.txt
└── src
    ├── main
    │   ├── java
    │   │   └── com
    │   │       └── security
    │   │           └── sample
    │   │               └── controler
    │   │                   └── HelloController.java
    │   ├── resources
    │   └── webapp
    │       ├── index.jsp
    │       └── WEB-INF
    │           ├── mvc-dispatcher-servlet.xml
    │           ├── pages
    │           │   └── hello.jsp
    │           ├── spring-security_AUTO_CONFIG
    │           ├── spring-security.xml
    │           └── web.xml
    


Building the Project.
====================

Pre-requisites
--------------
JDK 1.6.x or higher
Maven 2 or higher
set java_home and m2_home.
Tomcat 5.X or highr

Steps:
------
1 - Download the websecurity project to a local environment
2 - Go to the project home directory /websecurity, and run 
    - mvn clean package
    - This might take a few seconds to download all the dependencies to your local M2 repo.

Running the application.
========================
1 - Copy the websecurity.war from websecurity/Target/ to <Tomcat_Home>/webapps/ 
2 - Bring up the Tomcat Server (ex : ./catelina.sh run)
3 - Access the URL "http://localhost:8080/welcome" on a web browser
4 - Enter credentials as vijitha/epa123 and login




