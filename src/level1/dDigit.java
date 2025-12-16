//Problem 4:
// 
//From a given alphanumeric string extract only digits and compute their sum.
//Input : ID123ABC45
//Output: 12345
//Sum = 15
package level1;
import java.util.*;

public class dDigit {
public static void main(String[] args) {
	//*****************************            *************************************************
	                      //TC AND SC -   O(N)         USING STRING BUILDER
//	String s="ID123ABC45";
//	int sum=0;
//	StringBuilder sb=new StringBuilder();
//	for(char c:s.toCharArray()) {
//		if(Character.isDigit(c)) {
//			sb.append(c-'0');
//			sum+=c-'0';
//		}
//	}
//	System.out.println(sb.toString());
//	System.out.println(sum);
                  	//***********************        ********************************************
	                 // TC - O(N)    SC- O(1)      WITHOUT USING STRING BUILDER
	Scanner sc=new Scanner(System.in);
	String s=sc.next();
	int sum=0;
	int num=0;
	for(int i=0;i<s.length();i++) {
		char c=s.charAt(i);
		if(c>='0' && c<='9') {
			sum+=c-'0';   //convert string to number
			num=num*10+ c-'0';
		}
	}
	System.out.println("output:" + num +" "+"sum is: "+sum);
	
	
}
}
