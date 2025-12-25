//PROBLEM 3 (Collections – 30 mins)
//🔹 Topic: List + Objects (Library style)
//📘 Problem Statement
//
//Create a Student class with:
//id, name, grade, marks
//Using List<Student> implement:
//Add student
//Remove student by id
//Find students by grade
//Sort students by marks (descending)

//Calculate average marks
//Find students scoring above average
//Constraint
//Multiple students can have same grade

 package Pratice2;

public class StudentList {
private int id;
private String name;
private String grade;
private int mark;

StudentList(int id,String name,String  grade,int mark){
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
	return "id: "+id+" "+"name: "+name+" "+"grade: "+grade+" "+"mark: "+mark;
}
}
