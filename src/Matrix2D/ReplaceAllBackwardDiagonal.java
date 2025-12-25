//Write a java program to create a 4X4 array and get the values from using Scanner class. 
//Replace all backward diagonal elements of the matrix with -1.
//Eg:  if your input is,
//               2  4  9  0
//               7  2  1  1
//               1  5  8  3
//               6  8  0  9
//The output should be,
//               2   4   9  -1
//               7   2  -1   1
//               1  -1   8   3
//              -1   8   0   9

package Matrix2D;

import java.util.Scanner;

public class ReplaceAllBackwardDiagonal {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int r=sc.nextInt();
	int c=sc.nextInt();
	int[][] arr=new int[r][c];
	for(int i=0;i<r;i++) {
		for(int j=0;j<c;j++) {
			arr[i][j]=sc.nextInt();
		}
	}
	matrix(arr);
}
static void matrix(int[][] arr) {
	for(int i=0;i<arr.length;i++) {
		for(int j=0;j<arr[i].length;j++) {
			if((i+j) == arr.length-1) {    //SMALL CHANGES HERE
				arr[i][j]=-1;
			}
		}
	}
	for(int i=0;i<arr.length;i++) {
		for(int j=0;j<arr[i].length;j++) {
			System.out.print(arr[i][j]+" ");
		}
		System.out.println();
	}
}
}
