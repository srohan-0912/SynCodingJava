//Problem 3:
//Find the position of digit 5 in a number. Please note you should not use string API’s or convert the 
//input data to string it should be processed as integer only.
//Input: 123456789
//Output: index of 5 is 4

package level1;

import java.util.Scanner;

public class cFindPosition {
public static void main(String[] args) {
	
	              // FOR FINDING LAST OCCURENCE 
//	int a=15324456;
//	int temp=a;
//	int cnt=0;
//	while(temp!=0){
//		cnt++;
//		temp/=10;
//	}
//	while(a != 0) {
//		int rem=a%10;
//		if(rem == 5) {
//			System.out.println("index of 5 is "+ (cnt-1) );
//			return;
//		}
//		cnt--;
//		a/=10;
//	}
//	System.out.println("Not Found");
	
	
	       // FINDING THE FIRST OCCURENCE

	Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
	//	int a=12345145;
	int temp=a;
    int cnt=0;
    while(temp!=0) {
    	cnt++;
    	temp/=10;
    }
    int ind=-1;
    while(a!=0) {
    	int rem=a%10;
    	if(rem == 5) {
    		ind=cnt-1;
    	}
    	cnt--;
    	a/=10;
    }
    if(ind != -1) { 
    	System.out.println("index of 5 is " + ind);
    }
    else {
    	System.out.println("Invalid");
    }
}
}
