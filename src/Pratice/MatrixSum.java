//Question 6: Matrix Border Sum (2D Array)
//
//Given a square matrix, find the sum of border elements only.
//
//Input Matrix:
//
//1 2 3
//4 5 6
//7 8 9
//
//
//Output:
//
//Sum = 40
//Sum =1 + 2 + 3 + 4 + 6 + 7 + 8 + 9 = 40
package Pratice;

public class MatrixSum {
public static void main(String[] args) {
	int[][] matrix= {{1,2,3},{4,5,6},{7,8,9}};
	int n=matrix.length;
	int sum=0;
	for(int i=0;i<n;i++) {
		for(int j=0;j<n;j++) {
			//Code for border val sum                   //code for inner val sum eg output is:5 for above input
			if(i==0 || i==n-1 ||j==0|| j==n-1) {        // if(i>0 && i<n-1 && j>0 && j<n-1)
				sum+=matrix[i][j];
			}
		}
	}
	System.out.println(sum);
	
}
}
