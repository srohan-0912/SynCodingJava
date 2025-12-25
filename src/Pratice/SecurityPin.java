//Question 2: Secure PIN Checker (Digits only)
//A PIN is secure if:
//It contains exactly 6 digits
//No digit appears more than twice
//Sum of all digits is divisible by 3

//Input:
//112233
//Output:
//Secure PIN

//Input:
//111234
//Output:
//Not Secure

package Pratice;
import java.util.*;
public class SecurityPin {
public static void main(String[] args) {
	String pin="112233";
	System.out.println(secure(pin));
}
static String secure(String s) {
	if(s.length() !=6) {
		return "Invalid String";
	}
	int sum=0;
	HashMap<Character,Integer> map=new HashMap<>();
	for(char c:s.toCharArray()) {
		if(!Character.isDigit(c)) {
			return "Invalid Data";
		}
		map.put(c, map.getOrDefault(c, 0)+1);
		
		if(map.get(c)>2) {
			return "invalid Data";
		}
		sum+=c-'0';
	}
	if(sum%3 != 0) {
		return "Invalid Data";
	}
	return "Secure PIN";
}
}
