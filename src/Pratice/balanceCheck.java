//Question 4: Balanced Word Checker (String Logic)

//A word is balanced if:
//Number of vowels = number of consonants

//Input:
//team
//Output:
//Balanced

//Input:
//apple
//Output:
//Not Balanced
package Pratice;

public class balanceCheck {
public static void main(String[] args) {
	String s="aabb";
	s=s.toLowerCase();
	int Vcnt=0;
	int Ccnt=0;
	for(char c:s.toCharArray()) {
		if(c=='a' ||c=='e'||c=='i' ||c=='o'||c=='u') {
			Vcnt++;
		}
		else {
			Ccnt++;
		}
	}
	System.out.println(Vcnt == Ccnt ? "Balanced" :"Not Balanced");
}
}
