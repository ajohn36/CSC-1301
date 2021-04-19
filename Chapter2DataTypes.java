/** Program Name: Calculations 
    Programmer: Annab Johnson
    Date: 2/24/2020
    Assignment: Exercise E2.5 Data Types
    This program will prompt user to enter two integers and evaluate the: 
    sum 
    diffference 
    product 
    distance (absolute value) 
    average 
    maximum 
    minimum **/ 

import java.util.Scanner; // needed for keyboard input

public class Chapter2DataTypes 
{
	public static void main(String[] arg)
	{
		int a,b;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first integer");
		a=sc.nextInt(); 
		System.out.println("Enter second integer");
		b=sc.nextInt();
		System.out.printf("Sum:%14d \n" ,(a+b)); 
      System.out.printf("Difference:%7d \n" ,(a-b));
      System.out.printf("Product:%10d \n" ,(a*b));
      System.out.printf("Distance%10d \n" ,Math.abs(a-b));
      System.out.printf("Average:%10.1f \n" ,(a+b)/2.0);
      System.out.printf("Maximum:%10d \n" ,Math.max(a,b));
      System.out.printf("Minimum:%10d \n" ,Math.min(a,b));
       
	}//end of main method
}// end of class
