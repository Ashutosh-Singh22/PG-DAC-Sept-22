class Pattern11{
	public static void main(String args[]){
		
		for(int i=1; i<=5; i++){
			
			for(int k=5-1; k>=i; k--){  //spaces
				
				System.out.print(" ");
			}
			
			for(int j=1; j<=i; j++){  //left side triangle
				
				System.out.print("*");
			}
			
			for(int j=2; j<=i; j++){  //right side triangle
				
				System.out.print("*");
			}
			
			System.out.println();
		}
	
	}
}