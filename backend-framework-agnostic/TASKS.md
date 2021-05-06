# 1. Writing

#### 1. What’s your proudest achievement? It can be a personal project or something you’ve worked on professionally. Just a short paragraph is fine, but we’d love to know why you’re proud of it.
#### 2. Tell us about a technical book or article you read recently, why you liked it, and why we should read it as well.

# 2. Coding

While the challenge is framework-agnostic we do have a few guidelines:

* Programming language: Java (>=11) or Kotlin (>=1.4).
* Build tool: Maven or Gradle.
* We want you to demonstrate modern usage of a framework or packages. This includes features like DI/IoC, ODM/ORM, persistence layer abstraction, MVC, testing, etc.

Domain: When working in the field of media, you often come across concepts like articles, authors, assets, and users.

## Tasks:

### Task 1 - Articles service

Our application has to provide basic `article` REST functionality.

An `article` has the following details: id, title, text, author.

The application has to listen for HTTP requests on port 8080 and provide the following endpoints:
* an endpoint for fetching all articles
* an endpoint for fetching a specific article.
* an endpoint for article creation.

Implement the article persistence as a __static ephemeral feature__.

Supply the user/us with minimal basic documentation as you see fit. We will definitely need the following:
* How does one build and start the application in a *nix environment (or in a container).
* How does one use your application using CURL commands.

Make sure that your software works as expected by writing tests where you think it is necessary, We don't expect you to reach any code coverage goal but we do like to see some testing. Please use your time wisely.

Commit the completion of this task with a commit message stating this is __task 1__. We will checkout this commit and use the application.

### Task 2 - Introduce a persistence layer
Refactor and extend the application you implemented in task 1 to have a persistence layer.

The persistence layer should be based on a publicly available and widely used DB
The DB has to be either embedded in the solution or run in a docker container.

Add to the documentation you wrote in task 1 details of how do we start the application with the persistence layer.

Commit the completion of this task with a commit message stating this is __task 2__. We will checkout this commit and use the application.

Bonus: supply us some automation that builds and starts the application (e.g. a script and a docker-compose or a gradle task)

### Task 3 - Introduce an Article entity

Our company now needs each article to contain a list of authors. an `author` has to be a separate entity and have the same minimal relevant functionality as an `article` (getAll, get, create). 

The `article` entity should be extended to contain a list of `author`s.

The Domain has to be extended so an `article` contains a list of `authors` (e.g. the `article` endpoints have to supply `author` functionality).

Add to the documentation you wrote in task 2 details of how do we use the new endpoints.

__Here the challenge basically ends :) If you still have time and will we'll be very happy if you delivered one of the following bonuses (but don't feel compelled to do it)__

### Bonus 1: Our company now needs the articles to start as drafts, they are then edited until they are published.

provide the required endpoint to publish an article. think of the changes you would apply to the other endpoints and entities. Minimally we want to know when an article was published. implement these.

### Bonus 2: Describe your next steps towards deploying your app to production

Now that you've mastered implementing all features, the next step is to deploy the feature to production. Write down some ideas about what is missing to run this app on a production environment. Additionally consider that your app will be used by multiple editors at the same time.

