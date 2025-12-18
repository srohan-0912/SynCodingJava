//You are given two equal-length words. Combine them by taking characters alternately from each word. Follow the below rules,
//1) Both words must be at least 5 characters long and of equal length.
//2) If a character is a vowel, convert it to uppercase.
//3) If a character is a consonant, convert it to lowercase.
//4) If the character from word 2 is a vowel, repeat it once in the output.
//e.g., 'a' from word 2 → becomes 'AA'
//Input:
//word1 = stone
//word2 = audio
//Output: sAAtUUOdnIIEOO
//Explanation:
//Index       From     Processed   From     Processed      Output 
//            word1                 word2                   fragment
//0            s          s          a         AA            sAA
//1            t          t          u         UU            tUU
//2            o          O          d         d              Od
//3            n          n          i         II            nII
//4            e          E          o         OO            EOO
package level3;

import java.util.Scanner;

public class D2Words {
public static void main(String[] args) {
//	String w1="stone";
//	String w2="audio";
	Scanner sc=new Scanner(System.in);
	String w1=sc.next();
	String w2=sc.next();
	if(w1.length()<5 ||w2.length()<5 || w1.length() != w2.length()) {
		System.out.println("Invalid");
	}
	System.out.println(check(w1,w2));
}

	static String check(String w1,String w2) {
	StringBuilder sb=new StringBuilder();
	for(int i=0;i<w1.length();i++) {
		char c1=w1.charAt(i);
		char c2=w2.charAt(i);
		
		if(isVowel(c1)) {
			sb.append(Character.toUpperCase(c1));
		}
		else {
			sb.append(Character.toLowerCase(c1));
		}
		if(isVowel(c2)) {
			sb.append(Character.toUpperCase(c2)).append(Character.toUpperCase(c2));
		}
		else {
			sb.append(Character.toLowerCase(c2));
		}
	}
	return sb.toString();
}
	
static boolean isVowel(char ch) {
	ch=Character.toLowerCase(ch);
	return ch=='a'||ch=='e' || ch=='i' ||ch=='o'||ch=='u';
}
}
