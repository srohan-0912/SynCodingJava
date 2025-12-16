//Problem 6:
//You are designing a loan eligibility system. The rules are:
//• The borrower’s age must be between 25 and 60 years.
//• The borrower must have a minimum monthly income of Rs30000.
//• The borrower should not have any existing loans.
//Write a program to check if the borrower is eligible for a loan.

//Input:age: 30
//monthlyIncome: 35000
//existingLoans: false
//Output: Eligible for Loan

//Input: 
//age: 24 
//monthlyIncome: 40000 
//existingLoans: false
//Output: Not Eligible for Loan

package level2;

import java.util.Scanner;

public class fLoanCheck {
public static void main(String[] args) {
	                      //               TC AND SC ->O(1)
	Scanner sc=new Scanner(System.in);
	int age=sc.nextInt();
	int monthlyInc=sc.nextInt();
    boolean existingLoan=sc.nextBoolean();
    if(age<25 || age>60) {
    	System.out.println("Not Eligible For Loan");
    	return;
    }
    if(monthlyInc<30000) {
    	System.out.println("Not Eligible For Loan");
    	return;
    }
    if(existingLoan == true) {
    	System.out.println("Not Eligible For Loan");
    	return;
    }
    System.out.println("Eligible for Loan");
      
    // *********************************************************************************  
                              // Or simply Use
//    if (age >= 25 && age <= 60 && monthlyIncome >= 30000 && existingLoans == false) {
//        System.out.println("Eligible for Loan");
//    } else {
//        System.out.println("Not Eligible for Loan");
//    }
}
}
