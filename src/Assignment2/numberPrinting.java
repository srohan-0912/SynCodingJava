//6. Number box pattern
//
//Input: 3
//Output:
//33333
//32223
//32123
//32223
//33333
//
//Input: 4
//Output:
//4444444
//4333334
//4322234
//4321234
//4322234
//4333334
//4444444
//
//Input: 5
//Output:
//555555555
//544444445
//543333345
//543222345
//543212345
//543222345
//543333345
//544444445
//555555555
//
//Limitations & Constraints 
//Program should work for any positive single digit.
//
//Positive Test Cases
//Test for values 1, 2, 3, 4, 5, 6, 7, 8 and 9


package Assignment2;

import java.util.Scanner;

public class numberPrinting {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int size=2*n-1;
	for(int i=0;i<size;i++) {
		for(int j=0;j<size;j++) {
			int top=i;
			int left=j;
			int bottom=size-1-i;
			int right=size-1-j;
		int minDist=Math.min(Math.min(top, bottom),Math.min(left,right));
		
		System.out.print(n-minDist);
		}
		System.out.println();
	}
	
}
}
