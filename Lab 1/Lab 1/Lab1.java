
import java.util.Scanner;

public class Lab1 {
	public static void main(String[]args) {
	Scanner input= new Scanner (System.in);
	//Defining variables from user input
	System.out.println("Please enter years to be worked");
	double YearsToWork = input.nextDouble();
	System.out.println("Please enter annual return");
	double AnnualReturn = input.nextDouble()/100;
	System.out.println("Please enter years of retirement");
	double YearsOfRetirement = input.nextDouble();
	System.out.println("Please enter the interest rate");
	double InterestRate = input.nextDouble()/100;
	System.out.println("Please enter required monthly income");
	double MonthlyIncome = input.nextDouble();
	System.out.println("Please enter expected monthly Social Security");
	double SocialSecurity = input.nextDouble();
	double PeriodPay = MonthlyIncome-SocialSecurity;
	
	//Formula for amount to be saved
	
	double NeedToSave = PeriodPay*((1-Math.pow(1+InterestRate/12,-1*YearsOfRetirement*12))/(InterestRate/12));
	System.out.println("Amount you need to save:");
	System.out.println(NeedToSave);
	
	//Formula for amount to be saved each month
	
	double SaveEachMonth = NeedToSave*(AnnualReturn/12) /(Math.pow(1+AnnualReturn/12, 1*YearsToWork*12)-1);
	System.out.println("Amount you need to save each month:");
	System.out.println(SaveEachMonth);
	input.close();}
}

	

