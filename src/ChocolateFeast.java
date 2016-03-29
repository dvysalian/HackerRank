import java.util.Scanner;

public class ChocolateFeast
{
	static Scanner in = new Scanner(System.in);
	public static void main(String[] args)
	{
		int t = in.nextInt();
		if(t>=1 && t<=1000)
		{
			for(int i=0; i<t; i++)
			{
				int n = in.nextInt();
				int c = in.nextInt();
				int m = in.nextInt();
				
				if(n>=2 && n<=100000 && c>=1 && c<=n && m>=2 && m<=n)
				{
					int chocolate_count = (int)n/c;
					System.out.println("chocolate brought initially is "+chocolate_count);
					
					int no_of_wrapper = chocolate_count;
					System.out.println("no of wrapper is "+no_of_wrapper);
					
					int wrapper_remaining = no_of_wrapper;
					System.out.println("initial wrapper remaining is "+wrapper_remaining);
					
					while(wrapper_remaining >= m)
					{
						System.out.println("---------------------");
						int no_of_free_chocolate_possible = (int)wrapper_remaining/m;
						System.out.println("no of free chocolate possible is "+no_of_free_chocolate_possible);
						
						//update wrapper remaining
						wrapper_remaining = (wrapper_remaining - (no_of_free_chocolate_possible * m))+no_of_free_chocolate_possible;
						System.out.println("updated wrapper remaining "+wrapper_remaining);
						
						//update chocolate count
						chocolate_count = chocolate_count + no_of_free_chocolate_possible;
						System.out.println("Updated chocolate count "+chocolate_count);
					}
				}
			}
		}
	}
}
