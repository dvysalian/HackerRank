import java.util.Scanner;
public class NewYearChaos
{
	static Scanner in = new Scanner(System.in);
	public static void main(String[] args)
	{
		int t = in.nextInt();
		outer:for(int i=0; i<t; i++)
		{
			int n = in.nextInt();
			int array[] = new int[n];
			for(int j=0; j<n; j++)
				array[j] = in.nextInt();
			
			for(int j=0; j<n; j++)
				if((array[j]-(j+1))>2)
				{
					System.out.println("Too chaotic");
					continue outer;
				}
			
			int count = 0;
			int k, value;
			for(int j=1; j<n; j++)
			{
				value = array[j];
				k = j;
				int c = 0;
				while(k>0 && array[k-1]>value)
				{
					array[k] = array[k-1];
					k--;
					c++;
				}
				array[k] = value;
				
				count = count + c;
			}
			System.out.println(count);
		}
	}
}
