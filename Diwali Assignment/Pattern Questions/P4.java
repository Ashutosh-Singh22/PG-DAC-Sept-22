class P4
{
	public static void main(String args[])
	{
		int a[][]=new int[5][5];
		
       for(int i=0;i<5;i++)
		{
			 for(int k=4-i;k>0;k--)
			{
				System.out.print(" ");
			}
			for(int j=0;j<=i;j++)
			{
				if(j==0 || i==j)
				a[i][j]=1;
				else
				a[i][j]=a[i-1][j-1]+a[i-1][j];
				System.out.print(" "+a[i][j]);	
								
			}
				System.out.println();	
		}
	}
}