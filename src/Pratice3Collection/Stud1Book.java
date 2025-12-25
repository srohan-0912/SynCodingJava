//QUESTION 2: Book Inventory with Duplicate Titles
//📌 Problem
//you are given:
//List<Book>
//Each Book has:
//title
//author
//price
//edition (higher edition = latest)
//You must implement:
//Remove duplicate books (same title + author)
//Sort books by price (descending)
//Find cheapest book per author
//Count books per author → Map<String, Integer>
//Update price only if the book is the latest edition

package Pratice3Collection;

public class Stud1Book {
private String title;
private String author;
private int price;
private int edition;

public Stud1Book(String title,String author,int price,int edition) {
	this.title=title;
	this.author=author;
	this.price=price;
	this.edition=edition;
	
}
public String getTitle() {
	return title;
}
public String getAuthor() {
	return author;
}
public int getPrice() {
	return price;
}
public int getEdition() {
	return edition;
}
public void setEdition(int edition) {
	this.edition=edition;
}
public void setPrice(int price) {
	this.price=price;
}

public String toString() {
	return "title: "+title+", author: "+author+", price: "+price+", edition "+edition;
}
}
