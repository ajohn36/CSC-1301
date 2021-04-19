/*
Write a program that initializes an array with ten random integers and then prints four lines of output, containing 
•Every element at an even index. 
•Every even element. 
•All elements in reverse order. 
•Only the first and last element. **/

import java.util.Arrays; 
public class ArrayMethod
{
public static void main (String[] args)
 {
   // define array for ten random integers
   int[] numbers = new int[10];

  // populate array with random numbers
   for (int i=0; i < numbers.length;i++)
     {
      numbers[i]=(int) (Math.random()*100);
     }// end of for loop 
 
   System.out.println("PE6.1 ArrayMethods\nProgrammer:Annab Johnson");
   System.out.println(); 
   System.out.println("An array of ten random integers:\n"+ Arrays.toString(numbers));
   System.out.println(); 
   
   // Method calls
   printEvenIndexElements(numbers);
   printEvenElements(numbers);
   printReverse(numbers); 
   printFirstandLastElement(numbers);
 }// end of main
 
//Method for every element at an even index
   public static void printEvenIndexElements(int[] numbers)
    {
      System.out.println("Every element at an even index"); 
         for (int i= 0; i<numbers.length;i++)
         {
            if (i%2==0)// even index
            {
             System.out.println("Element[" + i + "]" +numbers[i]);
            }// end of if
         }
          System.out.println();
    }

// Method that to get even elements 
   public static void printEvenElements(int[] numbers)
    {
      System.out.println("Every even element: "); 
         for (int elements:numbers)
         {
            if (elements %2==0)
            {
             System.out.println (elements);
            }
         }
          System.out.println();
    }

//Method to reverse elements
    public static void printReverse(int[] numbers)
     {
       System.out.println("Reversed elements: "); 
          for (int i =numbers.length -1; i >=0; i--)
          {
           System.out.println (numbers[i]+ " ");
          }
            System.out.println(); 
     } 

//Method to print the first and last elements
    public static void printFirstandLastElement(int[] numbers)
     { 
       System.out.printf("First element:%d" ,numbers[0]);
       System.out.println(); 
       System.out.printf("Last element:%d",numbers[numbers.length-1]);
     }
}// end of class