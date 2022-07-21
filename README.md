#Reference

##Maven Command

1. mvn 

2. mvn compile

3. mvn clean package

4. mvn spring-boot:run

5. mvn clean package spring-boot:run

6. mvn spring-boot:run -Dspring-boot.run.arguments="--[keyword][argument]"

7. mvn spring-boot:run -Dspring-boot.run.arugments="--[keyword][argument] --[keyword][argument]"

8. mvn clean test

##Git command

1. git init (initialize a local repo)

2. git remote add origin [ssh]

3. git add .

4. git status

5. git commit -m "message"

6. git push -u origin master (creates branch master and push code to it)

7. git checkout -b develop (creates develop branch and shifts to develop branch) -b > make new branch 

8. or git branch [branch] (creates new branch)

9. git branch -d [branch] (deletes branch)

10. git push -u push origin [develop] (pushes up to develop branch or any other branch you like)

##Deploy to heroku
1. Ensure that there is system.properities in project root with [java.runtime.version=18]

2. Ensure that when running heroku, must be on master branch locally and remote 

3. heroku apps:create

4. git remote -v to check if heroku has been added to remote

5. git push -u heroku master >> deploying app to heroku