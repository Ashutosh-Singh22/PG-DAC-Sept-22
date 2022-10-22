/*
Implement a class for a Book. Book contains a title (a String), a list of authors (array of authors), number of
pages (an integer), price (floating point number), publisher (a String) etc. Write suitable constructor and
accessor/modifier methods. Implement a class for Library. A library contains a list of books (array of Book).
Write add (to add a book) and remove (to delete a book) methods for library. Write a main() function to create a
Library and add five Book to library. Print the total price of all books.
*/

import java.util.*;

class Book{
	String title;
	String authors[];
	int noOfPages;
	double priceOfBook;
	String publisher;
	
	Book(){
		authors = new String[2];
	}
	
	Book(String title, String authors[], int noOfPages, double priceOfBook, String publisher){
		this.title = title;
		this.authors = authors;
		this.noOfPages = noOfPages;
		this.priceOfBook = priceOfBook;
		this.publisher = publisher;
	}
}

class Library{
	Book book[];
	
	Library(){
		book = new Book[5];
	}
	
	int isSpaceAvailable(){
		
		int indexOfAvailableSpace = 5; //length of storage
		for(int i=0; i<this.book.length; i++){
			
			if(this.book[i]==null){
				indexOfAvailableSpace = i;
				break;
			}
		}
		
		return indexOfAvailableSpace;
	}
	
	void getDetailsFromUserForNewBook(int indexOfAvailableSpace){
		Scanner input = new Scanner(System.in);
		System.out.println("------------------------------------------");
		System.out.println("Please enter the below details for books: ");
		System.out.println("------------------------------------------");
		
		this.book[indexOfAvailableSpace] = new Book(); 
		
		System.out.print("Title of book: ");
		this.book[indexOfAvailableSpace].title = input.nextLine();
		
		System.out.print("Author1 of book: ");
		this.book[indexOfAvailableSpace].authors[0] = input.nextLine();
		System.out.print("Author2 of book: ");
		this.book[indexOfAvailableSpace].authors[1] = input.nextLine();
		
		System.out.print("Number of pages of book: ");
		this.book[indexOfAvailableSpace].noOfPages = input.nextInt();
		
		System.out.print("Price of book: ");
		this.book[indexOfAvailableSpace].priceOfBook = input.nextDouble();
		
		System.out.print("Publisher of book: ");
		input.nextLine();
		this.book[indexOfAvailableSpace].publisher = input.nextLine();
		
	}
	
	void addBook(){
		
		int indexOfAvailableSpace = isSpaceAvailable();
		if( indexOfAvailableSpace < 5 ){
			
			System.out.println("Storage is available to add a book.");
			getDetailsFromUserForNewBook(indexOfAvailableSpace);
		}
		else
			System.out.println("Sorry! Storage is currently full.");
	}
	
	void removeBook(){
		
		System.out.println("Please choose betweem 1-5 to delete:");
		Scanner input = new Scanner(System.in);
		int choice = input.nextInt();
		this.book[choice-1] = null;
		System.out.println("Book removed Successfully");
	}
	
	void display(){
		
		System.out.println("-----Details of all books-----");
		for(int i=0; i<this.book.length; i++){
			
			if(this.book[i] == null)
				continue;
			else{
				System.out.println("Title of book: "+this.book[i].title);
				System.out.println("Authors of book: "+this.book[i].authors[0]+" & "+this.book[i].authors[1]);
				System.out.println("Number of pages of book: "+this.book[i].noOfPages);
				System.out.println("Price of book: "+this.book[i].priceOfBook);
				System.out.println("Publisher of book: "+this.book[i].publisher);
			}
			
			System.out.println("--------------------------");
		}
	}
}

class Assign1{
	public static void main(String args[]){
		
		Library libObj = new Library();
		libObj.book[0] = new Book("Book1",new String[]{"Ath11", "Ath12"},253, 325.0, "Publisher1");
		libObj.book[1] = new Book("Book2",new String[]{"Ath21", "Ath22"},110, 210.0, "Publisher2");
		libObj.book[2] = new Book("Book3",new String[]{"Ath31", "Ath32"},60 , 105.0, "Publisher3");
		libObj.book[3] = new Book("Book4",new String[]{"Ath41", "Ath42"},400, 210.0, "Publisher4");
		//libObj.book[4] = new Book("Book5",new String[]{"Ath51", "Ath52"},210, 555.0, "Publisher5");
		
		
		libObj.display();
		
		System.out.println("Checking storage if available space...");
		libObj.addBook();
		libObj.display();
		
		libObj.removeBook();
		libObj.display();
		
	}
}