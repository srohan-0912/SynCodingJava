//A school needs to generate initials for student user names based on the data provided. Please note 
//the data need not be always valid it might some times come as alpha numeric. In that case the 
//output should be “Invalid Data”
//Valid Input: Anjali Mehta
//Output: AM
//In Valid Input: Samir _mehta
//Output: Invalid Data


package level1;

public class aValidStu {
public static void main(String[] args) {
	 String s="Samir _mehta";
	   for(char c:s.toCharArray()) {
		   if(!Character.isLetter(c) && c != ' ') {
			   System.out.println("Invalid Data");
			   return;
		   }
	   }
	   String[] words=s.trim().split(" ");
	   StringBuilder res=new StringBuilder();
	   for(String word:words) {
		   if(!word.isEmpty()) {
			   res.append(word.charAt(0));
		   }
	   }
	   System.out.println(res.toString().toUpperCase());
}
}
