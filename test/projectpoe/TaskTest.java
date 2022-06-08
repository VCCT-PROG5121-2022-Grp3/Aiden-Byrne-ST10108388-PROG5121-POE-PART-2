
package projectpoe;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.FixMethodOrder;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TaskTest
{
    Task task = new Task();
    public TaskTest()
    {
    }

//---------------------Start of method----------------------------------------//
    
    @Test
    public void AtestAmountOfTask()
    {
        int expected = 2;
        int actual = task.amountOfTask(); 
        assertEquals(expected,actual);
    }
//-------------------End of method--------------------------------------------//
    
//-------------------Start of method------------------------------------------//
    
    @Test
    public void AtestCheckTaskDescription()
    {
        boolean expected = true;
        boolean actual = task.checkTaskDescription();
        assertEquals(expected,actual);
    }
//----------------End of method-----------------------------------------------//
    
//--------------------Start of method-----------------------------------------//
    
    @Test
    public void AtestTaskDescriptionOutput()
    {
         task.taskDescriptionCheck = "Create Login to authenticate users";
         String expected = "Task successfully captured";
         String actual = task.taskDescriptionOutput();
         assertEquals(expected,actual);
    }
//------------------End of method---------------------------------------------//
    
//------------------Start of method-------------------------------------------//
    
    @Test
    public void AtestEnterTaskName()
    {
        String expected = "Login Feature";
        String actual = task.enterTaskName();
        assertEquals(expected,actual);
    }
//-------------------End of method--------------------------------------------//
    
//-------------------Start of method------------------------------------------//
    
    @Test
    public void AtestDeveloperDetails()
    {
        String expected = "Robyn" + "Harrison";
        String actual = task.developerDetails();
        assertEquals(expected,actual);
        
    }
//---------------End of method------------------------------------------------//

//--------------Start of method-----------------------------------------------//
    
    @Test
    public void AtestTaskDuration()
    {
        int expected = 8;
        int actual = task.taskDuration();
        assertEquals(expected,actual);
        
    }
//------------End of method---------------------------------------------------//
    
//-------------------------Start of method------------------------------------//
    
    @Test
    public void AtestReturnTotalHours()
    {
    }
//-----------------------End of method----------------------------------------//
    
//-----------------------Start of method--------------------------------------//
    
    @Test
    public void AtestCreateTaskID()
    {
        task.lastNameOfDeveloper = "Harrison";
        task.taskName = "Login Feature";
        task.numberOfTasks = 0;
       
        String expected = "LO:0:SON";
        String actual = task.createTaskID();
        assertEquals(expected,actual);
        
    }
//--------------------End of method-------------------------------------------//
    
//-------------------Start of method------------------------------------------//
    
    @Test
    public void AtestTaskStatus()
    {
        String expected = "To Do";
        String actual = task.taskStatus();
        assertEquals(expected,actual);
    }
//-------------------End of method--------------------------------------------//    
   
//-------------------Start of method------------------------------------------//
    
    @Test
    public void BtestEnterTaskName()
    {
        String expected = "Add Task Feature";
        String actual = task.enterTaskName();
        assertEquals(expected,actual);
    }
//---------------End of method------------------------------------------------//

//--------------------Start of method-----------------------------------------//
    
    @Test
    public void BtestCheckTaskDescription()
    {
        boolean expected = true;
        boolean actual = task.checkTaskDescription();
        assertEquals(expected,actual);
    }
//----------------End of method-----------------------------------------------//
    
//---------------Start of method----------------------------------------------//
    
    @Test
    public void BtestTaskDescriptionOutput()
    {
         task.taskDescriptionCheck = "Create Add Task feature to add users";
         String expected = "Task successfully captured";
         String actual = task.taskDescriptionOutput();
         assertEquals(expected,actual);
    }
//----------------End of method-----------------------------------------------//

//------------------Start of method-------------------------------------------//
    
     @Test
    public void BtestDeveloperDetails()
    {
        String expected = "Mike" + "Smith";
        String actual = task.developerDetails();
        assertEquals(expected,actual);
        
    }
    
//------------------------End of method---------------------------------------//

//-----------------------Start of method--------------------------------------//
    
    @Test
    public void BtestCreateTaskID()
    {
        task.lastNameOfDeveloper = "Smith";
        task.taskName = "Add Task Feature";
        task.numberOfTasks = 1;
        
        String expected = "AD:1:ITH";
        String actual = task.createTaskID();
        assertEquals(expected,actual);
        
    }
//---------------------End of method------------------------------------------//
 
//---------------------Start of method----------------------------------------//
    
    @Test
    public void BtestTaskDuration()
    {
        int expected = 10;
        int actual = task.taskDuration();
        assertEquals(expected,actual);
        
    }
//--------------------End of method-------------------------------------------//

//---------------------Start of method----------------------------------------//
    
    @Test
    public void BtestTaskStatus()
    {
        String expected = "Doing";
        String actual = task.taskStatus();
        assertEquals(expected,actual);
    }
    
//-------------------End of method--------------------------------------------//    

}
