//Develop a class StudentNestedIF with a main it will accept the marks and student class (10 or 11) using scanner.
//INPUT:  marks (int) and student class(int). 
//The scholarship should be calculated based on the student class and marks as mentioned below and printed in the console,
//NOTE:  YOU NEED TO USE NESTED IF TO SOLVE THIS.
//10:  This represents class 10  
//                  Rule 1:   marks<60 and >30)
//                  scholarShip =30 *15000/100
//                                if city is Chennai
//                                    scholarship =  scholarship -1000
//                                else 
//                                    scholarship =  scholarship -3000
//
//                   Rule 2:  (marks<90 and >60)
//                   scholarShip =50 *15000/100
//
//                   Rule 3:   (marks>90)
//                   scholarShip =70 *15000/100
//11:  This represents class 11  
//                  Rule 1:  marks<60 and >30)
//                  scholarShip =30 *25000/100
//                                if city is Chennai
//                                   scholarship =  scholarship -1000
//                               else 
//                                  scholarship =  scholarship -2000
//
//                  Rule 2:   (marks<90 and >60)
//                   scholarShip =50 *25000/100
//
//                  Rule 3:   (marks>90)
//                  scholarShip =70 *25000/100
//The method should return the calculated Scholarship.
//NOTE: Follow naming conventions for variables,classes and methods.
//Test the main method for multiple values as mentioned below and print the value in main method.
//Scenario 1:  
//                    Set the marks as 80, city as Chennai and class as 10
//Scenario 2:  
//                    Set the marks as 70,  city as Delhi  and class as 10
//Scenario 3:  
//                    Set the marks as 20,  city as Chennai  and class as 10.


package LoopAssignment;

public class NestedIf {
public static void main(String[] args) {
	System.out.println("\nScenario 1:");
	int scholarship1=cal(80,10,"chennai");
	System.out.println(scholarship1);
	System.out.println("\nScenario 2:");
	int schl2=cal(70,10,"Delhi");
	System.out.println(schl2);
	System.out.println("\nScenario 3");
	int schl3=cal(20,10,"Chennai");
}
static int cal(int mark,int cls,String city) {
	int schl=0;
	if(cls == 10) {
		if(mark>30 && mark<60) {
		 schl=30*15000/10;
			if(city.equalsIgnoreCase("chennai")) {
				schl=schl-1000;
			}
			else {
				schl=schl-3000;
			}
		}
		else if(mark>60 && mark<90) {
			schl=50*15000/100;
		}
		else if(mark>90){
			schl=70*15000/100;
		}
		else {
			schl=0;
		}
	}
	else if(cls == 11) {
		if(mark>30 && mark<60) {
			schl=30*25000/100;
			if(city.equalsIgnoreCase("chennai")) {
				schl=schl-1000;
			}
			else {
				schl=schl-2000;
			}
		}
		else if(mark>60 && mark<90) {
			schl=50*25000/100;
		}
		else if(mark>90) {
			schl=70*25000/100;
		}
		else {
			schl=0;
		}
	}
	return schl;
}
}
