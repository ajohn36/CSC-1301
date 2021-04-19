/*Programmer: Antonia Johnson 
  Program: Translate letter grade
  Date: 3/2/2020
  Purpose: program translates a letter grade into a number grade. Letter grades are A, B, C, D, and F, possibly followed by + or –. Their numeric values are 4, 3, 2, 1, and 0. 
  There is no F+ or F–. A + increases the numeric value by 0.3, a – decreases it by 0.3. 
  However, an A+ has value 4.0.**/
import java.util.Scanner;
public class LetterGrade
{
public static void main (String[] args) 
{
String letterGrade;
double gradePoints=0;


Scanner in=new Scanner(System.in);
System.out.println("Enter grade:");
letterGrade =in.nextLine();
if (letterGrade.charAt(0)=='A')
{
gradePoints=4.0;
}
else if (letterGrade.charAt(0)=='B')
{
gradePoints=3.0;
}
else if (letterGrade.charAt(0)=='C')
{
gradePoints=2.0;
}
else if (letterGrade.charAt(0)=='D')
{
gradePoints=1.0;
}
else if (letterGrade.charAt(0)=='F')
{
gradePoints=0.0;
}

if (letterGrade.length()>1)
{
if (letterGrade.charAt(1)=='+')
{
gradePoints= gradePoints+0.3;
}
if (letterGrade.charAt(1)=='-')
{
gradePoints= gradePoints-0.3;
}
if(gradePoints==4.0)
{
gradePoints=4.0;
}
if (gradePoints<0)
{
gradePoints=0.0;
}
System.out.println(""+letterGrade + "translates to: "+gradePoints);
}
}// end of main method 
}// end of class
