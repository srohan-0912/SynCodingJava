//Count frequency of each digit (0-9) in a long numeric string.
//Input: 122345567789
//Output:
//1: 1 
//2: 2 
//3: 1
//4: 1
//5: 2
//6: 1
//7: 2
//8: 1
//9: 1

package level2;
import java.util.*;
public class amapFreq {
  public static void main(String[] args) {
/*	  *************************************************************************************************************
	                                    USING HASHMAP
//	                                  TC AND SC->O(N) 
//       String s="122345567789";
//       HashMap<Character,Integer> map=new HashMap<>();
//      for(char c:s.toCharArray()) {
//	       map.put(c, map.getOrDefault(c,0)+1);
//       }
//       for(char d='0';d<='9';d++) {
//	      if(map.containsKey(d)) {
//		     System.out.println(d+":"+map.get(d));
//	     }
//      }
	  
//*******************************************************************************************************   */
	                            //  WITHOUT USING HASHMAP
                       //	  Complexity	      Value
                       //	  Time	               O(n)
                      //	  Space	               O(1) (array of size 10)
	  Scanner sc=new Scanner(System.in);
	  String s=sc.next();
	  
	  int[] freq=new int[10];
	  for(int i=0;i<s.length();i++) {
		  char c=s.charAt(i);
		  int digit=c-'0';
		  freq[digit]++;
	  }
	  
	  for(int i=0;i<=9;i++) {
		  if(freq[i]>0) {
			  System.out.println(i+":"+freq[i]);
		  }
	  }
	  
	  
}
}
