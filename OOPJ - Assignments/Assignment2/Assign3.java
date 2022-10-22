/*
Write a class to represent complex numbers with necessary constructors. Write member functions to add, multiply
two complex numbers. There should be three constructors: (i) to initialize real and imaginary parts to 0; (ii) to
initialize imaginary part to 0 but to initialize the real part to user defined value; (iii) to initialize the real part and the
imaginary part to user defined values. Also, write a main() function to (i) create two complex numbers 
3+2i and 4-2i; (ii) to print the sum and product of those numbers.
*/
//sum -> a+c + i(b+d)
//multiply -> (ac-bd) + i(ad+bc)

class Complex{
	int real;
	int imag;
	
	Complex(){
		this.real = 0;
		this.imag = 0;
	}
	
	Complex(int real){
		this.real = real;
		this.imag = 0;
	}
	
	Complex(int real, int imag){
		this.real = real;
		this.imag = imag;
	}
	
	Complex complexSum( Complex obj ){	// obj1.complexSum(obj2)
		Complex temp = new Complex();
		
		temp.real = this.real + obj.real;	
		temp.imag = this.imag + obj.imag;
		
		return temp;
	}
	
	Complex complexMultiply(Complex obj){
		Complex temp = new Complex();
		
		temp.real = (this.real*obj.real) - (this.imag*obj.imag);
		temp.imag = (this.real*obj.imag) + (this.imag*obj.real);
		
		return temp;
	}
	
	void printDetails(){
		if (this.imag > 0)
			System.out.println(this.real+"+i"+this.imag);
		else
			System.out.println(this.real+"-i"+this.imag);
	}
	
}

class Assign3{
	public static void main(String args[]){
		
		Complex obj1 = new Complex(3,2);
		Complex obj2 = new Complex(4,-2);
		
		Complex obj3 = obj1.complexSum(obj2);		// =temp;
		obj3.printDetails();
		
		Complex obj4 = obj1.complexMultiply(obj2);
		obj4.printDetails();
		
	}
}