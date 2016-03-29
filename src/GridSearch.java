import java.util.Scanner;

public class GridSearch
{
	static Scanner in = new Scanner(System.in);
	public static void main(String[] args)
	{
		int t = in.nextInt();
		outer:for(int i=0; i<t; i++)
		{
			//take the bigger matrix as input
			int R = in.nextInt();
			int C = in.nextInt();
			
			int bigger_matrix[][] = new int [R][C];
			
			for(int m=0; m<R; m++)
			{
				String temp = in.next();
				for(int n=0; n<C; n++)
				{
					String temp_char = String.valueOf(temp.charAt(n));
					bigger_matrix[m][n] = Integer.parseInt(temp_char);
				}
			}
			
			//take the smaller matrix as input
			int r = in.nextInt();
			int c = in.nextInt();
			
			int smaller_matrix[][] = new int[r][c];
			
			for(int m=0; m<r; m++)
			{
				String temp = in.next();
				for(int n=0; n<c; n++)
				{
					String temp_char = String.valueOf(temp.charAt(n));
					smaller_matrix[m][n] = Integer.parseInt(temp_char);
				}
			}
			
			//check if the smaller matrix is present in larger one
			for(int m=0; m<(R-r+1); m++)
				inner:for(int n=0; n<(C-c+1); n++)
					if(bigger_matrix[m][n] == smaller_matrix[0][0])
					{
						String s = find_matrix(m, n, bigger_matrix, smaller_matrix);
						if(s.equals("NO"))
							continue inner;
						else if(s.equals("YES"))
						{
							System.out.println(s);
							continue outer;
						}
					}
			System.out.println("NO");
		}
	}
	 
	
	public static String find_matrix(int m, int n, int a[][], int b[][])
	{
		for(int i=m, k=0; k<b.length; i++,k++)
			for(int j=n,l=0; l<b[0].length; j++,l++)
				if(a[i][j] != b[k][l])
					return "NO";
		return "YES";
	}
}
