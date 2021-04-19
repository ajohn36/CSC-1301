/**Programmer: Annab Johnson 
   Program PE7.7:Print File Stats
   Date: 4/15/2020
   Purpose:This program prompts the user for a file name and prints the number of characters, words, and lines contained in that file
*/

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class PrintFileStats
{  
   public static void main(String[] args) throws FileNotFoundException
    {  
     Scanner in = new Scanner(System.in);
     System.out.println("PE7.7 PrintFileStats by Annab Johnson \n");
     
     System.out.print("Enter file name:"); 
     String filename = in.next();
     
   try
    {
     int charCount = countChars(filename); 
     System.out.println("The number of chars in"+ filename + " is: " +charCount);
      
     int wordCount = countWords(filename); 
     System.out.println("The number of words in"+ filename + " is: " +wordCount);
      
     int lineCount = countLines(filename); 
     System.out.println("The number of lines in"+ filename + " is: " +lineCount);
    }
   
   catch (FileNotFoundException ex)
    {
     System.out.println("File unavailable");
    }// end of catch
    }//end of main method
    
   public static int countChars(String filename) throws FileNotFoundException 
     {  
       Scanner in = new Scanner(new File(filename));
       int charCount= 0;
      
        while (in.hasNextLine())
         {
          String line = in.nextLine();
          charCount= charCount + line.length();
         } // end of while 
        return charCount; 
      }  // end ofcountChars method 
    
    public static int countWords(String filename) throws FileNotFoundException 
      {  
       Scanner in = new Scanner(new File(filename));
       int wordCount= 0;
       
       while (in.hasNext())
        {
         String word = in.next();
         wordCount= wordCount + 1;
        }// end of while 
       return wordCount; 
      }// end of class
    
    public static int countLines(String filename) throws FileNotFoundException 
      {  
       Scanner in = new Scanner(new File(filename));
       int lineCount= 0;
      
      while (in.hasNextLine())
       {
        String line = in.nextLine();
        lineCount++;
       }// end of while 
      return lineCount; 
}
}
           