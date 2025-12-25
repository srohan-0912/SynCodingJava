//    Lucky Number
//A number is considered lucky only if it contains either 3 or 4 or both in it.
//Write a program to print the nth lucky number.
//Example, 1st lucky number is 3, and 2nd lucky number is 4, 3rd lucky number is 33, 4th lucky number is 34 and so on..
//
//Note that 13, 40 etc., are not lucky as they have other digits in it.
//
//The program should accept a number ‘n’ as input and display the nth lucky number as output.
//
//Positive Test Cases
//Test with n = 5 (the output should be 43)
//Test with n = 34
//Test with n = 45

package Assignment2;

import java.util.Scanner;

public class LuckyNumber {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	
	int cnt=0;
	int num=1;
	while(true) {   //or while(cnt<n)
		if(isLucky(num)) {
			cnt++;
			if(cnt == n) {
				System.out.println("Lucky Number is:" + num);
				break;
			}
		}
		num++;
	}
//	System.out.println("Not valid");
  
}
static boolean isLucky(int num) {
	while(num>0) {
	int rem=num%10;
	if(rem!=3 && rem!=4) {
		return false;
	}
	num/=10;
	}
	return true;
}
}
