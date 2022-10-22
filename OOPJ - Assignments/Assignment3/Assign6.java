/*
A bookshop maintains the inventory of books that are being sold at the shop. The list includes details such
as author, title, publisher, cost and stock position. Whenever a customer wants a book, the sales person
inputs the title and author and the system searches the list and displays whether it is available or not. If it is
not, an appropriate message is displayed. If it is, then the system displays the book details and details and
requests for the number of copies required. If the required copies are available, the total cost of the
requested copies is displayed, otherwise the message requires copies not in stock is displayed. Design a
system using a class called Book with suitable member methods and constructors.
*/
import java.util.Scanner;

class Book{
	String author;
	String title;
	String publisher;
	double cost;
	int stocksAvailable;
	
	Book(){
	}
	
	Book(String author, String title, String publisher, double cost, int stocksAvailable){
		
		this.author = author;
		this.title = title;
		this.publisher = publisher;
		this.cost = cost;
		this.stocksAvailable = stocksAvailable;
	}
}

class BookShop{
	Book bRefs[]; //bRef[0] -> b1
	
	BookShop(){
	}
	
	void displayAvailableBooks(){
		
		System.out.println("Books available are:");
		System.out.println("---------------------");
		for(int i=0; i<bRefs.length; i++){
			System.out.println(this.bRefs[i].title);
		}
		System.out.println("---------------------");
	}
	
	void isStockAvailable(int index){
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the count of copies you need: ");
		int count = input.nextInt();
		
		if(this.bRefs[index].stocksAvailable >= count){
			System.out.printf("Your total cost will be : %.2f \n",(count*this.bRefs[index].cost));
		}
		else{
			System.out.println("Required number of copies currently not in stock!");
		}
	}
	
	boolean isBookAvailable(String search){
		
		boolean flag = false;
		
		for(int i=0; i<bRefs.length; i++){
			if(this.bRefs[i].title.equalsIgnoreCase(search)){
				flag = true;
				System.out.println(search+" book is available.");
				System.out.println("---------------------");
				System.out.println("Details for the book are: ");
				System.out.println("Author: "+this.bRefs[i].author);
				System.out.println("Title:" +this.bRefs[i].title);
				System.out.println("Publisher: "+this.bRefs[i].publisher);
				System.out.println("Cost: "+this.bRefs[i].cost);
				System.out.println("Stock available: "+this.bRefs[i].stocksAvailable);
				
				//then call another method for checking if asked stock is available
				this.isStockAvailable(i);
				
				//return true;
			}
			//else
				//return false
		}
		return flag;
	}
}

class Assign6{
	public static void main(String args[]){
		
		Scanner input = new Scanner(System.in);
		
		Book b1 = new Book("Khaled Hosseni", "The kite runner", "Riverhead Books", 250, 50);
		Book b2 = new Book("Markus Zusak", "The book thief", "-unknown-", 100, 100);
		Book b3 = new Book("Amish Tripathi", "Shiva Trilogy", "HarperCollins", 500, 40);
		
		BookShop bsObj = new BookShop();
		bsObj.bRefs = new Book[]{b1, b2, b3};
		
		bsObj.displayAvailableBooks();
		
		System.out.println("Enter the title of book you want to buy");
		String search = input.nextLine();
		
		System.out.println("---------------------");
		if(!bsObj.isBookAvailable(search))
			System.out.println(search+" is NOT available");
		System.out.println("---------------------");
		
		System.out.println("Thank you for visiting!");
		
	}
}