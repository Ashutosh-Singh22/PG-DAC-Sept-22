class Pattern6{
	public static void main(String args[]){
		
		for(int i=5; i>=1; i--){
			
			for(int k=i; k<=5-1; k++){ //space
				
				System.out.print(" ");
			}
			
			for(int j=i; j>=1; j--){ // left side triangle
			
				System.out.print("*");
			}
			
			for(int j=i-1; j>=1; j--){ //right side triangle
				
				System.out.print("*");
			}
			
			System.out.println();
		}
	}
}