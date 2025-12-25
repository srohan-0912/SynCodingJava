package Pratice2;
import java.util.*;
public class StudMain {
public static void main(String[] args) {
	List<StudentList> list=new ArrayList<>();
	list.add(new StudentList(1,"Arun","A",123));
	list.add(new StudentList(2,"Frenado","A",123));
	list.add(new StudentList(3,"Messi","B",7653));
	list.add(new StudentList(4,"Cr7","A",2341));
	list.add(new StudentList(4,"NM11","B",2341));
	
	//2.Remove Student by id

	int removeId=4;
	list.removeIf(s->s.getId() == removeId);
	System.out.println("List of student After removed:");
    for(StudentList s:list) {
    	System.out.println(s);
    }
// *********ANOTHER WAY TO REMOVE USING ITREATOR ************
//    Iterator<StudentList> it = list.iterator();
//    while (it.hasNext()) {
//        if (it.next().getId() == removeId) {
//            it.remove();
//            break; // remove only one
//        }
//    }
	
	//3.find Student By grade
	String grade="A";
	System.out.println("\nSort student By Grade:");
	for(StudentList s:list) {
		if(s.getGrade().equals(grade)) {
			System.out.println(s+" ");
		}
	}
	//4. Sort students by marks (descending)
	list.sort((s1,s2)->Double.compare(s2.getMark(),s1.getMark()));
	System.out.println("\nSorted Student List");
       for(StudentList s:list) {
    	   System.out.println(s);
       }
//***************ADDITIONAL TO SORT BASED ON GRADE ********************
//	Sort by Grade (String)
//	 Ascending order (A → B → C)
//	students.sort((s1, s2) -> s1.grade.compareTo(s2.grade));
	
	//5.Calculate Average Mark
	double sum=0;
	for(StudentList s:list) {
		sum+=s.getMark();
	}
	System.out.println("\n Average Score is:");
	double avg=sum/list.size();
	System.out.println(avg);
	
	//6.Find students scoring above average
	System.out.println("\nList of student scored above the avg ");
	for(StudentList s:list) {
		if(s.getMark() > avg) {
			System.out.println(s);
		}
	}
}
}
