# JS Frontend Test

This test is for developers focusing on the frontend. The overall task is to use a REST API and create a single-page-application (SPA).

If you are doing this test at our office, the objective is to have enough material to help us assess your expertise and style of working. We do not expect you to finish all tasks! Nonetheless please work on as many as you can in affordable time.

If you are doing this test at home, the objective is a bit different. We will still use your solution to assess your expertise and working style but we expect a complete solution with a high level of quality.

You may skip a task if you like to continue working on a following task or you can go through each task, commit to a branch, or tag the final solution to each task. In the end we would like to have a piece of software that tells us how you work. Once done, we will go through your solution allowing you to explain your rationale.
Once done, please send us a link to your git repository which should have a random name (others should have fun solving the challenge as well).  


__Please deliver less tasks but with higher quality rather than many tasks in lesser quality.__

Please install the [json-server package](https://www.npmjs.com/package/json-server) and use the ```db.json``` file provided. 
 
```bash
# install the server (globally if wanted)
npm install -g json-server
# start the server with the provided db file
json-server --watch db.json
# or start the server on a different port (e.g. 1234)
json-server --watch db.json --port 1234
```

Hints:

   * Use the IDE, Tools, JS libraries or CSS frameworks you are most comfortable with. You can also use Typescript, or any other currently hyped frontend language.
   * Prefer simple solutions you can explain over complex solutions you don't even grok.

## Task 0 - a little bit of writing 

   * What’s your proudest achievement? It can be a personal project or something you’ve worked on professionally. Just a short paragraph is fine, but we’d love to know why you’re proud of it.
   * Tell us about a technical book or article you read recently, why you liked it, and why we should read it as well.


## Task 1 - Show a static HTML page

   * Add an index.html with a headline to your project with a simple "Hello World"
   * Include a css-file and a js-file
   * Open the page in the browser, it should display the page and load the css- and js-file.


## Task 2 - Add a Menu & Single-Page-Site

   * Add a menu to your page with the three entries:
      * Universes
      * Stars
      * Imprint
   * The three pages should be navigable and it should be a single page website
   * What could the design of the site look like? Implement some of your ideas.
   * Use a logo of your choice for the site 
   * BONUS: The current page is highlighted in the menu


## Task 3 - Loading Data from a REST-Service

   * Display all Universes and Stars provided by the mock server 
   * A simple table on the "universes"-site for displaying all universes
   * A simple table on the "stars"-site for displaying all the stars
   * HINT: A simple table means a simple representation - just display the info
   * BONUSES:
      * Universes: display the maximum and current size
      * Stars: display the name of the universe
      * Use the color of the star for some CSS styling (the colors are RED, BLUE, GREEN, YELLOW, BLACK)

If you start the json-server with the mocked data it will present you with the list of available resource paths.


## Task 4 - JavaScript Toolchain

   * Use a CSS-Preprocessor to generate your CSS
   * Minify your CSS and JS and use the minified version in your application
   * HINT You don't need to automate the CSS-Preprocessor or minifying
   * BONUS-Task: Use a build tool or task runner to automate the build of your application
      * Do this only if you can do this fast enough, don't waste time


## Task 5 - Test your application

   * Write at least one test for your application
   * It is ok if the test is called manually
   * BONUS: your test(s) run without internet access


## Task 6 - CRUD for universes

   * Add a "Create-View" to the universe site where you can add a new universe. Each universe should have a unique id. 
   * Add a "Details-View" to the universe where you display only the stars from this universe
   * Add a "Create-Star-View" in the details view where you can add a star to the universe. A star can only be added to an existing universe.
   * Add a "Delete-Button" to the details view where you can delete a star.


## Task 7 - Pagination

   * Implement Pagination for the stars-site

🤞🏽 Good luck, we can't wait to discuss the solution with you.
