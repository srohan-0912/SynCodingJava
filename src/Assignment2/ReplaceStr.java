//         Find and Replace with case sensitive
//
//Find and replace. Both strings should be equal in length. 
//Replacement should be case sensitive (as in the below example)
//
//Input: zoho is a well known company. ZoHocorporation has more employees.
//
//Find String: zoho
//Replace String: test
//
//Output: test is well known company. TeStcorporation has more employees

package Assignment2;

public class ReplaceStr {
	 public static void main(String[] args) {

		 String s="ZoHo works at ZOhoabsZoHoCorp  ZOHo";
			String fnd="zoho";
			String replace="test";
		System.out.println(check(s,fnd,replace));
			}
		static String check(String s,String fnd,String replace) {
			
			StringBuilder sb=new StringBuilder();
			int i=0;
			while(i<=s.length() - fnd.length()) {    //in this i moves upto less than the fnd.length...becuz of stringindexOutOfBound
				String substring=s.substring(i,i+fnd.length());
			    // Case-insensitive match
				if(fnd.equalsIgnoreCase(substring)) {
					  // Preserve case pattern
					for(int j=0;j<fnd.length();j++) {
						char org=substring.charAt(j);
						char rep=replace.charAt(j);
						
						if(Character.isUpperCase(org)) {
							sb.append(Character.toUpperCase(rep));
						}
						else {
							sb.append(Character.toLowerCase(rep));
						}
					}
					i+=fnd.length();
					}
				else {	
					sb.append(s.charAt(i));
					i++;
				}
			}
			//append the remaining words of last letter 
			while(i<s.length()) {
				sb.append(s.charAt(i));
				i++;
			}
			return sb.toString();
		}
		}
