
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
    
     private String taskName, amountOfTasks2, taskDescriptionCheck, descriptionCorrect, descriptionIncorrect,
            firstNameOfDeveloper, lastNameOfDeveloper, durationOfTask2, letterOfTaskName,
            letterOfLastName, taskID, printDetails, statusOfTask2,tasksThatAreDone,displayReport,
            displayOptions2,showTaskName;
    
   private int amountOfTasks, numberOfTasks, numberOfTasks2, durationOfTask, totalHours;
    
   private ArrayList arrList = new ArrayList();
    
   private String[] arrayTaskName = new String[10];
    
   private String[] arrayDevDetails = new String[10];
    
   private  int[] arrayTaskNumber = new int[10];
    
   private int[] arrayTotalDuration = new int[10];
    
   private  int[] arrayDuration = new int[10];
     
   private String[] arrayTaskDescriptionOutput = new String[10];
    
   private String [] arrayTaskStatus = new String[10];
    
   private String[] arrayTask = new String[10];
    
   private String[] arrayTaskId = new String[10];
    
   private int taskAmount;
    

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

            taskAmount = amountOfTask();
           
            if(taskAmount < 10)
            {
            for (int i = 0; i < taskAmount; i++)
            {
                   arrayTaskName[i] = enterTaskName();
                   arrayDevDetails[i] =   developerDetails();
                   arrayTaskNumber[i]  = numberOfTasks++;
                   arrayTaskId[i] = createTaskID(taskName,numberOfTasks,lastNameOfDeveloper);
                   arrayDuration[i] = taskDuration();
                   arrayTaskDescriptionOutput[i] =  taskDescriptionOutput();
                   arrayTaskStatus[i] =  taskStatus();
            }
             //System.out.println(printDetails);
        }else
        {
            JOptionPane.showMessageDialog(null,"You cannot enter in more than 10 tasks");
        }
        }
        
        //If exit button is clicked it will ask the user if they want to exit the app
        if (e.getSource() == exitApp && JOptionPane.showConfirmDialog(exitApp, "Are you sure "
                + " you want to quit", "EasyKanban",
                JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION)
        {

            System.exit(0);
        }

        //If show report button is clicked it will display a menu in which you can choose what you wish to display
        if (e.getSource() == showReport)
        {
                 reportMenu();
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
        return taskDescriptionCheck ;
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
        totalHours = 0;
        totalHours += durationOfTask;

        JOptionPane.showMessageDialog(null, "Hours :" + totalHours);

        return totalHours;
    }
//---------------------end of method------------------------------------------//

//---------------------start of method----------------------------------------//
    
    //Creation of method that creates the taskID
    public String createTaskID(String taskIDName,int taskIDnumber,String developerName)
    {
        //Slicing the string to get the first two characters of the task name
        letterOfTaskName = taskIDName.substring(0, 2);
        
        //Slicing the string of the last name of the developer to get the last 3 characters of the string
        letterOfLastName = developerName.substring(developerName.length() - 3);
        
        //Formatting of the taskID
        taskID = letterOfTaskName + ":" + taskIDnumber + ":" + letterOfLastName;
        
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
    }
//--------------------------------end of method-------------------------------//
    
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
//----------------------------Start of method---------------------------------//
    
    //Method to show all of the tasks with the status of done
    public void showingTaskStatus()
    {
         for(int i = 0;i < taskAmount;i++)
         {
             if (arrayTaskStatus[i] == "Done")
             {                 
                 System.out.println(arrayTaskName[i]);
                 System.out.println(arrayDevDetails[i]);
                 System.out.println(arrayTaskStatus[i]);
                 System.out.println(arrayDuration[i]);
             }
         }  
         
    }
//---------------------End of method------------------------------------------//

//--------------------Start of method-----------------------------------------//
  
  //method which is used to show the task name entered and display all of the details of the task
  public void showingTaskName()
  {
//      String showTaskName = JOptionPane.showInputDialog("Enter the name of the task you want to find");
        String theTaskName = showTaskName;
        System.out.print(theTaskName);
      for(int i = 0 ; i < taskAmount;i++)
      {
          if(arrayTaskName[i].equals(theTaskName))
          {
              System.out.println(arrayTaskName[i]);
              System.out.println(arrayDevDetails[i]);
              System.out.println(arrayTaskStatus[i]);
          }   
      }
  }    
  
//-----------------------End of method----------------------------------------//    

//-----------------------Start of method--------------------------------------//
  
  public void showingDevDetails()
  {
      String searchDevDetails = JOptionPane.showInputDialog("Enter the name of the developer");
      
      for(int i = 0; i < taskAmount; i++)
      {
         if(arrayDevDetails[i].equals(searchDevDetails))
         {
             System.out.println(arrayTaskName[i]);
             System.out.println(arrayTaskStatus[i]);            
         }
      }
  }
 //--------------------End of method------------------------------------------//
  
 //--------------------Start of method----------------------------------------//
 
  //Method to show the task with the longest duration
  public void showingDuration()
  {
      
      for(int i = 0; i<taskAmount; i++)
      {    
          if(arrayDuration[i] > arrayDuration[0]) 
          {
              arrayDuration[0] = arrayDuration[i];
              System.out.println(arrayDuration[0] + "Hours");
              System.out.println(arrayTaskName[i]);
              System.out.println(arrayDevDetails[i]); 
          }   
      }
  }
  
//------------------End of method---------------------------------------------//
  
//---------------------Start of method----------------------------------------//

public void displayReport()
{
    for(int i = 0; i < taskAmount; i++)
    {
        System.out.println(arrayTaskStatus[i]);
        System.out.println(arrayDevDetails[i]);
        System.out.println(arrayTaskNumber[i]);
        System.out.println(arrayTaskName[i]);
        System.out.println(arrayTaskDescriptionOutput[i]);
        System.out.println(arrayTaskId[i]);
        System.out.println(arrayDuration[i]);
    }
}

//-------------------------End of method--------------------------------------//

//--------------------------Start of method-----------------------------------//

//Method for removing a task 
public void removingTask()
{
    String removeTask = JOptionPane.showInputDialog("Which task do you want to remove ?");
    
    int k = 0;
 
    for(int i = 0 ; i < taskAmount;i++)
    {
        if(!arrayTaskName[i].equals(removeTask))
        {
            arrayTaskName[k] = arrayTaskName[i];
            arrayDevDetails[k] = arrayDevDetails[i];
            arrayTaskNumber[k] = arrayTaskNumber[i];
            arrayTaskDescriptionOutput[k] = arrayTaskDescriptionOutput[i];
            arrayTaskId[k] = arrayTaskId[i];
            arrayTaskStatus[k] = arrayTaskStatus[i];
            k++;
        }
    }
            taskAmount--;
} 

//-----------------------End of method----------------------------------------//

//-----------------------Start of method--------------------------------------//

//Method that shows a popup menu and the user can choose what they wish to display from the options available
public void reportMenu()
{
    String pickReportOption = JOptionPane.showInputDialog("1.Display a Report\n" + "2.Remove a task\n"+
           "3.Display all tasks with the status of done\n" + "4.Display the Task with the longest duration\n" + 
                   "5.Search for all tasks " 
                   + "assigned to a developer\n" + "6.Exit the menu");
            switch(pickReportOption)
            {
                case "1":
                   displayReport();
                   reportMenu();
                   break;
                case "2":
                    removingTask();
                    reportMenu();
                    break;
                    
                case "3":
                    showingTaskStatus();
                    reportMenu();
                    break;
                    
                case "4":
                   showingDuration();
                   reportMenu();
                   break;
                
                case "5":
                    showingDevDetails();
                    reportMenu();
                    break;
                    
                case "6":
                    break;
                 
            }
            
}

//------------------------------End of method---------------------------------//
}
//10000011101001110010011001011101110__ END OF FILE__ 10000101111001111001011011101100101//