/*
Create an abstract class Publication with data members noOfPages, price, publisherName etc. with
their accessor/modifier functions. Now create two sub-classes Book and Journal. Create a class
Library that contains a list of Publications. Write a main() function and create three Books and two
Journals, add them to library and print the details of all publications.
*/
abstract class Publication{
	private int noOfPages;
	private double price;
	private String publisherName;
	
	Publication(){
		
	}
	
	Publication(int noOfPages, double price, String publisherName){
		this.noOfPages = noOfPages;
		this.price = price;
		this.publisherName = publisherName;
	}
	
	public void setNoOfPages(int noOfPages){
		this.noOfPages = noOfPages;
	}
	
	public int getNoOfPages(){
		return this.noOfPages;
	}
	
	public void setPrice(double price){
		this.price = price;
	}
	
	public double getPrice(){
		return this.price;
	}
	
	public void setPublisherName(String publisherName){
		this.publisherName = publisherName;
	}
	
	public String getPublisherName(){
		return this.publisherName;
	}
	
	abstract void printDetails();
	
}

class Book extends Publication{
	int bookName;
	
	Book(int noOfPages, double price, String publisherName){
		setNoOfPages(noOfPages);
		setPrice(price);
		setPublisherName(publisherName);
	}
	
	void printDetails(){
		System.out.println("Number of pages: "+this.getNoOfPages());
		System.out.println("Price: "+this.getPrice());
		System.out.println("Publisher: "+this.getPublisherName());
	}
	
}
class Journal extends Publication{
	
	Journal(int noOfPages, double price, String publisherName){
		setNoOfPages(noOfPages);
		setPrice(price);
		setPublisherName(publisherName);
	}
	
	void printDetails(){
		System.out.println("Number of pages: "+this.getNoOfPages());
		System.out.println("Price: "+this.getPrice());
		System.out.println("Publisher: "+this.getPublisherName());
	}
}

class Library{
	
	Publication publicationRefs[];
	
	Library(){
		publicationRefs = null;;
	}
	
	void printDetails(){
		
		for(int i=0; i<5; i++){
			publicationRefs[i].printDetails();
		}

		/*
		for(int i=0; i<3; i++){
			System.out.println("Book name: "+(Book)this.publicationRefs[i].bookName());
			System.out.println("Number of pages: "+this.publicationRefs[i].getNoOfPages());
			System.out.println("Price: "+this.publicationRefs[i].getPrice());
			System.out.println("Publisher: "+this.publicationRefs[i].getPublisherName());
		} 
		*/
	}
	
	public static void main(String args[]){
		
		//assigning 3 Book class reference to class reference
		Book b1 = new Book(100, 123.40, "Book1");
		Book b2 = new Book(200, 456.70, "Book2");
		Book b3 = new Book(300, 890.10, "Book3");
		//assigning 2 Journal class reference to class reference
		Journal j1 = new Journal(20, 5555.50, "Journal1");
		Journal j2 = new Journal(30, 7777.50, "Journal2");
		
		Library libraryObj = new Library();
		libraryObj.publicationRefs = new Publication[]{b1, b2, b3, j1, j2};
		
		//Printing details
		libraryObj.printDetails();
	}
}