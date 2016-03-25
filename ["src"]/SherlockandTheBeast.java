import java.util.Scanner;
public class SherlockandTheBeast
{
	static Scanner in = new Scanner(System.in);
	
	public static void main(String[] args)
	{
		int y = in.nextInt();
		int z = y;
		StringBuilder s = new StringBuilder();
		while(z%3 != 0)
			z = z - 5;
		if(z<0)
			System.out.println("-1");
		else
		{
			for(int i=0; i<z; i++)
				s.append("5");
			for(int i=0; i<(y-z); i++)
				s.append("3");
			
			System.out.println(s);
		}
	}
}
