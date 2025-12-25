//n=4

//   * 
//  * * 
// * * * 
//* * * * 
// * * * 
//  * * 
//   * 


package Assignment2;

import java.util.Scanner;

public class PatternPrinting {
public static void main(String[] args) {
//	Scanner sc=new Scanner(System.in);
//	int n=sc.nextInt();
	
	 // Upper half (including middle row)
//	for(int i=1;i<=n;i++) {
//		//Leading spaces
//		for(int sp=1;sp<=n-i;sp++) {
//			System.out.print(" ");
//		}
//			//Print Star
//			for(int st=1;st<=i;st++) {
//				System.out.print("* ");
//			}
//			System.out.println();
//		}
//
//    // Lower half
//	for(int i=n-1;i>=1;i--) {
//        // Print leading spaces
//		for(int sp=1;sp<=n-i;sp++) {
//			System.out.print(" ");
//		}
//		   // Print stars
//			for(int st=1;st<=i;st++) {
//				System.out.print("* ");
//			}
//			System.out.println();
//		}
	 int n = 5;   // must be odd
     int mid = n / 2;

     for (int i = 0; i < n; i++) {

         int spaces = Math.abs(mid - i);
         int stars  = n - 2 * spaces;

         // print spaces
         for (int s = 0; s < spaces; s++) {
             System.out.print(" ");
         }

         // print stars
         for (int st = 0; st < stars; st++) {
             System.out.print("*");
         }

         System.out.println();
     }
 }
}
