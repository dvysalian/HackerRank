import java.util.Scanner;

public class SherlockandSquares
{
	static Scanner in = new Scanner(System.in);
	public static void main(String[] args)
	{
		int t = in.nextInt();
		if(t>=1 && t<=100)
		{
			for(int i=0; i<t; i++)
			{
				int a = in.nextInt();
				int b = in.nextInt();
				int count = 0;
				if(a>=1 && a<=b && b<=1000000000)
				{
					for(int j=a; j<=b; j++)
					{
						int sqrt = (int)Math.sqrt(j);
						if(sqrt*sqrt == j)
						{
							count++;
							j = j + (sqrt*2) ;
						}
					}
					System.out.println(count);
				}
			}
		}
	}
}
