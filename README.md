# CLIGames
This is a program using Command Line Interface platform to design based role playing games.




* The stories:

  * As a player I want to create a character
  * As a player I want to explore
  * As a player I want to gain experience through fighting
  * As a player I want to save and resume a game
  * ...
  
* Technical constraints:

  * Use Java
  * Libraries and Frameworks are for testing and build pipelines only
  * Use best in industry agile engineering practices
  * Build for the command line
  * ...

* Useful Instruction:

  * How to install Maven: 
      * Go to the link: https://maven.apache.org/install.html
      * Setup system environments for Maven:
        * M2_HOME = installed Maven path (not include bin)
        * Path += M2_HOME\bin
      
  * Maven Dependencies: https://mvnrepository.com/
    * List of Dependencies: (need to add in pom file under <dependencies> element)
      * Hibernate: 
        * Dependency in https://mvnrepository.com/artifact/org.hibernate/hibernate-core/5.4.16.Final
        * Add the following within Maven pom.xml file:
          https://github.com/develop1992/CLIGames/issues/3#issue-626851622
      * Oracle:
        * Follow https://mkyong.com/maven/how-to-add-oracle-jdbc-driver-in-your-maven-local-repository/
        * Same as Hibernate
    
    * Install dependencies: mvn install (in terminal)
    
        
        
    
      
