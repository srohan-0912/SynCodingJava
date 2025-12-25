//Question 3: Digit Rotation (No String Conversion)

//Rotate digits of a number k times to the right.
//Input:

//Number: 12345  
//k: 2
//Output:
//45123
//❗ Do not convert the number to String.
package Pratice;

public class RotationInt {
public static void main(String[] args) {
	int n=12345;
	int k=3;
	
	System.out.println(rotate(n,k));
}
static int rotate(int n,int k) {
	int temp=n;
	int cnt=0;
	while(temp>0) {
		cnt++;
		temp/=10;
	}
	int mul=1;
	for(int i=1;i<cnt;i++) {
		mul*=10;
	}
	for(int i=0;i<k;i++) {
		int rem=n%10;
		int div=n/10;
		n=(rem*mul)+div;
		
	}
	return n;
}
}
