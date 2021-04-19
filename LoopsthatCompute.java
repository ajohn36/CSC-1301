/*Programmer: Annab Johnson 
  Program: Practice Exercise 4.1 
  Program purpose: 
  Run a series of loop programs for the following computations:   
  a.The sum of all even numbers between 2 and 100 (inclusive).

  b.The sum of all squares between 1 and 100 (inclusive).

  c.All powers of 2 from 20 up to 220.

  d.The sum of all odd numbers between a and b (inclusive), where a and b are inputs.

  e.The sum of all odd digits of an input. (For example, if the input is 32677, the sum would be 3 + 7 + 7 = 17.)

  Date: 3/11/2020**/ 

import java.util.Scanner; //needed for keyboard input
public class LoopsthatCompute
{
public static void main (String[] args)
{

//For loop for sum of even numbers between 2 & 100 (inclusive)

  int sum=0;
  System.out.print("a.Sum of all even numbers between 2 and 100 (inclusive):");
  for (int i=2;i<=100;i=i+2)
   {
    sum=sum+i;
    }
    System.out.println(sum + "\n");
     sum=0;

//For loop for 4.1 b. Sum of squares between 1 & 100 (inclusive)
  
  for (int i=1; i<=100;i ++)
   {
    sum+=(Math.pow(i,2));
    }
     System.out.print("b. The sum of all squares between 1 and 100 (inclusive):" + sum+ "\n" +"\n");

//For loop for 4.1 c. Powers of 2 from 0 - 20 (inclusive)

  System.out.println("c. All powers of 2 from 2^0 up to 2^20: \n");
   for (int i= 0; i<=20; i++)
    {
      System.out.println("\t 2 raised to the "+ i +" power is:  "+ (long) Math.pow(2,i));// result casted to long 
    }
      System.out.println();
       sum=0;

//For loop 4.1 d: Sum of odd numbers between user inputs a & b (inclusive)
//Programmer note: program increments so when a is put in as a value greater than b, the result returns 0

System.out.print("Enter a value a:"); //Prompt for user input 
Scanner in =new Scanner(System.in); 
int a =in.nextInt();//Read first input as "a" 
System.out.print("Enter a value b:");// Prompt for user input 
int b =in.nextInt();//Read second input as "b"
if (a>b)
{int temp=a; a=b; b=temp;}
   for (int i= a;i <=b;i++)
    {
     if(i%2!=0)//If Statement to check for odd numbers; condition is set to check numbers not divisible by 2
      { 
         System.out.print("Adding value:" +i + "\n"); // Outputs the odd numbers that are to be added
          sum=sum+ i; 
           }
       
        }
           System.out.println("Sum of Odd numbers:"+sum+ "\n");
           sum=0; // reset sum

//For loop 4.1 e: Read, print and add the odd numbers from user input, print values 

System.out.println("Input a number");
String num=in.next(); 
   
  for (int i= 0; i< num.length();i++) // intiialize value i as zero; condition for loop: i less than the length of input num; loop updates and iterates to length of string
    {
      a =Integer.parseInt(num.substring(i,(i+1)));//String num is converted to integer 
       
       if(a%2!=0)// if statement to test for the odd numbers in variable num
         {
           System.out.println("Adding value:" + a); 
             sum= sum+ a;
              }
                 }
                  System.out.println("Sum of Odd digits:"+ sum+ "\n");

}// end of main method 
}



