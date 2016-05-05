import java.math.BigInteger;
import java.util.Scanner;

public class ExtraLongFactorials
{
	static Scanner in = new Scanner(System.in);
	public static void main(String[] args)
	{
		int n = in.nextInt();
		if(n>=1 && n<=100)
		{
			BigInteger fact = BigInteger.valueOf(1);
			while(n>0)
			{
				fact = fact.multiply(BigInteger.valueOf(n));
				n--;
			}
			System.out.println(fact);
		}
	}
}
