//Problem 4:
//Shift each digit forward by 1 (9 becomes 0).
//Input: 389
//Output: 490

package level2;
import java.util.*;
public class dShiftDigit {
public static void main(String[] args) {
	
  //**************** USING STRINGBUILDER ************************************************
	      // TC AND SC -> O(N)
	
//   int a=367;
//	StringBuilder res=new StringBuilder();
//	while(a!=0) {
//		int rem=a%10;
//		if(rem == 9) {
//			res.append(0);
//		}
//		else {
//			res.append(rem+1);
//		}
//		a/=10;
//	}
//	System.out.println(res.reverse().toString());
	
	
	//*******************************   if it is number    ********************************************
	              //    TC-O(N)         SC-O(1)
	Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
	int res=0;
	int digit=1;
	while(a!=0) {
		int rem=a%10;
		int num= (rem == 9) ? 0 : rem+1;
		res=num*digit+res;
		digit*=10;
		a/=10;
	}
	System.out.println(res);
	
	//*********************************** If it is String  *********************************
	                 // TC AND SC -> O(N)
	String s="123";
	String ans="";
	for(int i=0;i<s.length();i++) {
		int dig=s.charAt(i) - '0';
		int newDig= (dig==9)?0:dig+1;
		ans+=newDig;
		
	}
	System.out.println(ans);
	
}
}
