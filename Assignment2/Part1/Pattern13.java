class Pattern13{
	public static void main(String args[]){
		char ch = 'A';
		for(int i=1; i<=5; i++){
		
			for(int k=5-1; k>=i; k--){
				System.out.print(" ");
			}
			
			for(int j=1; j<=i; j++){
				System.out.print(ch+" ");
			}
			
			System.out.println();
			ch++;
		}
	}
}