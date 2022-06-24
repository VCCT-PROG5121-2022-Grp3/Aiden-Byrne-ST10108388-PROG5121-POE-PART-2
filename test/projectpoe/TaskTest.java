
package projectpoe;

import org.junit.Test;

import org.junit.FixMethodOrder;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.assertEquals;
//import static org.junit.jupiter.api.Assertions.assertFalse;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TaskTest
{
    String lastName1;
    String taskDescription1;
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
    public void BtestCheckTaskDescription()
    {
        boolean expected = true;
        boolean actual = task.checkTaskDescription();
        assertEquals(expected,actual);
    }
//----------------End of method-----------------------------------------------//
    
//--------------------Start of method-----------------------------------------//
    
    @Test
    public void CtestTaskDescriptionOutput()
    {
        String taskDescription = "Create Login to authenticate users";
         task.taskDescriptionCheck = taskDescription;
         String expected = "Task successfully captured";
         String actual = task.taskDescriptionOutput();
         assertEquals(expected,actual);
    }
//------------------End of method---------------------------------------------//
    
//------------------Start of method-------------------------------------------//
    
    @Test
    public void DtestEnterTaskName()
    {
        String expected = "Login Feature";
        String actual = task.enterTaskName();
        assertEquals(expected,actual);
    }
//-------------------End of method--------------------------------------------//
    
//-------------------Start of method------------------------------------------//
    
    @Test
    public void EtestDeveloperDetails()
    {
        String expected = "Robyn" + "Harrison";
        String actual = task.developerDetails();
        assertEquals(expected,actual);
        
    }
//---------------End of method------------------------------------------------//

//--------------Start of method-----------------------------------------------//
    
    @Test
    public void FtestTaskDuration()
    {
        int expected = 8;
        int actual = task.taskDuration();
        assertEquals(expected,actual);
        
    }
//------------End of method---------------------------------------------------//
    
//-------------------------Start of method------------------------------------//
    
    @Test
    public void GtestReturnTotalHours()
    {
    }
//-----------------------End of method----------------------------------------//
    
//-----------------------Start of method--------------------------------------//
    
//    @Test
//    public void AtestCreateTaskID()
//    {
//        String lastName2 = "Harrison";
//        task.lastNameOfDeveloper = lastName2;
//        
//        String taskName = "Login Feature";
//        task.taskName = taskName;
//        
//        int numberTasks = 0;
//        task.numberOfTasks = numberTasks;
//       
//        String expected = "LO:0:SON";
//        String actual = task.createTaskID();
//        assertEquals(expected,actual);
//        
//    }
//--------------------End of method-------------------------------------------//
    
//-------------------Start of method------------------------------------------//
    
    @Test
    public void HtestTaskStatus()
    {
        String expected = "To Do";
        String actual = task.taskStatus();
        assertEquals(expected,actual);
    }
//-------------------End of method--------------------------------------------//    
   
//-------------------Start of method------------------------------------------//
    
    @Test
    public void ItestEnterTaskName()
    {
        String expected = "Add Task Feature";
        String actual = task.enterTaskName();
        assertEquals(expected,actual);
    }
//---------------End of method------------------------------------------------//

//--------------------Start of method-----------------------------------------//
    
    @Test
    public void JtestCheckTaskDescription()
    {
        boolean expected = true;
        boolean actual = task.checkTaskDescription();
        assertEquals(expected,actual);
    }
//----------------End of method-----------------------------------------------//
    
//---------------Start of method----------------------------------------------//
    
    @Test
    public void KtestTaskDescriptionOutput()
    {
        taskDescription1 = "Create Add Task feature to add users";
         task.taskDescriptionCheck = taskDescription1;
         String expected = "Task successfully captured";
         String actual = task.taskDescriptionOutput();
         assertEquals(expected,actual);
    }
//----------------End of method-----------------------------------------------//

//------------------Start of method-------------------------------------------//
    
     @Test
    public void LtestDeveloperDetails()
    {
        String expected = "Mike" + "Smith";
        String actual = task.developerDetails();
        assertEquals(expected,actual);
        
    }
    
//------------------------End of method---------------------------------------//

//-----------------------Start of method--------------------------------------//
    
    @Test
    public void MtestCreateTaskID()
    {
        //task.lastNameOfDeveloper = "Smith";
        lastName1 = "Smith";
        task.lastNameOfDeveloper =  lastName1;
        
        
        task.taskName = "Add Task Feature";
        task.numberOfTasks = 1;
        
        String expected = "AD:1:ITH";
       // String actual = task.createTaskID();
       // assertEquals(expected,actual);
        
    }
//---------------------End of method------------------------------------------//
 
//---------------------Start of method----------------------------------------//
    
    @Test
    public void NtestTaskDuration()
    {
        int expected = 10;
        int actual = task.taskDuration();
        assertEquals(expected,actual);
        
    }
//--------------------End of method-------------------------------------------//

//---------------------Start of method----------------------------------------//
    
    @Test
    public void OtestTaskStatus()
    {
        String expected = "Doing";
        String actual = task.taskStatus();
        assertEquals(expected,actual);
    }
    
//-------------------End of method--------------------------------------------//

//-------------------Start of method------------------------------------------//
    
@Test
public void PtestCreateTaskID()
{
    String[] developerNames = {"Robyn Harrison","Mike Smith"};
    
    String[] nameOfTasks = {"Add Login Feature","Add Task Feature"};
    
    String[] taskIDs = {"AD:0:SON","AD:1:ITH"};
    
    for(int i = 0; i <developerNames.length; i++)
    {
        String expected = taskIDs[i];
        String actual = task.createTaskID(nameOfTasks[i],i,developerNames[i]);
        assertEquals(expected,actual);
    }
}
//-----------------------------------End of method----------------------------//

//--------------------------------Start of method-----------------------------//

@Test
public void QtestReturnTotalHours()
{
    int[] durationOfTasks = {8,10};
    
    task.durationOfTask = durationOfTasks[0] + durationOfTasks[1];
    int actual = 0;
    
    for(int i = 0; i < 2;i++)
    {
        actual = task.returnTotalHours();
    }
    int expected = 18;
    assertEquals(expected,actual);
}

//-----------------------------End of method----------------------------------//
}
//10000011101001110010011001011101110__ END OF FILE__ 10000101111001111001011011101100101//