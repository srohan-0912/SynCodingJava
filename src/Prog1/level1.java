//Validate if a given email id is valid or not based on the following conditions.
//     a)The email id should start with a character
//     b)There should be one @ in the email id
//     c)There should be one . in the email id after @
//     d)There should be at least one character between @ and .
//     e)The email id should end with com
//     
//Positive Test Cases:
//              abcd@xyz.com
//              ijk@a.com
//              abcd.ijk@kkk.com
//              
//Negative Test Cases: 
//              @xhy.com
//              aaa@.com
//              abcd@kk.a 

package Prog1;

public class level1 {
public static void main(String[] args) {
	String s=" @xhy.com";
	s=s.trim();
	System.out.println(check(s));
}
	static String check(String s) {
	if(!Character.isLetter(s.charAt(0))) {
		return "Invalid";
	}
	int ind=s.indexOf('@');
	if(ind == -1 || s.indexOf('@',ind+1) != -1) {
		return "Invalid";
	}
//	   Rule c & d: . after @ and at least one char between
	int dotInd= s.indexOf('.',ind);
	if(dotInd==-1 || dotInd == ind+1) {
		return "Invalid";
	}
//	e)The email id should end with com
	if(!s.endsWith("com")) {
		return "Invalid";
	}
	return "Valid";
}
}
