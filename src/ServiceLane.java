import java.util.Scanner;

public class ServiceLane
{
	static Scanner in = new Scanner(System.in);
	public static void main(String[] args)
	{
		int n = in.nextInt();
		int t = in.nextInt();
		
		if(n>=2 && n<=100000 && t>=1 && t<=1000)
		{
			int array[] = new int[n];
			for(int k=0; k<n; k++)
				array[k] = in.nextInt();
			
			for(int l=0; l<t; l++)
			{
				int i = in.nextInt();
				int j = in.nextInt();
				
				int x = Math.min(n,1000);
				int y = j-i+1;
				if(i>=0 && i<j && j<n && y>=2 && y<=x)
				{
					int min = array[i];
					//traverse the array from i to j
					for(int k=i; k<=j; k++)
						min = Math.min(min, array[k]);
					
					System.out.println(min);
				}
			}
		}
	}
}
