//Word Length Pattern Checker
//A sentence is valid if 
//1) Word lengths form a strictly increasing or decreasing sequence.
//2) No two adjacent words should have the same length.
//3) The sentence must contain at least 4 words to be evaluated.
//4) Words must consist only of alphabets (no numbers, special characters, or mixed words like 
//"go2", "hello!").
//5) The first and last word must have a difference in length ≥ 2.
//6) Input is case-insensitive; treat "Hello" and "hello" the same.

//Input: I am here today
//Output: Valid Sentence

//Input: Hi I am on Mars
//Output: Invalid Sentence
//Rule 1 not satisfied Word lengths: 2, 1, 2, 2, 4 → Mixed and not strictly increasing or decreasing
//Rule 2 fails as the adjacent words “am” and “on” have same lengths

//Input: Go now fast
//Output: Invalid Sentence
//Rule 3 fails as the sentence has less than 4 words

//Input: Hello!
//Output: Invalid Sentence
//Rule 4 fails as it has special characters

//Input: We are here now
//Output: Invalid Sentence
//Violates rule 5 as the length difference between first word and last word is less than 2

package level3;

import java.util.Scanner;

public class bWordLength {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String s=sc.nextLine();
	System.out.println(check(s));
}
  public static String check(String s) {
	  s=s.toLowerCase();

      // Split words by spaces
	  String[] words=s.split("\\s+");
	  
	// Rule 3: Minimum 4 words
	  if(words.length < 4) {
		  return "Invalid Sentence \n (Rule 3 failed: Less than 4 words)";
	  }
	 // Rule 4:check numbers,alpha
	  for(String word:words) {
		 if(!word.matches("[a-zA-Z]+")) {
		    return "Invalid Sentences Rule 4 failed";	 
		 }
	  }
	  // Store word lengths
	  int[] len=new int[words.length];
	  for(int i=0;i<words.length;i++) {
		  len[i]=words[i].length();
	  }
	  // Rule 2: No two adjacent words have same length
	  for(int i=0;i<len.length-1;i++) {
		  if(len[i] == len[i+1]) {
			  return "Invalid Sentence Rule 2 is not matched";
		  }
	  }
	// Rule 1: Strictly increasing or strictly decreasing
	  boolean inc=true;
	  boolean dec=true;
	  for(int i=0;i<len.length-1;i++) {
		  if(len[i]>=len[i+1]) {
			  inc=false;
		  }
		  if(len[i] <= len[i+1]) {
			  dec=false;
		  }
	  }
	if(!inc && !dec) {
		return "Invalid Sentence Rule 1 is Not statisfied";
	}
	   // Rule 5: Difference between first and last word lengths >= 2
	int diff=Math.abs(len[0]-len[len.length-1]);
	if(diff < 2) {
		return "Invalid Sentence Rule 5 is failed";
	}
	return "Valid Sentence";
  }
}
