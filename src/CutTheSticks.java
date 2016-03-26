import java.util.Scanner;

public class CutTheSticks
{
	static Scanner in = new Scanner(System.in);
	public static void main(String[] args)
	{
		int n = in.nextInt();
		if(n>=1 && n<=1000)
		{
			int a[] = new int[n];
			for(int i=0; i<n; i++)
				a[i] = in.nextInt();
			
			int count = n;
			System.out.println(count);
			
			while(count>0)
			{
				int min = 1001;
				for(int i=0; i<n; i++)
					if(a[i]>0)
						min = Math.min(min, a[i]);
				
				count = 0;
				for(int i=0; i<n; i++)
				{
					a[i] = a[i] - min;
					if(a[i]>0)
						count++;
				}
				if(count>0)
					System.out.println(count);
			}
		}
	}
}
