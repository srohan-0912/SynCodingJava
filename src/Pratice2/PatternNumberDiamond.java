//Topic: Pattern Logic
//📘 Problem Statement
//
//Given n, print a number diamond.
//
//For n = 3
//
//  1
// 2 2
//3 3 3
// 2 2
//  1

package Pratice2;

public class PatternNumberDiamond {
public static void main(String[] args) {
	 int n = 5;
     int mid = n / 2;

     for (int i = 0; i < n; i++) {

         int space = Math.abs(mid - i);

         // print spaces
         for (int sp = 0; sp < space; sp++) {
             System.out.print(" ");
         }

         int count = n - 2 * space;

         // calculate number correctly
         int num = mid - space + 1;

         // print numbers
         for (int j = 0; j < count; j++) {
             System.out.print(num + " ");
         }

         System.out.println();
     }
 }
}