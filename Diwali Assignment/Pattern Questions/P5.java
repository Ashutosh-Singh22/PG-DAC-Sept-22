class P5
{
	public static void main(String args[])
	{
		for(int i=1;i<5;i++)
		{
			for(int k=4-i;k>0;k--)
			{
				System.out.print(" ");
			}
			for(int j=i;j>0;j--)
			{
				System.out.print(j);
			}
			if(i!=1)
			{
			for(int j=2;j<=i;j++)
			{
				System.out.print(j);
			}
			
			}
			System.out.println();
				
		}
		for(int i=3;i>=1;i--)
		{
			for(int k=i;k<=3;k++)
			{
				System.out.print(" ");
			}
			for(int j=i;j>0;j--)
			{
				System.out.print(j);
			}
			
			for(int j=2;j<=i;j++)
			{
				System.out.print(j);
			}
			System.out.println();
				
		}
	}		
}