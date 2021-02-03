# Reskill Java Group
Shared repository and Java project for all students in the Java group. 

# Intention of repository
Simple sharing of code, helping each other and also train using GIT.

# Howto use
*Feel free to update the guide below if you want to add more info, commands or comments along the way*

All commands are ment to be written in the **Command line/terminal**. A UI application like GitHub Desktop (https://desktop.github.com/) can also be used, or f.ex Tortoise GIT (https://tortoisegit.org/) which makes GIT commands available through right clicking folders in f.ex. the Windows UI.

## Initialize GIT
### Clone this repository to your local machine
(Will create a folder "ReskillJavaGroup" in the location you're when running the clone command)\
``git clone https://github.com/ZiggyHowland/ReskillJavaGroup.git``

### Open project in IntelliJ
Open project in IntelliJ and verify you can run the code in your package.

###Alternative method
Open IntelliJ - new project from version control - choose GitHub 

## Using GIT to upload your code

### Create branch
Create a new GIT branch to avoid doing changes directly to main.\

> ``git pull`` - Always pull updates before creating a branch (good habit = good practice) 

``git branch [yourBranchName]`` - Create the branch\
``git checkout [yourBranchName]`` - Switch to the branch\
OR\
``git checkout -b [yourBranchName]`` - Create and switch to the new branch

### Write or change some code
Create a new file in your package in IntelliJ. Copy or write some code, and verify it works.

### Add your changes to GIT and commit the changes
``git add -A`` - Add your new file and/or changes to existing file to git staging\
``git commit`` - Commits the changes to your branch

### Switch to the main branch and merge your changes into main
``git checkout main`` - Switch back to the main branch\
``git pull`` - Always pull updates before merging (good habit = good practice)\
``git merge [yourBranchName]`` - Merge your updates into main\
\
Now the code is merged into main on your local GIT repository. To make it available for the rest of the group you need to push the changes to GitHub. 

### Pull and push
It's always good practice (good habit) to pull last changes from GitHub both before creating a new branch, and before pushing your changes to the server. This forces you to deal with file conflicts locally (which is good).\
``git pull`` - Downloads the latest changes from the GitHub remote repository (this project only)\
``git push`` - Uploads your changes and make them available for the rest of the Java group.

# Folder/Package structure
The 'src' folder contains a package 'dnb.reskill' and then you'll find one package per student (ex. 'arild', 'knut', 'marina', etc...)\
\
The structure inside your package is free to do as you like it, but since we're having labs daily it could be reasonable to add one package per day or date.\
\- src\
-- dnb.reskill\
--- arild \
---- day 11 (your daily code in here)
    
# Issues and problems
In the perfect world all commands work as they should, always. You will face some trouble along the way. There is a lot of situations appearing in GIT, due to file conflicts, different branches, code versions and so on. Just keep smiling, google it, discuss with the rest of group and it will be solved in the end.

