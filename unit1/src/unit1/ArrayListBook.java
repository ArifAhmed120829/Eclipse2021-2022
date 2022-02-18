package unit1;

import java.util.ArrayList;
import java.util.List;

class Book{
	int id;
	String name,author,publisher;
	int quantity;
	public Book(int id,String name,String author,String publisher, int quantity) {
		this.id = id;
		this.name  = name;
		this.author = author;
		this.publisher = publisher;
		this.quantity = quantity;		
	}
}


public class ArrayListBook {

	public static void main(String[] args) {
		//Creating list of Books
		List<Book>list  = new ArrayList <Book>();
		Book b1 =  new Book(101,"aRIF aHMED","sANIR pLA","HOGI COGI", 122);
		Book b2 =  new Book(102,"SUKUNA","KMP","FORR", 123);
		Book b3 =  new Book(103,"aDDI GSF","sR p","HO", 124);
		 //Adding Books to list  
		list.add(b1);
		list.add(b2);
		list.add(b3);
		//Traversing list  
		for(Book b:list){  
	        System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);  
	    }  

	}

}
