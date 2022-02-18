package unit1;

import java.util.ArrayList;
import java.util.List;

class Book12{
	int id;
	String name,author,publisher;
	int quantity;
	public Book12(int id,String name,String author, String publisher, int quntity) {
		this.id = id;
		this.name = name;
		this.author = author;
		this.publisher = publisher;
		this.quantity = quntity;
		
	}
}

public class Book2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Book12> list = new ArrayList<Book12>();
		Book12 b1 = new Book12(120829,"Arif","Sukuna","hi",200);
		Book12 b2 = new Book12(120820,"SArif","Aukuna","hii",300);
		Book12 b3 = new Book12(120819,"Srf","Auuna","i",300);
		list.add(b1);
		list.add(b2);
		list.add(b3);
		 for(Book12 b:list){  
		        System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);  
		    }  

	}

}
