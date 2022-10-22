/*
Write a program to implement a class student with the following members. Name of the student. Marks of the
student obtained in three subjects. Function to assign initial values. Function to compute total average. Function to
display the student's name and the total marks. Write an appropriate main() function to demonstrate the functioning
of the above.
*/

class Student{
	String nameOfStudent;
	int marksOfStudent[];
	
	Student(){
		marksOfStudent = new int[3];
		nameOfStudent = null;
		for(int i=0; i<this.marksOfStudent.length; i++){
			this.marksOfStudent[i] = 0;
		}
	}
	
	Student(String name, int arr[] ){
		marksOfStudent = new int[3];
		nameOfStudent = name;
		for(int i=0; i<this.marksOfStudent.length; i++){
			this.marksOfStudent[i] = arr[i];
		}
	}
	
	void computeAvg(){
		int sum=0;
		for(int i=0; i<this.marksOfStudent.length; i++){
			sum += this.marksOfStudent[i];
		}
		System.out.printf("Average marks of student %s is: %.2f \n",this.nameOfStudent,(1.0*sum/this.marksOfStudent.length));
	}
	
	void printDetails(){
		int sum=0;
		for(int i=0; i<this.marksOfStudent.length; i++){
			sum += this.marksOfStudent[i];
		}
		System.out.printf("Name of the student: is %s. \nTotal marks are: %d. \n",this.nameOfStudent,sum);
	}
}

class Assign5{
	public static void main(String args[]){
		Student obj = new Student("Ashutosh",new int[]{55,40,60});
		obj.computeAvg();
		obj.printDetails();
	}
}