class P11
{
	public static void main(String args[])
	{
		char c;
      for(int i=1;i<=6;i++)
	  { 
              c='A';
		  for(int j=i;j<=6;j++)
		  {
			System.out.print(c);  
			c++;
		  }
		  System.out.println();
	  }
      for(int i=1;i<=6;i++)
	  { 
              c='A';
		  for(int j=1;j<=i;j++)
		  {
			System.out.print(c);  
			c++;
		  }
		  System.out.println();
	  } 	  
	}		
}
