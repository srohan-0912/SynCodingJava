package CollectionAssign4;
import java.util.*;
public class Library {
private List<book> b1=new ArrayList<>();

//Add  book
public void addBook(book b) {
	b1.add(b);
}
//Remove book by title
public void removeBook(String title) {
	b1.removeIf(b->b.getTitle().equalsIgnoreCase(title));
}
//Find Book By Author
public List<book> findBook(String author){
	List<book> res=new ArrayList<>();
	for(book a:b1) {
		if(a.getAuthor().equalsIgnoreCase(author)) {
			res.add(a);
		}
	}
	return res;
}
//Sort Books by year
public void sortBook() {
Collections.sort(b1,new Comparator<book>(){
public int compare(book b2,book b3) {
	return b2.getYearPublished()-b3.getYearPublished();
}
});
}
//calculate Avg Price
public double calculateAvg() {
	if(b1.isEmpty()) {
		return 0;
	}
	double sum=0;
	for(book b:b1) {
		sum+=b.getPrice();
	}
	return sum/b1.size();
}
// Find Books within Price Range

public List<book> findBooksInPriceRange(double min,double max){
	List<book> res=new ArrayList<>();
	for(book b:b1) {
		if(b.getPrice()>=min && b.getPrice()<=max) {
			res.add(b);
		}
	}
	return res;
}

// Update Book Price by Title
public void updateBook(String title,double newprice) {
	for(book b:b1) {
		if(b.getTitle().equalsIgnoreCase(title)) {
			b.setPrice(newprice);
		}
	}
}



public static void main(String[] args) {
	Library lib=new Library();
	lib.addBook(new book("book1","Author1",2020,15.98));
	lib.addBook(new book("book2","Author2",2022,549.3));
	lib.addBook(new book("book3","Author3",2024,34.53));
	lib.addBook(new book("book2","Author1",2025,532.11));
	lib.addBook(new book("book3","Author1",2023,34.53));
	
	//Remove book
	lib.removeBook("book2");
	
	//Find Book By Author
	System.out.println("Find Book by author:");
	System.out.println(lib.findBook("Author1"));
	
	//Sort book By year
	  System.out.println("\nBooks sorted by year:");
	  lib.sortBook();
	  for (book b : lib.b1) {
		    System.out.println(b);
		}
	  
	  //Calculate Avg
	  System.out.println("Avg price is:"+lib.calculateAvg());
	  
	  // Find Books within Price Range
	   System.out.println("\nBooks between $10 and $20:");
       System.out.println(lib.findBooksInPriceRange(10, 20));
       
       // Update Book Price by Title
       lib.updateBook("book3",24.32);

     System.out.println("\nAfter price update:");
     for (book b : lib.b1) {
    System.out.println(b);
     }
}
}
