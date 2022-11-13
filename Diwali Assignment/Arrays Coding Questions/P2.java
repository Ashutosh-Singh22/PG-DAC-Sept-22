/*
Write a Java program to check the equality of two arrays
*/
class P2{
	
	static boolean compArray(int a[], int b[]){
		
		boolean flag = false;
		if(a.length == b.length){
			
			int count = 0;
			
			for(int i=0; i<a.length; i++){
				if(a[i]==b[i])
					count++;
			}
			
			if(count==a.length)
				flag = true;
		}
		
		return flag;	
	}
	
	public static void main(String args[]){
		
		int a[] = {1,2,3,4,5};
		int b[] = {1,2,3,4};
		int c[] = {1,2,3,4,5};
		int d[] = {5,4,3,2,1};
		
		System.out.println("Comparing a[] with b[]: "+compArray(a,b));
		System.out.println("Comparing b[] with c[]: "+compArray(b,c));
		System.out.println("Comparing a[] with c[]: "+compArray(a,c));
		System.out.println("Comparing c[] with d[]: "+compArray(c,d));
	}
}