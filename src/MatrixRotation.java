import java.util.ArrayList;
import java.util.Scanner;

public class MatrixRotation
{
	static Scanner in = new Scanner(System.in);
	public static void main(String[] args)
	{
		int m = in.nextInt();
		int n = in.nextInt();
		int r = in.nextInt();
		
		int matrix[][] = new int[m][n];
		
		for(int i=0; i<m; i++)
			for(int j=0; j<n; j++)
				matrix[i][j] = in.nextInt();
		
		int count = m<=n ? m:n;
		int row = m-1;
		int col = n-1;
		int outer = 0;
		//int inner = 1;
		
		while(count>=2)
		{
			ArrayList<Integer> al = new ArrayList<Integer>();
			//add numbers to the list
			//top
			for(int i=outer; i<=col; i++)
				al.add(matrix[outer][i]);
			//right
			for(int i=outer+1; i<=row; i++)
				al.add(matrix[i][col]);
			//bottom
			for(int i=col-1; i>=outer; i--)
				al.add(matrix[row][i]);
			//left
			for(int i=row-1; i>outer; i--)
				al.add(matrix[i][outer]);
			
			int size = al.size();
			
			//placing the new values in the matrix
			int j = 0;
			//top
			for(int i=outer; i<=col; i++)
			{
				matrix[outer][i] = al.get((j+r)%size);
				j++;
			}
			//right
			for(int i=outer+1; i<=row; i++)
			{
				matrix[i][col] = al.get((j+r)%size);
				j++;
			}
			//bottom
			for(int i=col-1; i>=outer; i--)
			{
				matrix[row][i] = al.get((j+r)%size);
				j++;
			}
			//left
			for(int i=row-1; i>outer; i--)
			{
				matrix[i][outer] = al.get((j+r)%size);
				j++;
			}
			
			//make changes in the number of rows and columns
			count = count - 2;
			row--;
			col--;
			outer++;
		}
		//printing
		for(int a=0; a<m; a++)
		{
			for(int b=0; b<n; b++)
				System.out.print(matrix[a][b]+" ");
			System.out.println();
		}
	}
}
