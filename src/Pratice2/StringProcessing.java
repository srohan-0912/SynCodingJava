//Topic: String Processing
//📘 Problem Statement
//Write a Java program to:
//Read a sentence from the user
//Print only the words that:
//Start with a vowel
//Have odd length

//Example
//Input:
//I like to eat apples

//Output:
//I eat 

//Constraints
//Case insensitive
//Words may contain punctuation
package Pratice2;

public class StringProcessing {
public static void main(String[] args) {
	String s="I!! like to eat apples";
	String[] words=s.split("\\s+");
	String ans="";
	for(String w:words) {
		String clean=w.replaceAll("[^a-zA-Z]",""); //replace punctuation,by checking for if it is not a letter
		// safety check
        if (clean.isEmpty()) {
            continue;
        }

		
		char c=clean.toLowerCase().charAt(0);
		if(clean.length() % 2 !=0 && (c == 'a' ||c=='e'||c=='i'||c=='o'||c=='u')) {
			ans+=clean+" ";
		}
	}
	System.out.print(ans.trim());
}
}
