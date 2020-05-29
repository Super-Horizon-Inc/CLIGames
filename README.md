# CLIGames
This is a program using Command Line Interface platform to design based role playing games.

* Useful links:

  * Installing Maven:
    * Link: http://maven.apache.org/install.html
    * Setup system environments:
      * M2_HOME = extracted_Maven_folder_path
      * Path += M2_HOME/bin
    * Check installed version: mvn -v
  
  * Creating Maven project: Use default IntelliJ Maven artifact.quickstart (choose import Maven project when small window pop-up)
    
  * Adding dependencies to Maven:
    * Hibernate:
      * Link: https://mvnrepository.com/artifact/org.hibernate/hibernate-core/5.4.16.Final
      * Add the following to Maven pom.xml (inside IntelliJ)
        https://github.com/develop1992/CLIGames/issues/3#issue-626851622 (all inside <dependencies>)
    * Oracle:
      * Following this link: https://mkyong.com/maven/how-to-add-oracle-jdbc-driver-in-your-maven-local-repository/
      * Adding to dependencies similar to Hibernate
      
  * Installing dependencies automatically by Maven in IntelliJ terminal: mvn install
  
  * Steps to do git in Git Bash terminal:
    * git pull origin master    (pull code from master branch to my local: for latest code)
    * git checkout -b [name_of_branch]    (create a new branch and switch to it)
    * git status  (show which files are changed by me)
    * git add [path_changed_file1] [path_changed_file2] ... (get changed files be ready to be committed)
    * git commit -m "message_explain_what_you_did"  (pack the changed files up along with message, still on local)
      (add and commit should group related files together, so we can provide clear explaination, they may be repeated many times)
    * git push origin [name_of_branch]  (push all files from local to remote)
    * Go to Github account and create new pull request.
  
