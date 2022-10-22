/*
Create a class Room which will hold the height, width and breadth of the room in three fields. This class
also has a method volume() to calculate the volume of this room. Create another class RoomDemo which will
use the earlier class, create instances of rooms, and display the volume of room.
*/
class Room{
	double height;
	double width;
	double breadth;
	
	double volume(){
		return this.height*this.width*this.breadth;
	}
}

class RoomDemo{
	Room r;
	
	RoomDemo(){
		r = new Room();
		this.r.height=0;
		this.r.width=0;
		this.r.breadth=0;
	}
	
	RoomDemo(double height, double width, double breadth){
		r = new Room();
		this.r.height = height;
		this.r.width = width;
		this.r.breadth = breadth;
	}
	
	void getRoomVolume(){
		System.out.printf("Volume of room is: %.2f \n",this.r.volume());
	}
	
}
class Assign4{
	public static void main(String agrs[]){
		RoomDemo obj = new RoomDemo(10,10,10);
		obj.getRoomVolume();
	}
}