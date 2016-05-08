import java.util.Scanner;

public class Encryption
{
	static Scanner in = new Scanner(System.in);
	public static void main(String[] args)
	{
		String s = in.nextLine();
		int r = (int)Math.floor(Math.sqrt(s.length()));
		int c = (int)Math.ceil(Math.sqrt(s.length()));
		
		if((r*c)<s.length())
			r = r+1;
		
		char matrix[][] = new char[r][c];
		for(int i=0; i<r; i++)
			for(int j=0; j<c; j++)
				matrix[i][j] = '$';
		int k=0;
		
		if((r*c)>=s.length())
		{
			//inserting the value in the matrix
			for(int i=0; i<r; i++)
				for(int j=0; j<c; j++)
					if(k < s.length())
					{
						matrix[i][j] = s.charAt(k);
						k++;
					}
			
			//print the value
			for(int i=0; i<c; i++)
			{
				for(int j=0; j<r; j++)
					if(matrix[j][i]!='$')
						System.out.print(matrix[j][i]);
				System.out.print(" ");
			}
		}
	}
}
