class Pattern9{
	public static void main(String args[]){
		char ch = 'A';
		for(int i=5; i>=1; i--){
			
			for(int j=i; j>=1; j--){
				System.out.print(" ");
			}
			
			for(int j=i; j<=5; j++){
				System.out.print(ch+" ");
				ch++;
			}

			System.out.println();
			ch = 'A';
		}
	}
}