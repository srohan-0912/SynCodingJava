//Question 7: Pattern – Number Cross (Pattern Printing)
//
//If n = 5, print:
//
//1   1                                                  
// 2 2
//  3 
// 2 2
//1   1
//
//
//Pattern must work for any odd n
//Second Output
//3       3
//  2   2                      // int num=Math.abs(mid-i)+1;  
//    1                        //changes to get output like this 
//  2   2
//3       3


package Pratice;

public class PatternPrinting {
public static void main(String[] args) {
	int n=5;
	 int mid=n/2;
	 for(int i=0;i<n;i++) {
		 int num=mid-Math.abs(mid-i)+1;        
		 for(int j=0;j<n;j++) {
			 if(i==j || i+j == n-1) {
				 System.out.print(num);
			 }
			 else {
				 System.out.print(" ");
			 }
			 System.out.print(" ");
		 }
		 System.out.println();
		 
	 }
}
}
