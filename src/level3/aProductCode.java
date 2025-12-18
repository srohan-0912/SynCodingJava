//A product serial code must meet these rules:
//1) It must start with 2 uppercase letters. These letters must not be consecutive (e.g., "AB" 
//is invalid, "AZ" is valid).
//2) Followed by 4 digits.
//3) The sum of these 4 digits must be an even number. It must not contain any repeated digits.
//4) Ends with exactly one special character from this list: @, #, $, %, &.
//5) The special character must not be $ if the numeric portion contains a zero.
//6) The total length must be exactly 7 characters.

//Input: AZ1234@
//Output: Valid Product code 

//Input: AZ123@
//Output: Invalid Product Code
//Rule 2 is not satisfied.

//Input: AZ1235@
//Output: Invalid Product Code
//Rule 3 is not satisfied

//Input: AZ1123@
//Output: Invalid Product Code
//Rule 3 is not satisfied.. no repeat

//Input: AZ1234@#
//Output: Invalid Product Code
//Rule 4 is not satisfied- more than one symbol is used

//Input: AZ1203$
//Output: Invalid Product Code
//Rule 5 is not satisfied.. 0 is present and ended with $

package level3;
import java.util.*;
public class aProductCode {
public static void main(String[] args) {
                      //	Time	O(1)	Fixed number of operations
                      //	Space	O(1)	Fixed extra memory
	Scanner sc=new Scanner(System.in);
	String s=sc.next();
	 
	// Rule 6: length
	if(s.length() != 7) {
		System.out.println("Invalid Product Code");
		return;
	} 
	// 1st rule
	char c1=s.charAt(0);
	char c2=s.charAt(1);
	if(!Character.isUpperCase(c1) || !Character.isUpperCase(c2) || (c2-c1 == 1)) {
		System.out.println("Invalid Product Code \nRule 1 is not satisfied");
		return;
	}
	//2nd and 3rd rule
	String dig=s.substring(2,6);
	if(!dig.matches("\\d{4}")) {            //d → digit (0-9)    //{4} → exactly 4 digits
		System.out.println("Invalid Product Code \nRule 2 is not satisfied");
		return;
	}
	
    // Rule 3: sum even and no repeats
	int sum=0;
	HashSet<Character> set=new HashSet<>();
	for(char c:dig.toCharArray()) {
		sum+=c-'0';
		if(set.contains(c)) {
			System.out.println("Invalid Product Code \nRule 3 is not satisfied");
			return;
		}
		set.add(c);
	}
	if(sum%2 !=0 ) {
		System.out.println("Invalid Product Code \nRule 3 is not satisfied");
		return;
	}

    // Rule 4 & 5: last character
	char last=s.charAt(6);
	if("@#$%&".indexOf(last) == -1) {
		System.out.println("Invalid Product Code \nRule 4 is not satisfied");
		return;
	}
	if(last == '$' && dig.contains("0")) {
		System.out.println("Invalid Product Code \nRule 5 is not satisfied");
		return;
	}
	
     System.out.println("Valid Product Code");
}
}





            
