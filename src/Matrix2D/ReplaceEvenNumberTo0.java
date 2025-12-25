//Write a java program to create a 4X4 array and get the values from using Scanner class. 
//Replace the even numbers in the array with 0 and print the resultant array.
//Eg: if your input is,
//               2  4  9  0
//               7  2  1  1
//               1  5  8  3
//               6  8  0  9
//The output should be,
//               0  0  9  0
//               7  0  1  1
//               1  5  0  3
//               0  0  0  9



package Matrix2D;

import java.util.Arrays;
import java.util.*;

public class ReplaceEvenNumberTo0 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the size:");
	int row=sc.nextInt();
	int col=sc.nextInt();
	int[][] arr=new int[row][col];
	for(int i=0;i<row;i++) {
		for(int j=0;j<col;j++){
			arr[i][j]=sc.nextInt();
		}
		}
	matrix(arr);
}
static void matrix(int[][] arr){
	for(int i=0;i<arr.length;i++) {
		for(int j=0;j<arr[i].length;j++) {
			if(arr[i][j] %2 ==0) {
				arr[i][j] =0;
			}
		}
	}
System.out.println("\n Resultant Matrix");
for(int i=0;i<arr.length;i++) {
	for(int j=0;j<arr[i].length;j++) {
		System.out.print(arr[i][j]+" ");
	}
	System.out.println();
}
}
}
