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
    * git checkout master  (switch direction to master repository)
    * git pull origin master    (pull code from master branch to my local: for latest code)
    * git checkout -b [name_of_branch]    (create a new branch and switch to it)
    * git status  (show which files are changed by me)
    * git add [path_changed_file1] [path_changed_file2] ... (get changed files be ready to be committed)
      * git add --all  (do this if want to push all RELATED modified file, don't do this if the files will be divided to many groups)
    * git commit -S -m "message_explain_what_you_did"  (pack the changed files up along with message(-m) and signed(-S), still on local)
      * (add and commit should group related files together, so we can provide clear explaination, they may be repeated many times)
      * git checkout -b [name_of_branch]  (do this if forgot to create new branch in the beginning)
    * git push origin [name_of_branch]  (push all files from local to remote)
    * Go to Github account and create new pull request.
    * Generate key to use for signed commits: ( follow https://git-scm.com/book/en/v2/Git-Tools-Signing-Your-Work )
      * gpg --gen-key
        * ( at prompt time, please enter your name (ex: Scott Chacon) and your email (ex: schacon@gmail.com) )
        * set prephrase password, you will be using it each time running git commit -S -m "your_message"
      * git config --global user.signingkey `Key that was generated when you ran gpg --gen-key (the key is what shows up under pub section`
      
