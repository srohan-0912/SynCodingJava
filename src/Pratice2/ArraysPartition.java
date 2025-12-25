//Topic: Partition + Sequence Logic
// Problem Statement
//Given:
//An integer array
//An order M
//A sequence array
//Steps:
//Divide the array into partitions of size M
//Print partitions in the given sequence order
//
//Example
//Array: 10 20 30 40 50 60 70
//M = 2
//Sequence: 4 1 3 2
//
//Output:
//70 10 20 50 60 30 40
package Pratice2;
import java.util.*;
public class ArraysPartition {
public static void main(String[] args) {
	int[] arr= {10,20,30,40,50,60,70};
	int m=2;
	int[] seq= {4,1,3,2};
	//****************1ST APPROACH EASY ONE	*******************
//	int n=arr.length;
//	for(int s:seq) {
//		int st=(s-1)*m;             // (s-1) index st with 0
//		int end=Math.min(st+m,n);  //Math.min to check arryIndexOutOfBound
//		for(int i=st;i<end;i++) {
//			System.out.print(arr[i]+" ");
//		}
//	}
	
	
	//***********2ND APPROACH USING ARRAYLIST *****************
	
	// Step 1: Create partitions
	List<List<Integer>> partition=new ArrayList<>();
	for(int i=0;i<arr.length;i+=m) {
		List<Integer> parts=new ArrayList<>();
		for(int j=i;j<i+m && j<arr.length;j++) {
			parts.add(arr[j]);
		}
		partition.add(parts);
	}
	

    // Step 2: Print partitions using sequence
	for(int s:seq) {
		List<Integer> part=partition.get(s-1); //index st with 0
		for(int val:part) {
			System.out.print(val+" ");
		}
	}
}
}
