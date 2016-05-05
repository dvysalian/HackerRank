import java.util.ArrayList;
import java.util.Scanner;

public class ManasaAndStones
{
	static Scanner in = new Scanner(System.in);
	static ArrayList<Integer> possiblenums = new ArrayList<Integer>();
	public static void main(String[] args)
	{
		int t = in.nextInt();
		if(t>=1 && t<=100)
		{
			for(int i=0; i<t; i++)
			{
				possiblenums.removeAll(possiblenums);
				int n = in.nextInt();
				int a = in.nextInt();
				int b = in.nextInt();
				
				if(n>=1 && n<=1000 && a>=1 && a<=1000 && b>=1 && b<=1000)
				{
					int[] array = {a,b};
					ArrayList<Integer> combination = new ArrayList<Integer>();
					possiblecombinations(n-1,array,combination);
					
					for(int j : possiblenums)
						System.out.print(j+" ");
				}
			}
		}
	}
	public static void possiblecombinations(int length, int array[], ArrayList<Integer> curr)
	{
		if(curr.size()==length)
			possiblenumber(curr);
		else
		{
			for(int i = 0; i < array.length; i++) {
                ArrayList<Integer> oldCurr = new ArrayList<Integer>(curr);
                curr.add(array[i]);
                possiblecombinations(length,array,curr);
                curr = oldCurr;
            }
		}
	}
	public static void possiblenumber(ArrayList<Integer> combination)
	{
		
		Integer initial = 0;
		for(Integer i : combination)
			initial +=i;
		
		if(!possiblenums.contains(initial))
			possiblenums.add(initial);
	}
}
