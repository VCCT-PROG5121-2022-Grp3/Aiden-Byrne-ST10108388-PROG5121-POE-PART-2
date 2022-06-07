package projectpoe;

import java.util.regex.Pattern;
import java.util.regex.Matcher;
import javax.swing.JOptionPane;

public class ProjectPOE
{

    //Creating an object to call the class Login
    private static Login loginCheck = new Login();
    
//------------------------Beginning of main method------------------------------
    
    public static void main(String[] args)
    {
      
        //Calling of the method wherre the user inputs their first name and last name
        loginCheck.nameOfUser();

        //Calling of the method where the user enters his username and password
        loginCheck.registerUser();

        //Calling of the method where the user inputs his registered username and password
        loginCheck.returnLoginStatus();
        
    }
//-----------------------End of main method-------------------------------------
}



//10000011101001110010011001011101110__ END OF FILE__ 10000101111001111001011011101100101//
