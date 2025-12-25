//QUESTION 1: Student Grade Manager (List + Map)
// Problem
//Create a program using:
//List<Student>
//Each student has:
//id, name, grade, marks
//Implement:
//Add student
//Remove student by id
//Group students by grade (Map<String, List<Student>>)
//Find top scorer in each grade
//Calculate average marks per grade

package Pratice3Collection;

public class Student {
private int id;
private String name;
private String grade;
private int mark;

Student(int id,String name,String grade,int mark){
	this.id=id;
	this.name=name;
	this.grade=grade;
	this.mark=mark;
}
public int getId() {
	return id;
}
public String getName() {
	return name;
}
public String getGrade() {
	return grade;
}
public int getMark() {
	return mark;
}
public String toString() {
	return "id: "+id +", name: "+name+ ", grade: "+grade+", mark: "+mark;
}
}
