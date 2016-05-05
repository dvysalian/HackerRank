import java.util.Scanner;

public class FindDigits
{
	static Scanner in = new Scanner(System.in);
	
	public static void main(String[] args)
	{
		int t = in.nextInt();
		if(t>=1 && t<=15)
		{
			for(int i=0; i<t; i++)
			{
				int n = in.nextInt();
				if(n>0 && n<1000000000)
				{
					String s = String.valueOf(n);
					int count = 0;
					for(int j=0; j<s.length(); j++)
					{
						int x = Character.getNumericValue(s.charAt(j));
						if(x!=0 && n%x == 0)
							count++;
					}
					System.out.println(count);
				}
			}
		}
	}
}
