import java.util.Scanner;

public class ACM_ICPC_Team
{
	static Scanner in = new Scanner(System.in);
	public static void main(String[] args)
	{
		int n = in.nextInt();
		int m = in.nextInt();
		
		if(n>=2 && n<=500 && m>=1 && m<=500)
		{
			int matrix[][] = new int[n][m];
			for(int i=0; i<n; i++)
			{
				char temp[] = in.next().toCharArray();
				for(int j=0; j<m; j++)
					matrix[i][j] = Integer.parseInt(String.valueOf(temp[j]));
			}
			
			int teamCount = 0;
			int topicCount = 0;
			
			int k = 0;
			while(k<n-1)
			{
				for(int i=k+1; i<n; i++)
				{
					int count = 0;
					for(int j=0; j<m; j++)
						if(matrix[k][j]==1 || matrix[i][j]==1)
							count++;
					
					if(count>topicCount)
					{
						topicCount = count;
						teamCount = 1;
					}
					else if(count == topicCount)
						teamCount++;
				}
				k++;
			}
			System.out.println(topicCount);
			System.out.println(teamCount);
		}
	}
}
