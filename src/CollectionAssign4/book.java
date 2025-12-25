//Assignment - 4
//Collections with Value Objects
//Create a program that manages a list of books using a value object called Book.
//Each Book object should contain the following parameters:
//String title
//String author
//int yearPublished
//double price
//Implement the following functionalities using a List<BookVO>:
//Add Book: Add a new Book object to the list.
//Remove Book: Remove a Book object from the list by title.
//Find Books by Author: Retrieve a list of books written by a specific author.
//Sort Books by Year: Sort the list of books by their year of publication in ascending order.
//Calculate Average Price: Calculate and return the average price of all the books in the list.
//Find Books within Price Range: Retrieve a list of books whose prices fall within a specified range.
//Update Book Price: Update the price of a book identified by its title.

//Example Scenario:
//Add books "Book1" by "Author1" (2020, $15.99), "Book2" by "Author2" (2018, $9.99), and "Book3" by "Author1" (2021, $20.00).
//Remove the book "Book2".
//Find all books by "Author1".
//Sort the books by their publication year.
//Calculate the average price of the remaining books.
//Find all books with prices between $10.00 and $20.00.
//Update the price of "Book3" to $18.50.

package CollectionAssign4;

public class book {
private String title;
private String author;
private int yearPublished;
private double price;

public book(String title,String author,int yearPublished,double price) {
	this.title=title;
	this.author=author;
	this.yearPublished=yearPublished;
	this.price=price;
}
public String getTitle() {
	return title;
}
public String getAuthor() {
	return author;
}
public int getYearPublished() {
	return yearPublished;
}
public double getPrice() {
	return price;
}   
//For setting new Price to the product
public void setPrice(double price) {
    this.price = price;
}

public String toString() {
	return "title:"+title +"author:"+author+"yearPublished:"+yearPublished+"price:"+price;
}
}
