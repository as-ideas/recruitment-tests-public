# JS-Frontend-Test

This test is for developers with focus on the frontend.
The overall task is to use a REST-API and create a single-page-application (SPA).

If you are doing this test at our office, the objective is to have enough material to help us judge your expertise and style of working. We do not expect you to finish all tasks! Nonetheless please work on as many as you can in affordable time.

If you are doing this test at home, the objective is a bit different. We will still use your solution to judge your expertise and working style, but we expect a complete solution with a high level of quality.

You may skip a task if you like to continue working on a following task or you can go through
each task, commit to a branch, or tag the final solution to each task. In the end we would like to have a piece of software that tells us how you work. Once done, we will go through your solution allowing you to explain your rationale.

__Please deliver less tasks but with higher quality rather than many tasks in lesser quality.__

There is a Star-API, which you will need to use, cf. https://happy-stars.herokuapp.com/

Hints:

   * Use the IDE, Tools, JS-Librarys or CSS-Framework you are most comfortable with
   * Prefer simple solutions you can explain than complex solutions you don't even grok.


## Task 1 - Showing a static HTML page

   * Add an index.html with a headline to your project with a simple "Hello World"
   * Include a css-file and a js-file
   * Open the page in the browser, it should display the page and load the css- and js-file.


## Task 2 - Add a Menu & Single-Page-Site

   * Add a menu to your page with the three entries:
      * Universes
      * Stars
      * Imprint
   * The three pages should be navigable and it should be a single page website
   * Use some CSS-Styling for the menu and use a logo for the site
      * You can use one of the images from https://happy-stars.herokuapp.com/
   * BONUS: The current site is highlighted in the menu


## Task 3 - Loading Data from a REST-Service

   * Display all Univeres and Stars from the Webservice https://happy-stars.herokuapp.com/
   * A simple table on the "universes"-site for displaying all universes
   * A simple table on the "stars"-site for displaying all the stars
   * HINT: A simple table means a simple representation, just displaying the infos
   * BONUS:
      * Displaying the universes: display the maximum and current size
      * Displaying the stars: display the name of the universe
      * Use the color of the star for some CSS styling (the colors are RED, BLUE, GREEN, YELLOW, BLACK)

## Task 4 - JavaScript Tool Chain

   * Use a CSS-Preprocessor for you CSS
   * Minify your CSS and JS and use the minified version in your application
   * HINT You don't need to automate the CSS-Preprocessor or minifying
   * BONUS-Task: Use a build tool or task runner to automate the build of your application
      * Do this only if you can do this fast enough, don't waste time


## Task 5 - Create Unit-Tests for your JS

   * Write at least one unit test for your JS code
      * eg. test the calls to the webservices
   * It is ok if the test is called manually


## Task 6 - CRUD for universes

   * Add a "Create-View" to the universe site where you can add a new universe
   * Add a "Details-View" to the universe where you display only the stars from this universe
   * Add a "Create-Star-View" in the details view where you can add a star to the universe
   * Add a "Delete-Button" to the details view where you can delete a star


## Task 7 - Pagination

   * Implement Pagination for the stars-site


## BONUS-Task - Design

   * The STAR-API contains some images. Use the images to make your website look cooler!
   * Create a nice color scheme and let your website shine.
