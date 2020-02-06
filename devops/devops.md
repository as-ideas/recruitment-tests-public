# DEVOPS Assessment

## Part 1 - Writing

 * What’s your proudest achievement? That may be a personal project or something you’ve worked on professionally. Just a short paragraph is fine, we’d just love to know why you’re proud of it.
 * What does devops mean to you personally and how would you like to fullfill this role? 
 * Emacs or Vim; which one is better? :-)

## Part 2 - Coding

Please work on as many tasks as you like in feasible time. Your result will serve as a basis for a technical discussion. __Please rather deliver less in high quality than the other way around.__ Your code should be stored in a public git repository with a generic name. Please exclude this description of the tasks from your repository.

Have fun and good luck!

### 1. Make the stars happy

You're given a happy star Java application serving HTTP requests at port 8081.
The application is invoked by: ```java -jar happy-stars.jar```
The port is configurable via: ```java -jar -Dserver.port=1337 happy-stars.jar```

Note: the application requires Java 8!

#### 1.1 Serve requests

Please create a shell script to start the application in the background.
The script's first and only argument shall be used as the application's port.
If none is given the default port 8081 is used.

#### 1.2 Serve yourself

Drink a Club Mate.

### 2. Containerization

In order to run and share the application together with a JRE or JDK (Java 8) please create a container image.

### 3. Web Setup

We're going to release this great piece of software to the public. Please make the application available via port 443 using TLS. The Java applications is not required to offload TLS itself. You should use a self-signed certificate. Redirect requests on port 80 to the secure port.

### 4. Automation

Until now everything was done locally by hand. Please provide an automated solution that solves the following tasks using infrastructure as code (IaC):

 - provision the infrastructure (local, cloud, ...) hosting the container(s)
 - build the container image(s)
 - provision the container(s) on infrastructure

### 5. Hardening & general optimizations

Your setup is now running on the interwebs. Congratulations!  

#### 5.1 In theory .. 

The Internet is full of .. things. Think of measures that increase the security aspects of the setup. In your opinion, what is necessary to improve security, maintainability and availability of your setup?

#### 5.2 .. and practice

Please implement one of your aspects (5.1), e.g.: disable SSH password authentication.
