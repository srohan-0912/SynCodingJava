//Write a java program to create a 4X4 array and get the values from using Scanner class. 
//Replace the values as 0 whose sum of indexes is even.
// Eg: If your input is,
//               2  4  9  0
//               7  2  1  1
//               1  5  8  3
//               6  8  0  9
//The output should be,
//               0  4  0  0
//               7  0  1  0
//               0  5  0  3
//               6  0  0  0
//Explanation: In first row of input, 9 is in the position a[0][2],the sum of index is 0+2=2(even number) so it gets changed to 0.
//In the same way the other elements matching the rule i+j is even should be changed to zero.

package Matrix2D;

import java.util.Scanner;

public class ReplaceSumTo0 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int row=sc.nextInt();
	int col=sc.nextInt();
	int[][] arr=new int[row][col];
	for(int i=0;i<row;i++) {
		for(int j=0;j<col;j++) {
			arr[i][j]=sc.nextInt();
		}
	}
	int[][] res=matrix(arr);
	for(int i=0;i<res.length;i++) {
		for(int j=0;j<res[i].length;j++) {
			System.out.print(res[i][j]+" ");
		}
		System.out.println();
	}
}
static int[][] matrix(int[][] arr) {
	for(int i=0;i<arr.length;i++) {
		for(int j=0;j<arr[i].length;j++) {
			if((i+j) % 2 == 0) {
				arr[i][j]=0;
			}
		}
	}
	return arr;
}
}
