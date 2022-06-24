package projectpoe;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

public class Login
{
//----------------------Start of decleration------------------------------------
    
//Creating global variables which can be used in any method
    public String userNameCheck;

    public String passwordCheck, registeredUsername, registeredPassword;
    
    public static String userNameCorrect, userNameIncorrect, passwordCorrect,
            passwordIncorrect, passwordAndUserNameCorrect, loginSuccessful, loginFailed, firstName,
            lastName;
    
    private boolean userNameStatus, passwordStatus, statusRegisteredUsername, statusRegisteredPassword;
    
//--------------------End of decleration----------------------------------------

//----------------------------Start of method-----------------------------------
    
//Creating a method that has the user enter their first name and last name and returns their first name + last name    
    public String nameOfUser()
    {
        //JOptionPane created to recieve the users first name  
        firstName = JOptionPane.showInputDialog("Please enter your first name");

        //JOptionPane created to recieve the users last name  
        lastName = JOptionPane.showInputDialog("Please enter your last name");
        
        //returns first name and last name entered of the user
        return firstName + lastName;
    }

//--------------------------End of method---------------------------------------
    
//--------------------------Start of method-------------------------------------
    
//Creating a string method that has the user enter a username that they want to use    
    public String userNameInput()
    {

        //JOptionPane created to recieve the users username that he wants to use
        userNameCheck = JOptionPane.showInputDialog("Enter Username must contain a underscore "
                + " and must not be longer "
                + "than 5 characters");

        //Returns the username inputed by user
        return userNameCheck;
    }
//--------------------------End of method---------------------------------------

//--------------------------Start of method-------------------------------------
    
//Creating a method that checks the username and returns if it is true or false
    public boolean checkUserName()
    {
        //If statement used to check if the username entered by the user is 
        //correctly formatted and is smaller or equal to 5 characters and contains a underscore
        if (userNameCheck.length() <= 5 && userNameCheck.contains("_"))
        {
            //if username is correctly formatted converts the variable userNameCheck(username entered by user)  
            //to a boolean which will return a false value which is used in the registration while loop
            userNameStatus = Boolean.parseBoolean(userNameCheck);

            return true;
        }
        return false;
    }

//--------------------------End of method---------------------------------------
    
//--------------------------Start of method-------------------------------------
    
    //method used to recieve the password inputed by the user    
    public String passwordInput()
    {
        //JOptionPane created to recieve the users password that they have entered
        passwordCheck = JOptionPane.showInputDialog("Enter Password must contain a "
                + "capital letter, number , and a " 
                + "special character");

        //Returns the password chosen by the user
        return passwordCheck;
    }

//------------------------End of method-----------------------------------------
    
//------------------------Start of method---------------------------------------
    
    //Creating a method which checks the password for certian parameters and returns a true or false value
    public boolean checkPasswordComplexity()
    {
        //A pattern finder is created using regular expressions 
        //to check for any upper case characters in the password entered by the user
        String characterChecker = "[A-Z]";
        Pattern pt = Pattern.compile(characterChecker);
        Matcher mt = pt.matcher(passwordCheck);
        boolean result = mt.find();

        //A pattern finder is created using regular expressions to
        //check for any numbers in the password entered by the user
        String numberCheckerPassword = "[0-9]";
        Pattern pt2 = Pattern.compile(numberCheckerPassword);
        Matcher mt2 = pt2.matcher(passwordCheck);
        boolean result2 = mt2.find();

        //A pattern finder is created using regular expressions to
        //check for any special characters in the password entered by the user
        String SpecialCharacterChecker = "[^a-zA-Z0-9]";
        Pattern pt3 = Pattern.compile(SpecialCharacterChecker);
        Matcher mt3 = pt3.matcher(passwordCheck);
        boolean result3 = mt3.find();

        //If statement to check the if the length of the password is smaller or equal
        //to 8 characters long and includes atleast one capital letter(result),
        //one number(result2) and one special character(result3) and returns a true
        //or false value
        if (passwordCheck.length() >= 8 && result && result2 && result3)
        {
            //Converts the password entered by the user to a boolean value that
            //returns a false value used for the while loop to make sure the password was entered in correctly
            passwordStatus = Boolean.parseBoolean(passwordCheck);

            return true;
        }
        return false;
    }
    //-------------------------End of method------------------------------------

    //-------------------------Start of method----------------------------------
    
    //Creating a method that returns strings to say whether the password and the username is entered in correctly
    //or entered in incorrectly and wont allow the user to move pass registration until both values are 
    //entered correctly 
    public String registerUser()
    {
        //Creating of an empty string called check which is used to concatinate the two strings variables
        //userNameCorrect and passwordCorrect
        String check = "";

        passwordIncorrect = "The password does not meet the complexity requirements";

        userNameCorrect = "Username successfully captured";

        userNameIncorrect = "The username is incorrectly formatted";

        passwordCorrect = "Password successfully captured";
//------------------------------Start of while loop-----------------------------

        //while loop created to make sure the username inputed by the user is correctly
        //formatted and wont let the user proceed until the usename is correctly formatted
        while (userNameStatus == false)
        {

            //method where the username is inputed is called into this while loop to
            //activate the userNameInput method    
            userNameInput();

            //If statement used to display "Username Captured" and "Username successfully captured"
            //If the username is correctely formatted and if checkUserName is true
            //it stops the while loop and continues onto the password registration
            if (checkUserName() == true)
            {
                //prints out "The username is correctly formatted"
                System.out.println(userNameCorrect);

                JOptionPane.showMessageDialog(null, "Username successfully captured",
                        "Username Successful",JOptionPane.INFORMATION_MESSAGE);

                //Empty string variable check is made equal to userNameCorrect
                check = userNameCorrect;

                //stops the while loop if checkUseName() is equal to true
                break;
            } 
            //If checkUserName() is false will display that the username is incorrectly
            //formatted and will return the user to the enter username input 
            else
            {
                //Prints out "The username is incorrectly formatted"
                System.out.println(userNameIncorrect);

                JOptionPane.showMessageDialog(null, "Username is not correctly formatted, "
                        + "please ensure that your username contains an underscore "
                        + "and is no more than 5 characters in length.","Error",JOptionPane.ERROR_MESSAGE);
            }
        }
//--------------------------------End of while loop-----------------------------

//--------------------------------Start of while loop---------------------------

        //While loop created to make sure the password entered by the user
        //is correctly formatted and wont allow the user to advance until
        //the password is correctly formatted
        while (passwordStatus == false)
        {
            //Calling of the method where the user inputs his password into the while loop
            passwordInput();

            //If statement used to display if the password was correctly formatted
            //and if checkPasswordComplexity returns true allows the user to login
            if (checkPasswordComplexity() == true)
            {
                //prints out "Password successfully captured"
                System.out.println(passwordCorrect);

                JOptionPane.showMessageDialog(null, "Password successfully captured",
                     "Successful Capture of password",JOptionPane.INFORMATION_MESSAGE);

                //concatinates userNameCorrect and passwordCorrect 
                check += passwordCorrect;

                //Stops the while loop if the password is correctly formatted
                break;

            }
            //if the password is incorrectly formatted will display password incorrectly
            //formatted and will return the user to the enter password JOptionPane
            else
            {
                //Prints out "The password does not meet the complexity requirements"
                System.out.println(passwordIncorrect);

                JOptionPane.showMessageDialog(null, "Password is not correctly formatted, "
                        + " please ensure that "
                        + " the password contains at least 8 characters, a capital "
                        + " letter, a number "
                        + " and a special character ","ERROR",JOptionPane.ERROR_MESSAGE);
            }
        }
//------------------------------End of while loop-------------------------------

        //Returns passwordCorrect and userNameCorrect
        return check;
    }
    //-----------------------End of method--------------------------------------

    //-----------------------Start of method------------------------------------
    
    //method for the inputting of the registered username and password
    public String enteringLoginDetails()
    {
        //JOptionPane created to allow user to enter registered username
        registeredUsername = JOptionPane.showInputDialog("Enter registered username");

        //JOptionPane created to allow user to enter registered password
        registeredPassword = JOptionPane.showInputDialog("Enter registered password");

        //returns the registered username entered and the registered password entered
        return registeredUsername + registeredPassword;
    }
    //----------------------End of method---------------------------------------

    //----------------------Start of method-------------------------------------
    
    //Method used to check if the username and password that were entered matched
    //the username and password the user used to register
    public boolean loginUser()
    {
        //if statement to check if the username and password that were entered in the login method matched
        //the username and password the user used to register
        if (registeredUsername.equals(userNameCheck) && registeredPassword.equals(passwordCheck))
        {
            //if they match registerUsername is converted to a boolean value which
            //will return a false value
            statusRegisteredUsername = Boolean.parseBoolean(registeredUsername);

            //if the inputs match registeredPassword is converted to a boolean value which
            //will return a false value
            statusRegisteredPassword = Boolean.parseBoolean(registeredPassword);

            return true;
        }
        return false;
    }

    //----------------------------End of Method---------------------------------
    
    //----------------------------Start of Method-------------------------------
    
    //Method which is used to return if the login was successful or 
    //the login was unsuccessful
    public String returnLoginStatus()
    {

        loginSuccessful = "A successful login";

        loginFailed = "A failed login";

        //while loop created to make sure the login details were entered correctly
        //and wont allow the user to advance until the correct login details are entered
        while (statusRegisteredUsername == false && statusRegisteredPassword == false)
        {
            //Method where the user inputs his login details is called into the while loop   
            enteringLoginDetails();

            //If statement to display if the username and password is correctly entered 
            //if loginUser() returns true
            if (loginUser() == true)
            {
                //Prints out "A successful login"
                System.out.println(loginSuccessful);

                //JOptionPane used to display the firstname and lastname of the user if the login is successful
                JOptionPane.showMessageDialog(null, "Welcome " + firstName + " " + lastName + " it is great to see "
                        + "you again ","Successful Login",JOptionPane.INFORMATION_MESSAGE);

                //Calling of the class Task which allows the user to acess the kanbhan program
                 new Task();
                
                 JOptionPane.showMessageDialog(null,"Welcome to EasyKanBan");
                //exits out of the while loop if LoginUser() is equal to true
                break;

            } 
            //If the login details are incorrect displays that the login was unsuccessful
            else
            {
                //Prints out "A failed login"
                System.out.println(loginFailed);

                JOptionPane.showMessageDialog(null, "A failed login","ERROR",JOptionPane.ERROR_MESSAGE);
            }
        }
        //Returns "A successful login"
        return loginSuccessful;
    }

    //---------------------------End Of Method----------------------------------
}

//10000011101001110010011001011101110__ END OF FILE__ 10000101111001111001011011101100101//
