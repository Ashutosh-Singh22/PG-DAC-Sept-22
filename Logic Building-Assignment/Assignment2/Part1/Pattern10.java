class Pattern10{
	public static void main(String args[]){
		char ch = 64;
		//ch = ch + 5;
		for(int i=5; i>=1; i--){
			ch += i;
			for(int j=i; j>=1; j--){
				System.out.print(" ");
			}
			
			for(int j=i; j<=5; j++){
				System.out.print(ch+" ");
				ch++;
			}

			System.out.println();
			ch = 65;
		}
	}
}