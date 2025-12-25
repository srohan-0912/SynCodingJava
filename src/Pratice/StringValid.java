//Question 1: Username Sanitizer (String + Validation)
//A system generates usernames from full names.

//Rules:
//Input must contain only alphabets and spaces
//There must be exactly two words
//Output username =
//First letter of first name (uppercase)
//First 3 letters of last name (lowercase)

//Input:
//Rohit Sharma
//Output:
//Rsha

//Invalid Input Example:
//Rohit_123
//Output:
//Invalid Data

package Pratice;

public class StringValid {
public static void main(String[] args) {
	//String s="Rohit Sharma";
	String s="Rohit ANSAs";
	System.out.println(check(s));
}
public static String check(String s) {
	if(!s.matches("[a-zA-Z ]+")) {
		return "Invalid Matches";
	}
	String[] words=s.trim().split("\\s+");
	
	if(words.length!=2) {
		return "Invalid Data";
	}
	
	String frst=words[0];
	String lst=words[1];
	
	if(lst.length()<3) {
		return "Invalid Data";
	}
	char frstLetter=Character.toUpperCase(frst.charAt(0));
	String lstLetter=lst.toLowerCase().substring(0,3);
	return frstLetter+lstLetter;
	
}
}
