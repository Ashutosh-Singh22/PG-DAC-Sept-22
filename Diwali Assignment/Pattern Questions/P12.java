class P12
{
	public static void main(String args[])
	{
		char c;
      for(int i=1;i<=6;i++)
	  { 
              c='A';
		for(int k=i;k<6;k++)
		{
			System.out.print(" ");  
		}
		  for(int j=1;j<=i;j++)
		  {
			System.out.print(c+" ");  
			c++;
		  }
		  System.out.println();
	  } 	  
	}		
}
