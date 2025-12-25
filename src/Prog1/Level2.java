//1. Find whether a given word can be converted in to palindrome or not
//
//Input: tests
//Output: Yes
//Explanation: It can be converted in to tsest or stets
//
//Input: arm
//Output: No
//
//Positive Test Cases
//tstststsa
//tsagdatsagd
//Negative Test Cases
//tstststsae

package Prog1;
import java.util.*;
public class Level2 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String s=sc.next();
	System.out.println(palin(s));
}
	static String palin(String s) {
	Map<Character,Integer> map=new HashMap<>();
	for(char c:s.toCharArray()) {
		map.put(c,map.getOrDefault(c, 0)+1);
	}
	int oddCnt=0;
	for(int cnt:map.values()) {
		if(cnt%2 !=0) {
			oddCnt++;
		}
	}
	if(oddCnt<=1) {
		return "YES";
	}
	return "NO";
	
}
}
