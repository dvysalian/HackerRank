import java.util.Scanner;

public class CavityMap
{
	static Scanner in = new Scanner(System.in);
	public static void main(String[] args)
	{
		int n = in.nextInt();
		if(n>=1 && n<=100)
		{
			int matrix[][] = new int[n][n];
			
			//taking the matrix as input
			for(int i=0; i<n; i++)
			{
				String temp = in.next();
				for(int j=0; j<n; j++)
				{
					String temp_char = String.valueOf(temp.charAt(j));
					matrix[i][j] = Integer.parseInt(temp_char);
				}
			}
			
			for(int j=0; j<n; j++)
				System.out.print(matrix[0][j]);
			System.out.println();
			
			if(n>1)
			{
				//checking the cavity conditions
				for(int i=1; i<n-1; i++)
				{
					System.out.print(matrix[i][0]);
					for(int j=1; j<n-1; j++)
					{
						int x = matrix[i][j];
						if(x>matrix[i-1][j] && x>matrix[i][j-1] && x>matrix[i][j+1] && x>matrix[i+1][j])
							System.out.print("X");
						else
							System.out.print(x);
					}
					System.out.print(matrix[i][n-1]);
					System.out.println();
				}
			
				for(int j=0; j<n; j++)
					System.out.print(matrix[n-1][j]);
				System.out.println();
			}
		}
	}
}
