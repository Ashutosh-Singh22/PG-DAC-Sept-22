/*
Create a class called Author is designed as follows:
It contains: • three private instance variables: name (String), email (String), and gender (
char of either m or f). • One constructor to initialize the name, email and gender with the given values.
And, a class called Book is designed as follows: It contains: • Four private instance variables: name (String), 
author (of the class Author you have just created), price (double), and qtyInStock (int). Assuming that each book is written
by one author. • One constructor which constructs an instance with the values given. • Getters and setters:
getName(), getAuthor(), getPrice(), setPrice(), getQtyInStock(), setQtyInStock(). Again there is no setter for name
and author. Write the class Book (which uses the Author class written earlier). Try:
1.Printing the book name, price and qtyInStock from a Book instance. (Hint: aBook.getName())
2. After obtaining the Author object, print the Author (name, email & gender) of the book.
*/

class Author{
	private String name;
	private String email;
	private char gender;
	
	Author(){
		
	}
	
	Author(String name, String email, char gender){
		this.name = name;
		this.email = email;
		this.gender = gender;
	}
	
	public String toString(){
		return "Author[Name = "+this.name+", email = "+this.email+", gender = "+gender+"]";
	}
	
}

class Book{
	private String name;
	private Author author;
	private double price;
	private int qtyInStock;
	
	Book(){
		
	}
	
	Book(String name, Author author, double price, int qtyInStock){
		this.name = name;
		this.author = author;
		this.price = price;
		this.qtyInStock = qtyInStock;
	}
	
	public String getName(){
		return this.name;
	}
	
	public Author getAuthor(){
		return this.author;
	}
	
	public void setPrice(double price){
		this.price = price;
	}
	
	public double getPrice(){
		return this.price;
	}
	
	public void setQtyInStock(int qtyInStock){
		this.qtyInStock = qtyInStock;
	}
	
	public int getQtyInStock(){
		return this.qtyInStock;
	}
}

class Assign7{
	
	public static void main(String agrs[]){
		
		Author aObj = new Author("Author", "authorworks@nono.com", 'm');
		Book bObj = new Book("Times No 1", aObj,350.0, 10000);
		
		System.out.println("Printing book details: ");
		System.out.println("-----------------------");
		System.out.println("Name of book: "+bObj.getName());
		System.out.println("Price: "+bObj.getPrice());
		System.out.println("Quantity available: "+bObj.getQtyInStock());
		System.out.println("-----------------------");
		System.out.println("Printing Author details: ");
		System.out.println("-----------------------");
		System.out.println("Details of Author: "+bObj.getAuthor());
		
	}
}