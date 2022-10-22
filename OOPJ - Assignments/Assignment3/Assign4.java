/*
Create a base class Automobile. An Automobile contains data members make, type, maxSpeed,
price, mileage, registrationNumber etc. with their reader/writer methods. Now create two sub-classes
Track and Car. Track has data members capacity, hoodType, noOfWheels etc. Car has data
members noOfDoors, seatingCapacity and their reader/writer methods. Create a main() function to
demonstrate this.
*/

class AutoMobile{
	private String make;
	private String type;
	private int maxSpeed;
	private double price;
	private int mileage;
	private int registrationNumber;
	
	//make
	public void setMake(String make){
		this.make = make;
	}
	public String getMake(){
		return this.make;
	}
	//type
	public void setType(String type){
		this.type = type;
	}
	public String getType(){
		return this.type;
	}
	//maxSpeed
	public void setMaxSpeed(int maxSpeed){
		this.maxSpeed = maxSpeed;
	}
	public int getMaxSpeed(){
		return this.maxSpeed;
	}
	//price
	public void setPrice(double price){
		this.price = price;
	}
	public double getPrice(){
		return this.price;
	}
	//mileage
	public void setMileage(int mileage){
		this.mileage = mileage;
	}
	public int getMileage(){
		return this.mileage;
	}
	//registrationNumber
	public void setRegistrationNumber(int registrationNumber){
		this.registrationNumber = registrationNumber;
	}
	public int getRegistrationNumber(){
		return this.registrationNumber;
	}
}

class Track extends AutoMobile{
	private int capacity;
	private String hoodType;
	private int noOfWheels;
	
	//capacity
	public void setCapacity(int capacity){
		this.capacity = capacity;
	}
	public int getCapacity(){
		return this.capacity;
	}
	//hoodType
	public void setHoodType(String hoodType){
		this.hoodType = hoodType;
	}
	public String getHoodType(){
		return hoodType;
	}
	//noOfWheels
	public void setNoOfWheels(int noOfWheels){
		this.noOfWheels = noOfWheels;
	}
	public int getNoOfWheels(){
		return this.noOfWheels;
	}
	
}

class Car extends AutoMobile{
	
	private int noOfDoors;
	private int seatingCapacity;
	
	//noOfDoors
	public void setNoOfDoors(int noOfDoors){
		this.noOfDoors = noOfDoors;
	}
	public int getNoOfDoors(){
		return this.noOfDoors;
	}
	
	//seatingCapacity
	public void setSeatingCapacity(int seatingCapacity){
		this.seatingCapacity = seatingCapacity;
	}
	public int getSeatingCapacity(){
		return this.seatingCapacity;
	}
}

class Assign4{
	public static void main(String args[]){
		AutoMobile amObj1 = new AutoMobile();
		Track tObj = new Track();
		Car cObj = new Car();
	}
}