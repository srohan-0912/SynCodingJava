//Write a java program to print the pattern as below using for loops
//
//   1
//   2 2
//   3 3 3
//   4 4 4 4
//   5 5 5 5 5
//   6 6 6 6 6 6 

package LoopAssignment;

public class PatternPrinting {
public static void main(String[] args) {
	int n=6;
	int num=1;
	for(int i=1;i<=n;i++) {
		for(int j=1;j<=i;j++) {
			System.out.print(num+" ");
		}
		num++;
		System.out.println();
	}
}
}
