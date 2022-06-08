
package projectpoe;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Task extends JFrame implements ActionListener
{
//------------------------start of decleration----------------------------------

    JButton addTask, showReport, exitApp;
    
    JLabel title;
    
    String taskName, amountOfTasks2, taskDescriptionCheck, descriptionCorrect, descriptionIncorrect,
            firstNameOfDeveloper, lastNameOfDeveloper, durationOfTask2, letterOfTaskName,
            letterOfLastName, taskID, printDetails, statusOfTask2,tasksThatAreDone,displayReport,
            displayOptions2;
    
    int amountOfTasks, numberOfTasks, numberOfTasks2, durationOfTask, totalHours;
    
    ArrayList arrList = new ArrayList();
    

//-------------------------end of declaration---------------------------------//
//-------------------------start of method------------------------------------//
    Task()
    {
        //Creation of the exit button on the JFrame
        exitApp = new JButton();
        exitApp.setBounds(110, 280, 250, 60);
        exitApp.addActionListener(this);
        exitApp.setText("Quit");
      
        //Creation of the show report button on the JFrame
        showReport = new JButton();
        showReport.setBounds(110, 190, 250, 60);
        showReport.addActionListener(this);
        showReport.setText("Show report");

        //Creation of the add task button on the JFrame
        addTask = new JButton();
        addTask.setBounds(110, 100, 250, 60);
        addTask.addActionListener(this);
        addTask.setText("Add Task");

        //Creation of a JLabel that labels the JFrame "Welcome to EasyKanBan"
        title = new JLabel();
        title.setBounds(170, 0, 250, 100);
        title.setText("Welcome to EasyKanBan");

        //Creation of the JFrame
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(500, 500);
        this.setVisible(true);
        this.add(addTask);
        this.add(title);
        this.add(showReport);
        this.add(exitApp);
    }
//-------------------------Start of action performed--------------------------//
    
    @Override
    public void actionPerformed(ActionEvent e)
    {
       numberOfTasks = 0;
        
       //If add task button is clicked asks for amount of tasks and then loops
       //through all of the methods to populate the task
        if (e.getSource() == addTask)
        {

            amountOfTask();

            for (int i = 0; i < amountOfTasks; i++)
            {
                enterTaskName();
                developerDetails();
                JOptionPane.showMessageDialog(null, "Task Number " + numberOfTasks++);
                taskDescriptionOutput();
                taskStatus();
                taskDuration();
                createTaskID();
                returnTotalHours();
                printTaskDetails();
            }
            //printTaskDetails();
        }
        //If exit button is clicked it will ask the user if they want to exit the app
        if (e.getSource() == exitApp && JOptionPane.showConfirmDialog(exitApp, "Are you sure "
                + " you want to quit", "EasyKanban",
                JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION)
        {

            System.exit(0);
        }

        //If show report button is clicked it will display "Coming soon"
        if (e.getSource() == showReport)
        {
            JOptionPane.showMessageDialog(null, "Coming soon");
            
        }
    }
//---------------------End of Action Performed--------------------------------//

//---------------------start of method----------------------------------------//
    
    //Creation of a method in which the user inputs the amount of tasks they want to do
    public int amountOfTask()
    {
        amountOfTasks2 = JOptionPane.showInputDialog("How many tasks do you want to do ?");
        amountOfTasks = Integer.parseInt(amountOfTasks2);

        return amountOfTasks;
    }

//-----------------------end of method----------------------------------------//
    
//-----------------------start of method--------------------------------------//
    public boolean checkTaskDescription()
    {
        taskDescriptionCheck = JOptionPane.showInputDialog("Please enter a task description of less than "
                + "50 characters");

        if (taskDescriptionCheck.length() <= 50)
        {
            return true;
        }
        return false;
    }

//----------------------------end of method-----------------------------------//
    
//--------------------------Start of method-----------------------------------//
    //Creation of taskDescription that returns if the task is captured or is incorrect due to it being to long
    public String taskDescriptionOutput()
    {
        descriptionCorrect = "Task successfully captured";
        descriptionIncorrect = "Please enter a task description of less than 50 characters";

        if (checkTaskDescription() == true)
        {
            System.out.println(descriptionCorrect);
            JOptionPane.showMessageDialog(null, "Task successfully captured");
        } else
        {
            System.out.println(descriptionIncorrect);
            JOptionPane.showMessageDialog(null, "Please enter a task description of less than 50 characters");
        }
        return descriptionCorrect ;
    }

//-----------------------------end of method----------------------------------//
    
//----------------------------start of method---------------------------------//
    
    //method in which user enters the taskname
    public String enterTaskName()
    {
        taskName = JOptionPane.showInputDialog("Enter task name");

        return taskName;
    }

//-----------------------------end of method----------------------------------//

//-------------------------start of method------------------------------------//
    
    //Method where the user enters the developers first name and last name
    public String developerDetails()
    {
        firstNameOfDeveloper = JOptionPane.showInputDialog("First name of developer");
        lastNameOfDeveloper = JOptionPane.showInputDialog("Enter last name of developer");

        return firstNameOfDeveloper + lastNameOfDeveloper;

    }
    
//-------------------------end of method--------------------------------------//

//-------------------------start of method------------------------------------//
    
    //Method where the user inputs the duration of the task
    public int taskDuration()
    {
        durationOfTask2 = JOptionPane.showInputDialog(null, "Enter the duration of the task");
        durationOfTask = Integer.parseInt(durationOfTask2);

        return durationOfTask;

        
    }
//------------------------End of method---------------------------------------//
    
//------------------------start of method-------------------------------------//
    //Creation of method that calculates the total duration of all tasks
    public int returnTotalHours()
    {
        totalHours += durationOfTask;

        JOptionPane.showMessageDialog(null, "Hours :" + totalHours);

        return totalHours;
    }
//---------------------end of method------------------------------------------//

//---------------------start of method----------------------------------------//
    //Creation of method that creates the taskID
    public String createTaskID()
    {
        //Slicing the string to get the first two characters of the task name
        letterOfTaskName = taskName.substring(0, 2);
        
        //Slicing the string of the last name of the developer to get the last 3 characters of the string
        letterOfLastName = lastNameOfDeveloper.substring(lastNameOfDeveloper.length() - 3);
        
        //Formatting of the taskID
        taskID = letterOfTaskName + ":" + numberOfTasks + ":" + letterOfLastName;
        
        //Converting the taskID string to all UpperCase
        taskID.toUpperCase();
        JOptionPane.showMessageDialog(null, taskID.toUpperCase());
        return taskID.toUpperCase();
    }
//----------------------end of method-----------------------------------------//

//----------------------start of method---------------------------------------//
    
    //Creation of a method that prints out all of the details of each task
    public String printTaskDetails()
    {
        arrList.add("Status of task : " + statusOfTask2);
        arrList.add("First name of developer : " + firstNameOfDeveloper);
        arrList.add("Last name of developer : " + lastNameOfDeveloper);
        arrList.add("Task number : " + numberOfTasks);
        arrList.add("Task name : " + taskName);
        arrList.add("Task description :" + taskDescriptionCheck);
        arrList.add("Task ID : " + taskID);
        arrList.add("Duration : " + totalHours);
        
        //Converting the array list to a string 
        printDetails = arrList.toString();

        JOptionPane.showMessageDialog(null, printDetails);

        return printDetails;

//--------------------------------end of method-------------------------------//
    }
//-----------------------------------start of method--------------------------//
    
    //Creation of a method in which the user inputs the status of the task
    public String taskStatus()
    {
        String[] status = new String[3];

        status[0] = "To Do";
        status[1] = "Done";
        status[2] = "Doing";
        
        Object statusOfTask = JOptionPane.showInputDialog(null, "Select the task status",
                 "Status selection", JOptionPane.QUESTION_MESSAGE, null, status, "To do");
        
        statusOfTask2 = statusOfTask.toString();

        return statusOfTask2;
        
//-----------------------------end of method----------------------------------//
    
    }
    

}
