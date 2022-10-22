/*
Implement a class for a Person. Person has data members age, weight, height, dateOfBirth,
address with proper reader/write methods etc. Now create two subclasses Employee and Student.
Employee will have additional data member salary, dateOfJoining, experience etc. Student has data
members roll, listOfSubjects, their marks and methods calculateGrade. Again create two sub-classes
Technician and Professor from Employee. Professor has data members courses, listOfAdvisee and
their add/remove methods. Write a main() function to demonstrate the creation of objects of different
classes and their method calls.
*/
class Person{
	private int age;
	private double weight;
	private double height;
	private String DOB;
	private String address;
	
	Person(){
		
	}
	
	Person(int age, double weight, double height, String DOB, String address){
		this.age = age;
		this.weight = weight;
		this.height = height;
		this.DOB = DOB;
		this.address = address;
	}	
	
	public void setAge(int age){
		this.age = age;
	}
	
	public int getAge(){
		return this.age;
	}
	
	public void setWeight(double weight){
		this.weight = weight;
	}
	
	public double getWeight(){
		return this.weight;
	}
	
	public void setHeight(double height){
		this.height = height;
	}
	
	public double getHeight(){
		return this.height;
	}
	
	public void setDOB(String DOB){
		this.DOB = DOB;
	}
	
	public String getDOB(){
		return this.DOB;
	}
	
	public void setAddress(String address){
		this.address = address;
	}
	
	public String getAddress(){
		return this.address;
	}
}

class Student extends Person{
	private int roll;
	private String listOfSubjects[];
	private int marks[];
	
	Student(){
		
	}
	
	public void setRoll(int roll){
		this.roll = roll;
	}
		
	public int getRoll(){
		return this.roll;
	}
	
	public void setListOfSubjects(String listOfSubjects[]){
		this.listOfSubjects = listOfSubjects;
	}
	
	public String[] getListOfSubjects(){
		return this.listOfSubjects;
	}
	
	public void setMarks(int marks[]){
		this.marks = marks;
	}
	
	public int[] getMarks(){
		return this.marks;
	}
	
	public void calculateGrade(){
		
	}
}

class Employee extends Person{
	private double salary;
	private String dateOfJoining;
	private int experience;
	
	Employee(){
		
	}
	
	public void setSalary(double salary){
		this.salary = salary;
	}
	
	public double getSalary(){
		return this.salary;
	}
	
	public void setDateOfJoining(String dateOfJoining){
		this.dateOfJoining = dateOfJoining;
	}
	
	public String getDateOfJoining(){
		return this.dateOfJoining;
	}
	
	public void setExperience(int experience){
		this.experience = experience;
	}
	
	public int getExperience(){
		return this.experience;
	}
}

class Technician extends Employee{
	
	Technician(){
		
	}
}

class Professor extends Employee{
	private String courses[];
	private String listOfAdvisee[];
	
	Professor(){
		
	}
	
	public void setCourses(String courses[]){
		this.courses = courses;
	}
	
	public String[] getCourses(){
		return this.courses;
	}
	
	public void setListOfAdvisee(String listOfAdvisee[]){
		this.listOfAdvisee = listOfAdvisee;
	}
	
	public String[] getListOfAdvisee(){
		return this.listOfAdvisee;
	}
}

class Assign3{
	
	public static void main(String args[]){
		
		Person perObj = new Person();
		Student stuObj = new Student();
		Employee empObj = new Employee();
		Technician tecObj = new Technician();
		Professor proObj = new Professor();
		
	}
}