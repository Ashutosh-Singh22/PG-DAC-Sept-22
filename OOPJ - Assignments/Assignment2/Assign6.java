/*
Write a class Box that with three member-variables height, width and breadth. Write suitable
constructors to initialize them. Add functions like getVolume and getArea that will return volume and surface
area respectively. Instantiate two arbitrary boxes and then print their volume and surface area.
*/

class Box{
	double height;
	double width;
	double breadth;
	
	Box(){
		height=0;
		width=0;
		breadth=0;
	}
	
	Box(double height, double width, double breadth){
		this.height=height;
		this.width=width;
		this.breadth=breadth;
	}
	
	double getVolume(){
		return height*breadth*width;
	}
	
	double getArea(){
		return 2*(height*breadth+breadth*width+height*width);
	}
	
}

public class Assign6{
	public static void main(String args[]){
		Box box1 = new Box(5,1,8);
		Box box2 = new Box(10,4,2);
		
		System.out.println("Volume of box1 : "+(box1.getVolume()));
		System.out.println("Area of box1 : "+(box1.getArea()));
		System.out.println("===================================");
		System.out.println("Volume of box2 :"+(box2.getVolume()));
		System.out.println("Area of box2 : "+(box2.getArea()));
	}
}