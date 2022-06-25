<h1> To Do program </h1>

<h3> Description of the program </h3>

<p> This program was created to allow managers to track the progress of their software developers progress on the tasks they were assagined and thus allows for 
    a more efficient way of managing a team of software developers and allows for managers to know if their team are falling behind on a certian section of a
    project they are working on </p>
    
<h3> How to use the program </h3>

<p> the user will need to register and then login to the program, to add tasks you will need to click the add task button and the user will be asked how many tasks they wish to enter after that it  will display prompts 
 in which the user will enter data into those prompts these prompts include "Task name","Developer details","Task description", and "Task Duration". The program 
 will then generate a custom Task ID to that task and after entering all of the tasks you wish to enter it will add up all of the total hours spent on each task entered.</p>

<p> to display these tasks you will need to click the display report button on the program this will display a menu in which you can choose from many options to choose
what you wish to display</p>

<p> if you wish to exit the program you can click the exit button and it will display a prompt asking if you want are sure you want to exit the program</p>
 
 <h3> Guideline to the source code </h3>
 
 <p> The source code consists of <em> 3 classes </em> the <em> main </em> class is <em> ProjectPOE </em> this is where all of the main methods are called into and the program is run. the second class is called <em> Login </em> and this is where the code needed to allow the user to login in is, the <em> start </em> of the <em> Login </em> class consists of the declerations for global variables, after the declerations are the methods where the prompts for the user input is displayed and the user input is checked if it is correctly formatted, after the methods to check user input are the <em> While Loops </em> where it checks the username and password entered
and if the methods that checked if they were correctly formatted return true the user is then able to pass onto the login section of the program but if the methods
return false then the user is not able to proceed until they enter correctly formatted usenames and passwords. After the while loop to check if the username and password
are correctly formatted there are methods which ask the user to enter in their <em> Registered username and password </em> and these methods will return either true
or false if the username and password are entered in correctly or incorrectly, after the <em> Login Methods </em> is the <em> While Loop </em> to check if the password
and username entered are correct and if they are correct the user will be able to continue to the program but if they are incorrect then the user will have to renter 
their registered username and password until they are correct. The <em> Third class is the Task class </em> this is the class where the <em> To Do </em> program is made  the <em> Start </em> of the class is where all of the decleration of variables are, After the declerations is a method in which the <em> JFrame </em> is created
    and this method consists of the <em> JButtons </em> used for the program. after the creation of the JFrame is the <em> Action Performed </em> method where certian
actions take place depending on which button you click these actions are <em> "Add Task","Show Report", and "Exit" </em> in the Action Performed method are if statements the <em> First If Statement </em> consists of a loop that populates arrays with input from the user. the <em> Second If Statement </em> consists of a
prompt that asks if they are sure they want to exit the program or not. The <em> Third If Statement </em> consists of a method that displays a menu and asks
the user what they wish to display from the tasks they added the methods to display these certian reports is near the end of the file. After the Action performed
method are the methods that display prompts for the user to enter regarding the details of the task they wish to enter and these methods check if the information
entered are correctly formatted and they display error messages if they are not formatted correctly, after the methods that receive user input are the methods
that are used to display reports depending on what the user wants to display, these methods <em> conists of If Statements and For Loops </em> to itterate
through the populated arrays and display the wanted information from the tasks, The <em> Last Method </em> consists of a switch statement which displays
a menu and asks the user what they wish to display from the tasks. </p>
