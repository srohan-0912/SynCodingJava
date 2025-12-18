//A message is encoded with a pattern:
//1) Even index → move character 1 step forward
//2) Odd index → move character 1 step backward
//3) Encoding is case-sensitive. 'A' becomes 'B', 'a' becomes 'b'.
//4) If shifting 'z' forward → wrap to 'a'. If shifting 'a' backward → wrap to 'z'. Similarly for 'Z' and 'A'.

//Input: AbzZ
//Output: BaaY
//Explanation: 
//Indexes: 0:A, 1:b, 2:z, 3:Z
//• Index 0 → 'A' → 'B'
//• Index 1 → 'b' → 'a'
//• Index 2 → 'z' → 'a' (wraparound)
//• Index 3 → 'Z' → 'Y'

//Input: hello
//Output: idmkp
//Explanation: 
//Indexes: 0:h, 1:e, 2:l, 3:l, 4:o
//• 0 → 'h' → 'i'
//• 1 → 'e' → 'd'
//• 2 → 'l' → 'm'
//• 3 → 'l' → 'k'
//• 4 → 'o' → 'p
package level3;

import java.util.Scanner;

public class CmessageEncode {
public static void main(String[] args) {
//	String s="hello";
	
	Scanner sc=new Scanner(System.in);
	String s=sc.next();
    System.out.println(check(s));
}
static String check(String s) {
	char[] c=s.toCharArray();
	for(int i=0;i<c.length;i++) {
		if(i%2 == 0) {
		   if(c[i] == 'z')          c[i]='a';
		   else if(c[i] =='Z')      c[i]='A';
		   else {
			   c[i]++;
		   }
		}
		else {
			 if(c[i] == 'a')          c[i]='z';
			   else if(c[i] =='A')    c[i]='Z';
			   else {
				   c[i]--;
			   }
		}
	}
	return new String(c);
}
}
