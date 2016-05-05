import java.math.BigInteger;
import java.util.Scanner;

public class TaunAndBday
{
	static Scanner in = new Scanner(System.in);
	public static void main(String[] args)
	{
		int t = in.nextInt();
		if(t>=1 && t<=10)
		{
			for(int i=0; i<t; i++)
			{
				int b = in.nextInt();
				int w = in.nextInt();
				int x = in.nextInt();
				int y = in.nextInt();
				int z = in.nextInt();
				
				BigInteger total;
				if((y+z)<=x)
				{
					BigInteger temp1 = BigInteger.valueOf(w).multiply(BigInteger.valueOf(y));
					BigInteger temp2 = BigInteger.valueOf(b).multiply(BigInteger.valueOf(y+z));
					total = temp1.add(temp2);
				}
				else if((x+z)<=y)
				{
					BigInteger temp1 = BigInteger.valueOf(b).multiply(BigInteger.valueOf(x));
					BigInteger temp2 = BigInteger.valueOf(w).multiply(BigInteger.valueOf(x+z));
					total = temp1.add(temp2);
				}
				else
				{
					BigInteger temp1 = BigInteger.valueOf(b).multiply(BigInteger.valueOf(x));
					BigInteger temp2 = BigInteger.valueOf(w).multiply(BigInteger.valueOf(y));
					total = temp1.add(temp2);
				}

				System.out.println(total);
			}
		}
	}
}
