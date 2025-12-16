//Sum the all the even digits that are present at odd indices.
//Input: 12345678
//Output: 20
//Explanation: 2 + 4 + 6 + 8 = 20
//Input: 12375678
//Output: 20
//Explanation: 2 + 6 + 8 = 16
//Input: 12355578
//Output: 10
//Explanation: 2 + 8 = 10


package level2;

public class eSumOfEvenDIgit {
public static void main(String[] args) {
	//**********************    NUMBER FORMAT *******************************
           //	TC: O(log n)
          //	SC: O(1)
	int a=12375678;
	int num=a;
	int dig=0;
	while(num>0) {
		dig++;
		num/=10;
	}
	int sum=0;
	int ind=0;
	while(a!=0) {
		int rem=a%10;
		int currInd=dig-1-ind;
		if(currInd % 2 == 1 && rem%2 == 0) {
			sum+=rem;
		}
		ind++;
		a/=10;
	}
	System.out.println(sum);
	
	
	//********************** STRING FORMAT ******************************************************
//	String s="12345678";
//	int sum=0;
//	for(int i=1;i<s.length();i+=2) {
//		int dig=s.charAt(i) -'0';
//		if(dig%2==0) {
//			sum+=dig;
//		}
//		
//	}
//	System.out.println(sum);
}
}
