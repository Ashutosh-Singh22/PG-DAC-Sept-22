class Pattern5{
	public static void main(String args[]){
	
		for(int i=9; i>=1; i--){
			
			for(int k=i-1; k>=1; k--){  //spaces
				
				System.out.print("  ");
			}
			
			for(int j=i; j<=9; j++){ // left side triangle
				
				System.out.print(j+" ");
			}
			
			for(int j=8; j>=i; j--){  // right side triangle
				
				System.out.print(j+" ");
			}
			
			System.out.println();
		}
	
	}
}