import java.util.Scanner;

public class LisaWorkbook
{
	static Scanner in = new Scanner(System.in);
	public static void main(String[] args)
	{
		int n = in.nextInt();
		int k = in.nextInt();
		
		if(n>=1 && n<=100 && k>=1 && k<=100)
		{
			int prob[] = new int[n];
			for(int i=0; i<n; i++)
				prob[i] = in.nextInt();
			
			int page_no = 0;
			int j = 1;
			int count = 0;
			outer:for(int i=0; i<n; i++)
			{
				int problems = prob[i];
				int prob_left = problems;
				j = 1;
				while(prob_left > 0)
				{
					page_no++;
					for(int m=0; m<k; m++)
					{
						if(prob_left != 0)
						{
							//check for same page no and prob no
							if(j == page_no)
								count++;
							j++;
							prob_left = prob_left - 1;
						}
						else
							continue outer;
					}
				}
			}
			
			System.out.println(count);
		}
	}
}
