/*Programmer: Annab Johnson 
  Program: Practice Exercise 4.18
  Program purpose: To print a multiplication table from 1-10.
  The program iterates to print a row and column of numbers from 1-10 and their products;
  which is simply done by multiplying the row by the column. 
  Date: 3/11/2020**/ 

public class multiplicationtable
{
public static void main (String[] args)
{

System.out.println("\t Multiplication Table \t"); //Prints Header: Multiplication Table 

   for (int row=1; row<=10; row++)// outer loop for row
    {
      for (int col = 1; col<=10; col++)// inner loop for column 
       {
        System.out.printf("%10d",row*col, "\t");// multiplication of row numbers by column numbers
        }
      System.out.println();
     }
} //end of main  
} // end of class  
      
