/*
Write a program which generates the series 1,4,27,16,125,36
*/

class P9{
	
	static void printSeries(int count){
		
		for(int i=1; i<=count; i++){
			
			if(i%2==0)
				System.out.print(i*i+" ");
			else
				System.out.print(i*i*i+" ");
		}	
	}
	
	public static void main(String args[]){
		
		int count = 6;
		
		printSeries(count);
	}
}