//Topic: Case-Sensitive Replace (Reference Based)
// Problem Statement
//Given:
//A sentence
//A find string
//A replace string (same length)
//Replace all occurrences of the find string:
//Exact word
//Prefix
//Middle of a word
//while preserving the original case pattern.
//
//Example
//Input:
//ZoHo works at absZohoCorp
//
//Find: zoho
//Replace: test
//
//Output:
//TeSt works at absTeStCorp


package Pratice2;
import java.util.*;
public class CaseSensitiveReplace {
public static void main(String[] args) {
	String s="ZoHo works at ZOhoabsZoHoCorp  ZOHo";
	String fnd="zoho";
	String replace="test";
System.out.println(check(s,fnd,replace));
	}
static String check(String s,String fnd,String replace) {
	
	StringBuilder sb=new StringBuilder();
	int i=0;
	while(i<=s.length() - fnd.length()) {    //in this i moves upto less than the fnd.length...becuz of stringindexOutOfBound
		String substring=s.substring(i,i+fnd.length());
	    // Case-insensitive match
		if(fnd.equalsIgnoreCase(substring)) {
			  // Preserve case pattern
			for(int j=0;j<fnd.length();j++) {
				char org=substring.charAt(j);
				char rep=replace.charAt(j);
				
				if(Character.isUpperCase(org)) {
					sb.append(Character.toUpperCase(rep));
				}
				else {
					sb.append(Character.toLowerCase(rep));
				}
			}
			i+=fnd.length();
			}
		else {	
			sb.append(s.charAt(i));
			i++;
		}
	}
	//append the remaining words of last letter 
	while(i<s.length()) {
		sb.append(s.charAt(i));
		i++;
	}
	return sb.toString();
}
}
