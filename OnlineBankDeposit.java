/**Program Online Bank Deposit
   Programmer: Annab Johnson
   Date: 2/24/2020
   Assignment: P2.7 OnlineBankDeposit
   The purpose of this program is to calculate the monthly compounded interest rate of customer's online bank deposit for the first 3 months */ 
import java.util.Scanner; 
public class OnlineBankDeposit
{ 
  public static void main(String[] args)
  {
  double bal, r;
 
 Scanner sc=new Scanner(System.in);
  System.out.println("Enter initial balance");
  bal=sc.nextDouble();  
  System.out.println("Enter Annual interest rate");
  r=sc.nextDouble();
  
  /**Because the interest is compounded monthly the annual rate most be divided by 12. Hence the formula bal*(1+r/100)^n becomes bal*(1+(r/12)/100)^n to calculate monthly compounded interest
   where r is the annual rate and n represents the number of months. Using the "Math.pow" method from the Math class our formula becomes bal*Math.pow(1+(r/12)/ 100, 1)). 
   When using this formula for the first time the program did not read the computation and printed the inputted balance, 
   this was due to r being set as an int and not a double or being casted as a double 
   to allow the compiler to do the calculation. r can be left as int if 12 in method is changed to 12.0. */
   
  System.out.printf("Balance after first month:%10.2f \n" ,bal*Math.pow(1+(r/12)/ 100, 1) ); 
  System.out.printf("Balance after second month:%9.2f \n" ,bal*Math.pow(1+(r/12)/ 100, 2)) ;   
  System.out.printf("Balance after third month:%10.2f \n" , bal*Math.pow(1+(r/12)/ 100, 3));  
      }
}
      
  
   