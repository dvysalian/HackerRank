import java.math.BigInteger;
import java.util.Scanner;

public class ModifiedKaprekarNumbers
{
	static Scanner in = new Scanner(System.in);
	public static void main(String[] args)
	{
		int p = in.nextInt();
		int q = in.nextInt();
		
		if(p>0 && p<q && q<100000)
		{
			boolean flag = true;
			for(int i=p; i<=q; i++)
			{
				int length = String.valueOf(i).length();
				BigInteger square = BigInteger.valueOf(i).multiply(BigInteger.valueOf(i));
				int digit = (int)Math.pow(10, length);
				
				
				BigInteger r = square.mod(BigInteger.valueOf(digit));
				BigInteger l = (square.subtract(r)).divide(BigInteger.valueOf(digit));
				
				if((r.add(l)).compareTo(BigInteger.valueOf(i)) == 0)
				{
					System.out.print(i+" ");
					flag = false;
				}
			}
			if(flag == true)
				System.out.println("INVALID RANGE");
		}
	}
}
