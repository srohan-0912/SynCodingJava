//Write a java program to create a 4X4 array and get the values from user using Scanner class.
//Find out the largest number in each row and print it.
// Eg: if your input is,
//               2  4  9  0
//               7  2  1  1
//               1  5  8  3
//               6  8  0  9
//The output should be,
//  The largest number in row1 is 9
//  The largest number in row2 is 7
//  The largest number in row3 is 8
//  The largest number in row4 is 9

package Matrix2D;

import java.util.Scanner;

public class FindLargestElementIn2D {
public static void main(String[] args) {
//	int[][] arr= {{2,4,9,0},{7,2,1,1},{1,5,8,3},{6,8,0,9}};
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the size:");
	int row=sc.nextInt();
	int col=sc.nextInt();
	int[][] arr=new int[row][col];
	for(int i=0;i<row;i++) {
		for(int j=0;j<col;j++) {
			arr[i][j]=sc.nextInt();
		}
	}
	for(int i=0;i<arr.length;i++) {
		int larg=Integer.MIN_VALUE;
		for(int j=0;j<arr[i].length;j++) {
			if(arr[i][j] > larg) {
				larg=arr[i][j];
			}
		}
		System.out.println("The Largest number in row"+(i+1)+" is "+larg);
		
	}
}
}
