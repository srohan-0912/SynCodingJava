//Question 5: Alphanumeric Compression (String + Loop)
//From an alphanumeric string:
//Extract characters
//Count consecutive duplicates

//Print character followed by count
//Input:
//AA11BB2C
//Output:
//A2 12 B2 21 C1

package Pratice;
import java.util.*;
public class CountDigit {
public static void main(String[] args) {
	// DIFF APPROACH BUT THE ANS IS CRCT
//	String s="AA11BB2C";
//	Map<Character,Integer> map=new HashMap<>();
//	for(char c:s.toCharArray()) {
//		map.put(c,map.getOrDefault(c,0)+1);
//	}
//	for(Map.Entry<Character,Integer> e:map.entrySet()) {
//		System.out.print(e.getKey()+""+e.getValue()+" ");
//	}
	
	//CRCT SOL FOR THIS QNES
	String s="AA11BA2C";
	int i=0;
	while(i<s.length()) {
		char curr=s.charAt(i);
		int cnt=1;
		while(i+1<s.length() && curr==s.charAt(i+1)) {
			cnt++;
			i++;
		}
		System.out.print(curr+""+cnt+" ");
		i++;
	}
}
}
