class Pattern4{
	public static void main(String args[]){
	
		for(int i=1; i<=9; i++){
			
			for(int k=9-1; k>=i; k--){  //spaces
				
				System.out.print("  ");
			}
			
			for(int j=1; j<=i; j++){ // left side triangle
				
				System.out.print(j+" ");
			}
			
			for(int j=i-1; j>=1; j--){  // right side triangle
				
				System.out.print(j+" ");
			}
			
			System.out.println();
		}
	
	}
}