/*
Implement a class for DateDemo. Write member functions for (i) getting the previous day, (ii) getting the next
day, (iii) printing a day. There should be four constructors: (i) day, month and year are initialized to 01, 01, 1970; (ii)
day is initialized to user specified value but month and year are initialized to 01, 1970; (iii) day, month are
initialized to user specified value but year is initialized to 1970; (iv) day, month and year are initialized to user
defined values. Also, write a main() function to (i) create a date object; (ii) print the next and the previous day.
*/

class DateDemo{
	int day;
	int month;
	int year;
	
	DateDemo(){
		this.day=1;
		this.month=1;
		this.year=1970;
	}
	
	DateDemo(int day){
		this.day=day;
		this.month=1;
		this.year=1970;
	}
		
	DateDemo(int day, int month ){
		this.day=day;
		this.month=month;
		this.year=1970;
	}

	DateDemo(int day, int month, int year ){
		this.day=day;
		this.month=month;
		this.year=year;
	}
	
	void previousDay(){
		
		//int totalDaysInMonth = getTotalNumberofDaysInMonth(this.month);
		if(this.day==1){
			if(this.month==1)
				printDetails(31, 12, this.year-1);
			else
				printDetails(getTotalNumberofDaysInMonth(this.month-1), this.month-1, this.year);
		}
		else 
			printDetails(this.day-1, this.month, this.year);
	}
	
	void nextDay(){
		int totalDaysInMonth = getTotalNumberofDaysInMonth(this.month);
		if(this.day==totalDaysInMonth){
			if(this.month==12)
				printDetails(1,1,this.year+1);
			else
				printDetails(1, this.month+1, this.year);
		}
		else{
			printDetails(this.day+1, this.month, this.year);
		}
	}
	
	boolean isLeapYear(int year){
		
		if(year%400==0 || (year%4==0 && year%100!=0))
			return true;
		else 
			return false;
	}
	
	int getTotalNumberofDaysInMonth(int month){
		
		switch(month){
			case 1: return 31;
			case 2: 
				if(isLeapYear(this.year)){return 29;}
				else {return 28;}
			case 3: return 31;
			case 4: return 30;
			case 5: return 31;
			case 6: return 30;
			case 7: return 31;
			case 8: return 31;
			case 9: return 30;
			case 10: return 31;
			case 11: return 30; 
			case 12: return 31;
			default : return 0;
		}
	}
	
	void printDetails(int day, int month, int year){
		System.out.println("Day: "+day);
		System.out.println("Month: "+month);
		System.out.println("Year: "+year);
	}
}

class Assign2{
	public static void main(String args[]){
		
		DateDemo obj = new DateDemo(1,3,2020);
		obj.previousDay();
		obj.nextDay();
		
	}
}