package Pratice3Collection;
import java.util.*;
public class BookMain {
public static void main(String[] args) {
	List<Stud1Book> list=new ArrayList<>();
	
	 list.add(new Stud1Book("Java Basics", "James", 500, 1));
     list.add(new Stud1Book("Java Basics", "James", 550, 2)); 
     list.add(new Stud1Book("Python", "Guido", 450, 1));
     list.add(new Stud1Book("Python", "Guido", 400, 2));     
     list.add(new Stud1Book("C++", "Bjarne", 600, 1));
     list.add(new Stud1Book("DSA", "James", 700, 1));
     list.add(new Stud1Book("DSA", "James", 700, 2));
   //1.  Remove duplicate books (same title + author)  if same check the latest edition
     System.out.println("\n After removed same author and title");
    List<Stud1Book> unique=new ArrayList<>();
    
    for(Stud1Book s:list) {
    	boolean found=false;
    	for(Stud1Book u:unique) {
    		if(u.getAuthor().equals(s.getAuthor()) && u.getTitle().equals(s.getTitle())) {
    			found=true;
    			
    			if(s.getEdition() > u.getEdition()) {
    				u.setPrice(s.getPrice());
    				u.setEdition(s.getEdition());
    			}
    			break;
    		}
    	}
    	if(!found) {
    		unique.add(s);
    	}
    }
    for(Stud1Book s:unique) {
    	 System.out.println(s.getAuthor()+" "+s.getEdition()+" "+s.getPrice()+" "+s.getTitle()+" ");;
    }
  //2.  Sort books by price (descending)
    Collections.sort(list,(a,b)->Integer.compare(b.getPrice(),a.getPrice()));
    System.out.println("\n Books order after sorting:");
    for(Stud1Book s:list) {
    	System.out.println(s);
    }
   //3.Find cheapest book per author
    Collections.sort(list,(a,b)->Integer.compare(a.getPrice(),b.getPrice()));
    Map<String,Stud1Book> map=new HashMap<>();
    for(Stud1Book s:list) {
    	if(!map.containsKey(s.getAuthor())) {
    		map.put(s.getAuthor(), s);
    	}
    }
    System.out.println("\n cheapest book by author: ");
    for(String s:map.keySet()) {
    	Stud1Book b=map.get(s);
    	System.out.println(b);
    }
    
    //4.Count books per author (Map<String, Integer>)
    Map<String,Integer> cntMap=new HashMap<>();
    for(Stud1Book s:list) {
    cntMap.put(s.getAuthor(),cntMap.getOrDefault(s.getAuthor(),0)+1);
    }
    System.out.println("\nCOunt books per author:");
    
    for(String a:cntMap.keySet()) {
    	System.out.println(a+" "+cntMap.get(a));
    }
    
  //5.  Update price of a book only if it is the latest edition
    String updateTitle = "DSA";
    String updateAuthor = "James";
    int  newPrice = 750;
    
    int latestEdition=-1;
    for(Stud1Book s:list) {
    	if(s.getTitle().equals(updateTitle) && s.getAuthor().equals(updateAuthor)) {
    	     if(s.getEdition() > latestEdition) {
    	    	 latestEdition=s.getEdition();
    	     }
    		}
    }
    for(Stud1Book s:list) {
    	if(s.getTitle().equals(updateTitle) && s.getAuthor().equals(updateAuthor) && s.getEdition() == latestEdition) {
    		s.setPrice(newPrice);
    	}  
    	System.out.println("\nAfter price update:");
   	System.out.println(s.getTitle()+" "+s.getAuthor()+" "+s.getEdition()+" "+"new price update:  "+ s.getPrice());
  } 

}
}
