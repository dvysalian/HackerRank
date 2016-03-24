import java.util.Scanner;

public class AngryProfessor
{
	static Scanner in = new Scanner(System.in);
	public static void main(String[] args)
	{
		int t = in.nextInt();
		//check the boundary conditions for t
		if(t >= 1 && t <= 10)
		{
			for(int i=0; i<t; i++)
			{
				int n = in.nextInt();
				int k = in.nextInt();
				
				//check boundary conditions for n and k
				if(n>=1 && n<=1000 && k>=1 && k<=n)
				{
					int count = 0;
					int a;
					for(int j=0; j<n; j++)
					{
						a = in.nextInt();
						if(a>=-100 && a<=100)
							if(a<=0)
								count++;
					}
					if(count>=k)
						System.out.println("NO");
					else
						System.out.println("YES");
				}
			}
		}
	}
}
