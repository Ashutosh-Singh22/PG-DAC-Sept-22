class P2
{
	public static void main(String args[])
	{
      for(int i=5;i>=1;i--)
	  { 
		for(int k=i;k<5;k++)
		{
			System.out.print(" ");  
		}
		  for(int j=1;j<=i;j++)
		  {
			  if(j==1 && i!=5|| j==i )
			System.out.print("* ");
		else if(i==5)
		{
			System.out.print("**");
		}
           else			   
		   System.out.print("  "); 
		  }
		  System.out.println();
			
	  }	  
	}		
}
