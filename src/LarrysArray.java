import java.util.Arrays;
import java.util.Scanner;

public class LarrysArray
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
			
			int k = 0;
			int l = n;
			
			while(l>0)
			{
				k = 0;
				while(k<l-2)
				{
					int temp[] = {array[k],array[k+1],array[k+2]};
					boolean f = canbeSorted(temp);
					
					if(f == false)
					{
						//find the largest element and try to keep it last
						//finding the largest
						int largest = temp[0];
						int index = 0;
						for(int j=0; j<temp.length; j++)
							if(temp[j] > largest)
							{
								index = j;
								largest = temp[j];
							}
						//if index is 2 - do nothing
						//if index is 1 bring it to last
						if(index == 1)
						{
							array[k] = temp[2];
							array[k+1] = temp[0];
							array[k+2] = temp[1];
						}
						else if(index == 0)
						{
							array[k] = temp[1];
							array[k+1] = temp[2];
							array[k+2] = temp[0];
						}
					}
					else
					{
						//change the array accordingly
						Arrays.sort(temp);
						array[k] = temp[0];
						array[k+1] = temp[1];
						array[k+2] = temp[2];
					}
					
					k++;
				}
				
				//last number in the array will be sorted so we wont consider it
				l = l-1;
			}
			
			//check if the array is sorted
			for(int j=0; j<n-1; j++)
				if(array[j]>array[j+1])
				{
					System.out.println("NO");
					continue outer;
				}
			System.out.println("YES");
		}
	}
	public static boolean canbeSorted(int x[])
	{
	    int size = x.length;
	    int count = 0;

	    for(int i=0; i<size; i++)
	        if(x[i] > x[(i+1)%size])
	            count ++;
	    return (count <= 1);
	}
}
