class P13
{
	public static void main(String args[])
	{
		char c='A';
      for(int i=1;i<=6;i++)
	  { 
		for(int k=i;k<6;k++)
		{
			System.out.print(" ");  
		}
		  for(int j=1;j<=i;j++)
		  {
			  if(j==1 || j==i)
			System.out.print(" "+c);
           else			   
		System.out.print("  "); 
			
		  }
		  c++;
		  System.out.println();
	  }
	  c--;
      for(int i=5;i>0;i--)
	  { 
        c--; 
		for(int k=i;k<6;k++)
		{
			System.out.print(" ");  
		}
		  for(int j=1;j<=i;j++)
		  {
			  if(j==1 || j==i)
			System.out.print(" "+c);
           else			   
		System.out.print("  "); 
			
		  }
		  
		  System.out.println();
	  } 	  
	}		
}
