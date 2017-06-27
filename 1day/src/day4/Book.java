package day4;

public class Book {
	private String title;
	private String author;
	private int ISBN;
	
	public Book(String t, int i){
		this(t, "Anonymous", i);
	}
	public Book(){
		title = "null";
		author = "null";
		ISBN = 0;
	} 

	public Book(String t, String a, int i) {
		title = t;
		author = a;
		ISBN = i;
	}

	public String getTitle(){
		return title;
	}
	public String getAuthor(){
		return author;
	}
	public int getISBN(){
		return ISBN;
	}
}