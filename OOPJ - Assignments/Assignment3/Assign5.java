/*
Implement the classes for the following inheritance hierarchies. Create an interface Shape that contains
methods area, draw, rotate, move etc. Now create two classes Circle and Rectangle that
implement this Shape interface and implement the methods area, move, etc. Write a main() function
to create two Circle and three Rectangle,then move them. Print the details of circles and rectangles
before after moving them.
*/
interface Shape{
	
	void Area();
	void Draw();
	void Rotate();
	void Move();
}

class Circle implements Shape{
	
	int radius;
	
	Circle(int radius){
		this.radius = radius;
	}
	public void Area(){
		System.out.printf("Area of circle is: %.2f \n",(3.14*radius*radius));
	}
	public void Draw(){
		System.out.println("Circle is drawn");
	}
	public void Rotate(){
		System.out.println("Circle is rotated");
	}
	public void Move(){
		System.out.println("Circle is moved");
	}
}

class Rectangle implements Shape{
	
	int length, breadth;
	
	Rectangle(int length, int breadth){
		this.length=length;
		this.breadth=breadth;
	}
	
	public void Area(){
		System.out.printf("Area of Rectangle is: %d \n",(length*breadth));
	}
	public void Draw(){
		System.out.println("Rectangle is drawn");
	}
	public void Rotate(){
		System.out.println("Rectangle is rotated");
	}
	public void Move(){
		System.out.println("Rectangle is moved");
	}
}

class Assign5{
	public static void main(String args[]){
		
		Circle c1 = new Circle(5);
		Circle c2 = new Circle(10);
		Rectangle r1 = new Rectangle(5,10);
		Rectangle r2 = new Rectangle(10,20);
		Rectangle r3 = new Rectangle(5,20);
		
		c1.Area();
		c2.Area();
		r1.Area();
		r2.Area();
		r3.Area();
	}
}