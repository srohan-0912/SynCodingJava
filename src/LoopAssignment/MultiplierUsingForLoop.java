// Write a java program which will accept two numbers from user-the multiplier and max number 
// and print in the below format using for loop.
//  If multiplier is 2 and max number is 3 it should print as,
//              2 X 1 = 2
//              2 X 2 = 4
//              2 X 3 = 6

package LoopAssignment;

public class MultiplierUsingForLoop {
public static void main(String[] args) {
	int mul=2;
	int max=3;
	for(int i=1;i<=max;i++) {
		int ans=mul*i;
		System.out.println(mul+" X "+i+" = "+ ans);
	}
	
}
}
