class Pattern7{
	public static void main(String args[]){
		//upper triangle
		for(int i=1; i<=5; i++){
			
			for(int k=5-1; k>=i; k--){
				
				System.out.print(" ");
			}
			
			for(int j=1; j<=i; j++){
			
				System.out.print("*");
			}
			
			for(int j=2; j<=i; j++){
			
				System.out.print("*");
			}
		
			System.out.println();
		}
		
		//lower triangle
		for(int i=5-1; i>=1; i--){
			
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