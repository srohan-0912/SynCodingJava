//Write a method which accepts a string S. and do the below logic.
//This is to demonstrate that switch case can also support String input.
//USE ONLY SWITCH CASE.
//If string is "Apple" it should print "This is a fruit".
//If string is "Orange" it should print "This is a fruit".
//If string is "Grape" it should print "This is a fruit".
//If string is "Potato" it should print "This is a Vegetable".
//If string is "Onion" it should print "This is a Vegetable".
//If string is any other value apart from the above 
//it should print the string "I cannot classify this as a fruit or vegetable"

package LoopAssignment;
import java.util.*;
public class SwitchCase {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String s=sc.next();
	
	switch(s) {
	case "apple":
	case "Orange":
	case "Grape":
		System.out.println("This is a fruit");
		break;
		
	case "potato":
	case "Onion":
	   System.out.println("This is a Vegetable");
	   break;
	   
	   default:
		   System.out.println("I cannot Classify ");
		   break;
	}
	
	
}
}
