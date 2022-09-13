class Pattern6{
	public static void main(String args[]){
		
		for(int i=9; i>=1; i--){
			
			for(int k=9-i; k>=1; k--){
				
				System.out.print(" ");
			}
			
			for(int j=i; j>=1; j--){ //triangle
			
				System.out.print("* ");
			}
			
			System.out.println();
		}
	}
}