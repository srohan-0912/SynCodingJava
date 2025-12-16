//License Plate Code Validator
//Format: "XX-NNNN" where X is a capital letter and N is a digit. And no two digits can be repeated 
//sequentially Validate.
//Input: KA-1234
//Output: Valid
//Input: KA-1224
//Output: In Valid (as digit 2 repeats sequentially.)
//Input: K1-1234
//Output: Invalid

package level2;

public class bValidPlate {
public static void main(String[] args) {
	String s="KA-1234";
	if(s.length() != 7) {
		System.out.println("INVALID");
		return;
	}
   if(s.charAt(0) < 'A' || s.charAt(0)>'Z' || s.charAt(1)<'A' || s.charAt(1)>'Z') {
	   System.out.println("Invalid");
	   return;
   }
   if(s.charAt(2) != '-') {
	   System.out.println("Invalid");
	   return;
   }
   for(int i=3;i<7;i++) {
	   if(s.charAt(i) <'0' || s.charAt(i) >'9') {
		   System.out.println("Invalid");
		   return;
	   }
	   if(i>3 && s.charAt(i) == s.charAt(i-1)) {
		   System.out.println("Invalid");
		   return;
	   }
   }
   System.out.println("Valid");
	
}
}
