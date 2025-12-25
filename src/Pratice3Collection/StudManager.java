
//STUDENT 
package Pratice3Collection;
import java.util.*;
public class StudManager {
public static void main(String[] args) {
	List<Student> list=new ArrayList<>();
	list.add(new Student(1,"Fernando","A",101));
	list.add(new Student(2,"Mendis","B",102));
	list.add(new Student(3,"yamal","C",103));
	list.add(new Student(4,"ramos","A",104));
	list.add(new Student(5,"Mbappe","C",105));
	list.add(new Student(1,"Mbappe","C",105));
	
	//2.Remove student by id
	int id=1;
	list.removeIf(s->s.getId() == id);
	System.out.println("\nList after id removed:");
	for(Student s:list) {
		System.out.println(s);
	}
	
	// 3.Group students by grade (Map<String, List<Student>>)
	Map<String,List<Student>> Grade=new HashMap<>();
	for(Student s:list) {
		if(!Grade.containsKey(s.getGrade())) {
			Grade.put(s.getGrade(), new ArrayList<>());
		}
		Grade.get(s.getGrade()).add(s);
	}
	System.out.println("\n Print Grouped Student by grade: ");
	for(String g:Grade.keySet()) {
		for(Student s:Grade.get(g)) {
			System.out.println(s);
		}
	}
	
	//4.Find top scorer in each grade
	System.out.println("\nTop scorer in each grade:");
	for(String g:Grade.keySet()) {
		Student top=null;
		for(Student s:Grade.get(g)) {
			if(top == null || s.getMark()>top.getMark()) {
				top=s;
			}
		}
		System.out.println(g+" "+top.getName()+" "+top.getMark());
	}
	
	// 6. Calculate average marks per grade
	System.out.println("\n Avg Mark By Grade:");
	for(String g:Grade.keySet()) {
		int sum=0;
		List<Student> l=Grade.get(g);
		for(Student s:l) {
			sum+=s.getMark();
		}
		double avg=(double)sum/l.size();
		System.out.println("Grade "+g + ", avg: "+avg);
	}

}
}
