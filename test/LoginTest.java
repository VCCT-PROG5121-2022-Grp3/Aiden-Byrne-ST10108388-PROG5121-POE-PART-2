

import static org.junit.jupiter.api.Assertions.assertEquals;

//import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.Test;

import projectpoe.Login;

public class LoginTest
{
    Login log = new Login();
         
    public LoginTest()
    {
    }
//-------------------------------Start of test method---------------------------
    
    //testing the method in which the user enters their first name and last name
    @Test
    public void testNameOfUser()
    {
     //assigning called variable firtName to "Aiden"
     //first name entered into JOptionPane must be "Aiden"
     log.firstName = "Aiden";
     
     //Assigning called variable lastName to "Byrne"
     //Last name entered must be "Byrne"
     log.lastName = "Byrne";
     
     String expected = "Aiden" + "Byrne";
     
     //calling of method where first name and last name of user is entered
     String actual = log.nameOfUser();
     
     assertEquals(expected,actual);
    }
    
//----------------------------End of test method--------------------------------
    
//----------------------------Start of test method------------------------------    
    //Testing the method in which the user enters their Username
    @Test
    public void testUserNameInput()
    {
        
     //assigning variable userNameCheck to "kly_1"
     //username entered into JOptionPane must be kyl_1
     log.userNameCheck = "kyl_1";
     
     String expected = "kyl_1";
     
     //Calling of method where user enters their username
     String actual = log.userNameInput();
     
     assertEquals(expected,actual);
    }
//--------------------------End of test method----------------------------------
    
//--------------------------Start of test method--------------------------------    
    //Testing of method where username is checked to see if it meets the username
    //conditions
    @Test
    public void testCheckUserName()
    {
     //Assigns the variable userName to "kyl_1"
     log.userNameCheck = "kyl_1";
     
     boolean expected = true;
     
     //Calling of the method that checks the username and returns a true or false value
     boolean actual = log.checkUserName();
     
     assertEquals(expected,actual);
    }
//-----------------------------End of test method-------------------------------

//------------------------------Start of test method----------------------------
    
    //Testing of the method that receives the input of the users password
    @Test
    public void testPasswordInput()
    {
      //assinging variable passwordCheck to "Ch&&sec@ke99!"
      //password entered into JOptionPane must be Ch&&sec@ke99!
      log.passwordCheck = "Ch&&sec@ke99!";
      
      String expected = "Ch&&sec@ke99!";
      
      String actual = log.passwordInput();
      
      assertEquals(expected,actual);
    }
//-------------------------------End of test method-----------------------------
    
//-------------------------------Start of test method---------------------------
    
    //Testing of the method that checks if the password meets the password requirements
    @Test
    public void testCheckPasswordComplexity()
    {   
     //assigning passwordCheck variable to Ch&&sec@ke99!
     log.passwordCheck = "Ch&&sec@ke99!";
     
     boolean expected = true;
     
     boolean actual = log.checkPasswordComplexity();
     
     assertEquals(expected,actual);
    }
//---------------------------End of test method---------------------------------
    
//---------------------------Start of test method-------------------------------
    
    //Testing of the method which accepts the users password and username and
    //returns if the password and username was successfully captured
    @Test
    public void testRegisterUser()
    {   
     String expected = "Username successfully captured" + "Password successfully captured";
     
     String actual = log.registerUser();
     
     assertEquals(expected,actual);
    }
//--------------------------End of test method----------------------------------
      
//-------------------------------Start of test method---------------------------
    
    //Testing of method where user inputs his registered password and username
    @Test
    public void testEnteringLoginDetails()
    {
        //assigning passwordCheck to Ch&&sec@ke99!
        //password entered must Ch&&sec@ke99!
        log.passwordCheck = "Ch&&sec@ke99!";
        
        //assigning userNameCheckVariable to kyl_1
        //username entered must be equal to kyl_1
        log.userNameCheck = "kyl_1";
        
        String expected = "kyl_1" + "Ch&&sec@ke99!";
        
        
        String actual = log.enteringLoginDetails();
        
        assertEquals(expected,actual);
    }
//--------------------------End of test method----------------------------------
    
//--------------------------Start of test method--------------------------------
    
    //Testing method which checks if the registered username and password 
    //is equal to the username and password entered into the login JOptionPanes
    @Test
    public void testLoginUser()
    {
        
     log.passwordCheck = "Ch&&sec@ke99!";
     
     log.userNameCheck = "kyl_1";
     
     log.registeredPassword = "Ch&&sec@ke99!";
     
     log.registeredUsername = "kyl_1";
     
     boolean expected = true;
     
     boolean actual = log.loginUser();
     
     assertEquals(expected,actual);
    }
    
//------------------------End of test method------------------------------------
 
//------------------------Start of test method----------------------------------
    
    //Testing of the method that tells the user if the login was successful
    //or unsuccessfull
    @Test
    public void testReturnLoginStatus()
    {
        
     log.passwordCheck = "Ch&&sec@ke99!";
     
     log.userNameCheck = "kyl_1";
     
     String expected = "A successful login";
     
     String actual = log.returnLoginStatus();
     
     assertEquals(expected,actual);
    }
    
//---------------------End of test method---------------------------------------    
}

//10000011101001110010011001011101110__ END OF FILE__ 10000101111001111001011011101100101//