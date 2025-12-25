//1.Develop a method findLicenseEligibility which accepts age and state code(as parameters)
// and returns a boolean value. The business rules are,
//        a.If age> 18 and age < 60 state is ‘TN’ or ‘KA’ or ‘KL’ – return true
//        b.If age> 60 or  age < 18 state is ‘TN’ or ‘KA’ or ‘KL’– return false
//        c.Other states return true if age > 15 and false if age < 15
//     
//2.Develop a method findAverage which finds the average of all values 
//stored in an array of 5 Integers.      

package Prog1;

public class level0 {
public static void main(String[] args) {
	String state="KL";
	int age=80;
	System.out.println(check(state,age));
	int[] arr= {120,32,12,21};
	System.out.println(avg(arr));
}
public static boolean check(String state,int age) {
	if(state.equals("TN") ||state.equals("KL") ||state.equals("KL")) {
		if(age>18 && age<60) {
			
			return true;
		}
		else {
			return false;
		}
	}else {
	if(age>15) {
		return true;
	}
	else {
		return false;
	}
	}
}
static double avg(int[] arr) {
	double sum=0;
	for(int i:arr) {
		sum+=i;
	}
	return (double)sum/arr.length;
}
}
