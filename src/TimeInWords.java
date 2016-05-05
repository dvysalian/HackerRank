import java.util.Scanner;

public class TimeInWords
{
	static Scanner in = new Scanner(System.in);
	public static void main(String[] args)
	{
		int h = in.nextInt();
		int m = in.nextInt();
		if(h>=1 && h<12 && m>=0 && m<60)
		{
			String num[] = {"","one","two","three","four","five","six","seven","eight","nine","ten","eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen","twenty","twenty one","twenty two","twenty three","twenty four","twenty five","twenty six","twenty seven","twenty eight","twenty nine"};
			
			if(m == 0)
				System.out.println(num[h]+" o' clock");
			else if(m>0 && m<15)
			{
				if(m == 1)
					System.out.println("one minute past "+num[h]);
				else
					System.out.println(num[m]+" minutes past "+num[h]);
			}
			else if(m == 15)
				System.out.println("quarter past "+num[h]);
			else if(m>15 && m<30)
				System.out.println(num[m]+" minutes past "+num[h]);
			else if(m == 30)
				System.out.println("half past "+num[h]);
			else if(m>30 && m<45)
				System.out.println(num[60-m]+" minutes to "+num[h+1]);
			else if(m == 45)
				System.out.println("quarter to "+num[h+1]);
			else if(m>45 && m<60)
				System.out.println(num[60-m]+" minutes to "+num[h+1]);
		}
	}
}
