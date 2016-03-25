import java.util.Scanner;

public class UtopianTree
{
	static Scanner in = new Scanner(System.in);
	public static void main(String[] args)
	{
		int t = in.nextInt();
		if(t>=1 && t<=10)
		{
			loop:for(int i=0; i<t; i++)
			{
				int n = in.nextInt();
				int height = 1;
				int j = 0;
				if(n>=0 && n<=60)
				{
					do
					{
						if(n==0)
						{
							System.out.println(height);
							continue loop;
						}
						else
						{
							if(j%2==0)
								height = height*2;
							else
								height = height+1;
						}
						j++;
					}
					while(j<n);
					
					System.out.println(height);
				}
			}
		}
	}
}
