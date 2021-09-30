package Lab1.ego.books;

import java.util.Comparator;

public class Book implements Comparable<Book>{
	private String title;
	private String autor;
	private int price;
	private int isbn;
	private static int edition;
	
	public Book(String title, String autor,int price) {
		this.title = title;
		this.autor = autor;
		this.price = price;
	}
	public Book(String title, String autor,int price, int isbn) {
		this.title = title;
		this.autor = autor;
		this.price = price;
		this.isbn = isbn; 
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public static int getEdition() {
		return edition;
	}
	public static void setEdition(int edition) {
		Book.edition = edition;
	}
	@Override
	public String toString() {
		return title+" "+autor+" "+price;
	}
	@Override
	public int hashCode() {
		int hash=42;
		String str=this.toString();
		for(int i=0;i<str.length();i++) {
			hash+=str.charAt(i);
			hash = hash<<5;
			hash=hash%9973;
		}
		
		return hash;
	} 
	@Override
	public boolean equals(Object obj) {
		return this.hashCode()==obj.hashCode();
	}
	@Override
	public Object clone() {
		Book b = new Book(title,autor,price);
		return b;
	}
	public int getIsbn() {
		return isbn;
	}
	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}
	
	@Override
	public int compareTo(Book o) {
		return isbn-o.getIsbn();
	}
		
	public class BookTitleComporator implements Comparator<Book>{

		@Override
		public int compare(Book o1, Book o2) {
			return o1.getTitle().compareTo(o2.getTitle());
		}
		
	} 
	public class BookAutorComporator implements Comparator<Book>{

		@Override
		public int compare(Book o1, Book o2) {
			return o1.getAutor().compareTo(o2.getAutor());
		}
		
	}
	public class BookPriceComporator implements Comparator<Book>{

		@Override
		public int compare(Book o1, Book o2) {
			return o1.getPrice()-(o2.getPrice());
		}
		
	}
	public class BookNameAutorComporator implements Comparator<Book>{

		@Override
		public int compare(Book o1, Book o2) {
			return o1.getTitle().compareTo(o2.getTitle())==0?o1.getTitle().compareTo(o2.getTitle()):o1.getAutor().compareTo(o2.getAutor());
		}
		
	} 	
	public class BookAutorNameComporator implements Comparator<Book>{

		@Override
		public int compare(Book o1, Book o2) {
			return o1.getAutor().compareTo(o2.getAutor())!=0?o1.getTitle().compareTo(o2.getTitle()):o1.getAutor().compareTo(o2.getAutor());
		}
		
	} 		
	
	public class BookAutorNamePriceComporator implements Comparator<Book>{

		@Override
		public int compare(Book o1, Book o2) {
			return o1.getAutor().compareTo(o2.getAutor())==0?o1.getAutor().compareTo(o2.getAutor()):o1.getTitle().compareTo(o2.getTitle())==0?o1.getTitle().compareTo(o2.getTitle()):o1.getPrice()-o2.getPrice();
		}
		
	} 		
}
