//Problem 2:
//A password is considered secure if it has at least one uppercase letter, one digit, and is at least 8 
//characters long.
//Input: Java1234
//Output: Secure
//Input: java1234
//Output: Not secure
//Input: java
//Output: Not secure
//Input: S3c
//Output: Not secure

package level1;

public class bPassword {
public static void main(String[] args) {
	String s="Java1234";
	boolean upper=false;
	boolean digit=false;
	
	              //USING IN BUILT FUNCTION
                    //	for(char c:s.toCharArray()) {
                    //		if(Character.isUpperCase(c)) {
                    //			upper=true;
                    //		}
                    //		if(Character.isDigit(c)) {
                    //			digit=true;
                    //		}
                    //	}
	
	        // WITHOUT USING INBUILT FUNCTION
	    for(int i=0;i<s.length();i++) {
	    	if(s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') {
	    		upper=true;
	    	}
	    	if(s.charAt(i) >= '0' && s.charAt(i) <= '9') {
	    		digit=true;
	    	}
	    }
	   
	if(s.length() >= 8 && upper && digit) {
		System.out.println("Secure");
	}
	else {
		System.out.println("Not Secure");
	}
}
}
//Approach	                        Time Complexity                      	Space Complexity
//Using inbuilt functions	            O(n)	                                   O(1)
//Without inbuilt functions	            O(n)	                                   O(1)
