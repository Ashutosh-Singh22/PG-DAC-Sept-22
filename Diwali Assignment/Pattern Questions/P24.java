class P24
{
	public static void main(String args[])
	{
        for(int i=1;i<=5;i++)
		{
			int a=0,b=4;
			for(int j=1;j<=i;j++)
			{
				int s=i+a;
				System.out.print(s);
				a=a+b;
				b--;
			}
			System.out.println();
		}
	}		
}
