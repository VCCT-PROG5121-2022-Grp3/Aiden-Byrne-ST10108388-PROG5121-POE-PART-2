
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

//-------------------------end of declaration-----------------------------------
//-------------------------start of method--------------------------------------
    Task()
    {
        exitApp = new JButton();
        exitApp.setBounds(110, 280, 250, 60);
        exitApp.addActionListener(this);
        exitApp.setText("Quit");
      
        showReport = new JButton();
        showReport.setBounds(110, 190, 250, 60);
        showReport.addActionListener(this);
        showReport.setText("Show report");

        addTask = new JButton();
        addTask.setBounds(110, 100, 250, 60);
        addTask.addActionListener(this);
        addTask.setText("Add Task");

        title = new JLabel();
        title.setBounds(170, 0, 250, 100);
        title.setText("Welcome to EasyKanBan");

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(500, 500);
        this.setVisible(true);
        this.add(addTask);
        this.add(title);
        this.add(showReport);
        this.add(exitApp);
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {

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
            }
            printTaskDetails();
        }

        if (e.getSource() == exitApp && JOptionPane.showConfirmDialog(exitApp, "Are you sure "
                + " you want to quit", "EasyKanban",
                JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION)
        {

            System.exit(0);
        }

        if (e.getSource() == showReport)
        {
            JOptionPane.showMessageDialog(null, "Coming soon");
            
        }
    }
    //---------------------end of method----------------------------------------

    //---------------------start of method--------------------------------------
    public int amountOfTask()
    {
        amountOfTasks2 = JOptionPane.showInputDialog("How many tasks do you want to do ?");
        amountOfTasks = Integer.parseInt(amountOfTasks2);

        return amountOfTasks;
    }

//-----------------------end of method------------------------------------------
//-----------------------start of method----------------------------------------
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

//----------------------------end of method-------------------------------------
//--------------------------Start of method-------------------------------------
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
        return descriptionCorrect + descriptionIncorrect;
    }

//-----------------------------end of method------------------------------------
//----------------------------start of method-----------------------------------
    public String enterTaskName()
    {
        taskName = JOptionPane.showInputDialog("Enter task name");

        return taskName;
    }

//-----------------------------end of method------------------------------------
//----------------------------start of method-----------------------------------
    public int taskNumber()
    {
        numberOfTasks = 0;
//        for (numberOfTasks = 0; numberOfTasks < amountOfTasks; numberOfTasks++)
//        {
//            JOptionPane.showMessageDialog(null, numberOfTasks);
//        }
        return numberOfTasks;
    }
//-------------------------end of method----------------------------------------

//-------------------------start of method--------------------------------------
    public String developerDetails()
    {
        firstNameOfDeveloper = JOptionPane.showInputDialog("First name of developer");
        lastNameOfDeveloper = JOptionPane.showInputDialog("Enter last name of developer");

        return firstNameOfDeveloper + lastNameOfDeveloper;

    }
//-------------------------end of method----------------------------------------

//-------------------------start of method--------------------------------------
    public int taskDuration()
    {
        durationOfTask2 = JOptionPane.showInputDialog(null, "Enter the duration of the task");
        durationOfTask = Integer.parseInt(durationOfTask2);

        return durationOfTask;

        //----------------end of method-----------------------------------------
    }
//------------------------start of method---------------------------------------

    public int returnTotalHours()
    {
        totalHours += durationOfTask;

        JOptionPane.showMessageDialog(null, "Hours :" + totalHours);

        return totalHours;
    }
//---------------------end of method--------------------------------------------

//---------------------start of method------------------------------------------
    public String createTaskID()
    {
        letterOfTaskName = taskName.substring(0, 2);
        letterOfLastName = lastNameOfDeveloper.substring(lastNameOfDeveloper.length() - 3);
        taskID = letterOfTaskName + ":" + numberOfTasks + ":" + letterOfLastName;
        taskID.toUpperCase();
        JOptionPane.showMessageDialog(null, taskID.toUpperCase());
        return taskID.toUpperCase();
    }
    //----------------------end of method---------------------------------------

    //----------------------start of method-------------------------------------
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

        printDetails = arrList.toString();

        JOptionPane.showMessageDialog(null, printDetails);

        return printDetails;

        //---------------------------end of method------------------------------
    }
//-----------------------------------start of method----------------------------
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
        
    //-----------------------------end of method--------------------------------
    
    }
    
//    public String taskReport()
//    {
//    
//    tasksThatAreDone = " Display all of the tasks with the status of done";
//    displayReport = "Display full report";
//    
//    String [] display = new String [2];
//    display[0] = tasksThatAreDone;
//    display[1] = displayReport;
//    
//    Object displayOptions = JOptionPane.showInputDialog(null, "Select what you wish to display",
//                 "Display options", JOptionPane.QUESTION_MESSAGE, null,display , "To do");
//    
//    displayOptions2 = displayOptions.toString();
//    return displayOptions2;
//    }
//            
//    public void returnDisplayOptions()
//    {
//     if (taskReport() == tasksThatAreDone)
//     {       
//     JOptionPane.showMessageDialog(null,statusOfTask2);
//     }
//     System.out.println("broken");
//    }
}
