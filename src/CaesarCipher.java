import java.util.Scanner;

public class CaesarCipher
{
	static Scanner in = new Scanner(System.in);
	public static void main(String[] args)
	{
		int n = in.nextInt();
		if(n>=1 && n<=100)
		{
			String s = in.next();
			int k = in.nextInt();
			if(k>=0 && k<=100)
			{
				for(int i=0; i<s.length(); i++)
				{
					char temp = s.charAt(i);
					if(Character.isLetter(temp) && Character.isUpperCase(temp))
					{
						char new_char = Character.toUpperCase(encrypt(temp, k));
						System.out.print(new_char);
					}
					else if(Character.isLetter(temp) && Character.isLowerCase(temp))
					{
						char new_char = encrypt(temp, k);
						System.out.print(new_char);
					}
					else
						System.out.print(temp);
				}
			}
		}
	}
	public static char encrypt(char x, int key)
	{
		//array for alphabets
		char alp[]={'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};

		x = Character.toLowerCase(x);
		
		for(int j=0; j<alp.length; j++)
		{
			char y = alp[j];
			if(y == x)
			{
				int w = (j+key)%26;
				x = alp[w];
				return x;
			}
		}
		return x;
			
	}
}
