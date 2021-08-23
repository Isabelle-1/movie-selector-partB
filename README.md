# movie-selector-partB
Initial plan
    - Start by setting up a git repository 
    - Use springInitializr to start up a gradle project
    - Create controller, entity, repository and service packages
    - Create Classes under each package
    - 
    - Inside each class, use appropriate annotations to begin writing methods
    - Use thymeleaf and html to begin front-end design of the project
    - Use methods to connect h2 database to front-end 
    - Use css to style the front end
    - Write appropriate tests for the MS 

Statement of purpose for the MS
    BUSINESS PROBLEM:
    With the film industry producing thousands of new movies on average each year, the vast and ever expanding catalogue of movie options makes it extremely difficult for people to quickly deside what to watch.
    WHAT THE MS WILL DO:
    The purpose of my Microservice is simply to aid users in finding appropriate movies to watch based on their mood. 
    THE TARGET AUDIENCE:
    The MS will be able to reach a large demographic, as it targets anyone interested in watching movies reguardless of gender, age, race, income etc.

List of features
    -Textboxes:
        The user will open the site and use the textboxes provided to input their desired number of movies as well as the mood they would like to base their search on.

    -Submit button:
        The front page will have a submit button, which will take the user to the ‘results’ page, and display a list with the requested movies. 

    -Reset button
        The reset button will reset the users input incase of a mistake.

    -‘Select more movies’ link
        The results page will also include a ‘Select more movies’ link, which, once clicked, will take the user back to a fresh front page, where the user can select a different number of movies or mood.
  In addition to these features, the front page will display text that lets the user know where to input their mood and preferred number of movies, as well as letting the user know key words to use, such as "Happy".

Implementation plan
    I began by setting up a repository on git hub, and creating the README file for the project.
    I then started a new project using SpringInitalizr.
    I downloaded dependencies such as h2 database, thymeleaf and spring web
    I began by  creating the controller, entity, repository and service packages, and adding classes under each package.
    I then worked on each class, and added two html files to see how the page would interact.
    I connected the h2 database to the project and added some begining movies to it.
    I added an @Query to the repository, which helped select movies from the database.
    In the controller I made a loop and an if statement which work together to select the movies based on the users input and list them out. At first I used the console to know if the movies in the database were linked and if the for loop and if statment had worked.
    From there I was able to use the result.html file to display the result of the movie list.
    I added css to both greeting.html and result.html to make the webpage more user friendly, but kept it simple for two reasons; The time limit, and the minimalistic design that I was going for.



