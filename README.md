# CLIGames
This is a program using Command Line Interface platform to design based role playing games.

* The Rules to Build a Game:
  * As a player I can create a character
  * As a player I can explore
  * As a player I can gain experience through fighting
  * As a player I can save and resume this game
  
* Technical Constraints:
  * Use Java
  * Libraries and Frameworks are allowed for testing and build piplines only
  * Use best in industry agile engineering practices
  * Build for the command line
  
* Usefull info:

  * Creating Maven project:
    * Use default IntelliJ Maven artifact.quickstart (choose import Maven project when small window pop-up)

  * Adding dependencies to Maven:
    * Hibernate:
      * Link: https://mvnrepository.com/artifact/org.hibernate/hibernate-core/5.4.16.Final
      * Add the following to Maven pom.xml (inside IntelliJ)
        https://github.com/develop1992/CLIGames/issues/3#issue-626851622 (all inside <dependencies>)
      
  * Installing dependencies automatically by Maven in IntelliJ terminal: 
    * mvn install
  
  * Steps to do git in Git Bash terminal:
    * git checkout master (switch from branch to master in local)
    * git pull origin master    (pull code from master branch to my local: for latest code)
    * git checkout -b [name_of_branch]    (create a new branch and switch to it)
    * git status  (show which files are changed by me)
    * git add [path_changed_file1] [path_changed_file2] ... (get changed files be ready to be committed)
      special: git add --all  (to add all RELATED modified files in one time, don't use it if files are divided to many commits)
    * git commit -m "message_explain_what_you_did"  (pack the changed files up along with message(-m), still on local)
      (add and commit should group related files together, so we can provide clear explaination, they may be repeated many times)
    * git push origin [name_of_branch]  (push all files from local to remote)
    * Go to Github account and create new pull request.
  
