/*Programmer: Annab Johnson 
  Program: Validate Password
  Date: 3/2/2020
  Purpose: Write a program that prompts the user for a password then prompts again for confirmation.
           Password validation rules are as follows: 
             •The password must be at least 8 characters long.
             •The password must have at least one uppercase and one lowercase letter
             •The password must have at least one digit.
           If the passwords do not match or the validation rules are violated prompt the user again
 **/
import java.util.Scanner;

public class Passwordvalidate
{
  public static void main (String [] args)
     {
       introduction();
       Scanner in = new Scanner (System.in);
       boolean correct =false; 
       while (!correct)
       {
          System.out.println("\n Enter a password:"); 
          String password = in.next();
          System.out.println("Confirm your password:");
          String password2 = in.next();
          
          if (password.equals(password2))
           {
            if(validate(password))
            {
               System.out.print("Password validated");
               correct= true;
            }
            else 
             {
               System.out.println("Password is not valid.Rules violated");
             }
           }
          else
           {
            System.out.print("Passwords do not match. Password cannot be validated"); 
           }
        }// end of while
     }// end of main method 
   public static void introduction()
      {
       System.out.println("Program: Validate Password by Annab Johnson ");
       System.out.println("  Validates a password following these rules:");
       System.out.println("   -The password must be at least 8 characters long.");
       System.out.println("   -The password must have at least one uppercase and one lowercase letter");
       System.out.println("   -The password must have at least one digit. \n");

      }
      //Rules must be atleast 8 characters long, contain atleast one digit, Upper and Lower case character
    public static boolean validate(String password) //method to validate password 
      {
        if (password.length()<8)
        { return false;}
        // one lowercase, uppercase & digit 
        boolean foundUpper= false;
        boolean foundLower= false;
        boolean foundDigit= false;
        // examine each char in password
        for (int i= 0;i< password.length(); i++)
        {
           char ch= password.charAt(i);
           
           if (isUpperCase(ch))
           {foundUpper = true;}
         
           if (isLowerCase(ch))
           {foundLower = true;}
           
           if (isDigit(ch))
           {foundDigit = true;}
         }// end of for loop 
         return foundUpper && foundLower && foundDigit;
        }// end of validate method
        
     public static boolean isUpperCase(char ch)
       {
         return 'A' <= ch && ch <= 'Z';
       }
     public static boolean isLowerCase(char ch)
       {
         return 'a' <= ch && ch <= 'z';
       }
     public static boolean isDigit(char ch)
       {
         return '0' <= ch && ch <= '9';
       }
}// end of class