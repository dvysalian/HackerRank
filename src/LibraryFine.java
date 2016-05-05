import java.util.Scanner;

public class LibraryFine
{
	static Scanner in = new Scanner(System.in);
	public static void main(String[] args)
	{
		int day = in.nextInt();
		int month = in.nextInt();
		int year = in.nextInt();
		
		int expected_day = in.nextInt();
		int expected_month = in.nextInt();
		int expected_year = in.nextInt();
		
		if(day>=1 && day<=31 && month>=1 && month<=12 && year>=1 && year<=3000 && expected_day>=1 && expected_day<=31 && expected_month>=1 && expected_month<=12 && expected_year>=1 && expected_year<=3000)
		{
			//case 1 --- returned on or before the due date
			if(year<expected_year ||(year==expected_year && (month<expected_month || (month==expected_month && (day<expected_day || day==expected_day)))))
				System.out.println("0");
			//case 2 --- returned after the expected calendar year
			else if(year>expected_year)
				System.out.println("10000");
			//case 3 --- returned after the expected month but the same calendar year
			else if(year==expected_year && month>expected_month)
				System.out.println(500*(month-expected_month));
			//case 4 --- return after that expected day but same month and calendar year
			else if(year==expected_year && month==expected_month && day>expected_day)
				System.out.println(15*(day-expected_day));
		}
	}
}
