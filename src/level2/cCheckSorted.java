//Check if digits are in ascending order also if there are two digits same and repeated can be still 
//considered sorted..
//Input: 123579
// 
//Output: Sorted
//Input: 1233579 (sorted even if 3 is repeated twice)
//Output: Sorted 
//Input: 132579
//Output: Unsorted

package level2;
import java.util.*;
public class cCheckSorted {
public static void main(String[] args) {
//	int a=132579;
	
	Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
	System.out.println(check(a));
}
  
static String  check(int a) {
	int prev=10;    //THE DIGIT ARE FROM 0-9 So we take 10
	while(a!=0) {
		int rem=a%10;
		if(prev>=rem) {
			prev=rem;
		}
		else {
			return "Unsorted";
		}
		a/=10;
	}
	return "Sorted";
}
}
