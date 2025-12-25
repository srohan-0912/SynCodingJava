//Develop a class NumberClassifier.java which will iterate through the first N numbers and
//print all the numbers whose sum of digits is even number using for loop. 
//Eg: 2,4,6,8,11,13,15,17,...

package LoopAssignment;

public class PrintEvenSumOfDigit {
public static void main(String[] args) {
	int n=50;
	for(int i=1;i<=n;i++) {
		int sum=0;
		int num=i;
		while(num>0) {
			sum+=num%10;
			num/=10;
		}
		if(sum%2==0) {
			System.out.print(i+" ");
		}
	}
}
}
