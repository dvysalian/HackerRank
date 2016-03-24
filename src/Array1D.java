import java.util.Scanner;

public class Array1D
{
	static Scanner in = new Scanner(System.in);
	public static void main(String[] args)
	{
		int t = in.nextInt();
		
		//checking for border conditions for T
		if(t>=1 && t<=5000)
		{
			//for every T
			for(int i=0; i<t; i++)
			{
				int n = Integer.parseInt(in.next());
				int m = Integer.parseInt(in.next());
				
				//checking for border conditions for n and m
				if(n>=2 && n<=100 && m>=0 && m<=100)
				{
					//System.out.println(n+" "+m);
					
					//making the array of size x1
					int array[] = new int[n];
					for(int j=0; j<n; j++)
						array[j] = Integer.parseInt(in.next());
					
					//printing
					//for(int j=0; j<n; j++)
						//System.out.print(array[j]+" ");
					
					//checking for 0
					int x = 0;
					boolean flag = false;
					boolean tag = false;
					while(x < n)
					{
						//check for x+m
						int num = x+m;
						System.out.println("checking for position = "+num);
						if(num < n)
						{
							System.out.println("num="+num+" is less than n="+n);
							int y = array[num];
							System.out.println("y="+y);
							if(y == 0)
							{
								System.out.println("y is zero");
								x = num;
								System.out.println("x = "+x);
								continue;
							}
							else
							{
								System.out.println("y is not zero, checking for position x+1");
								//check for x+1
								num = x+1;
								System.out.println("checking for position = "+num);
								
								if(num < n)
								{
									System.out.println("num="+num+" is less than n="+n);
									y = array[num];
									System.out.println("y="+y);
									if(y == 0 && tag == false)
									{
										System.out.println("y is zero");
										x = num;
										System.out.println("x = "+x);
										
										//make the flag true to indicate we just jumped one step
										flag = true;
										tag = false;
										continue;
									}
									else
									{
										System.out.println("y is not zero, checking for position x-1");
										//check for x-1
										if(x!=0 && flag == false)
										{
											System.out.println("x = "+x+" and is not zero");
											num = x-1;
											System.out.println("num = "+num);
											y = array[num];
											System.out.println("y = "+y);
											if(y == 0)
											{
												System.out.println("y is zero");
												x = num;
												System.out.println("x = "+x);
												flag = false;
												tag = true;
												continue;
											}
											else
											{
												System.out.println("y is not zero, done checking all the positions");
												System.out.println("NO");
												break;
											}
										}
										else
										{
											System.out.println("x is zero");
											System.out.println("NO");
											break;
										}
									}
								}
								else
								{
									System.out.println("YES");
									break;
								}
							}
						}
						else
						{
							System.out.println("YES");
							break;
						}
					}
				}
			}
		}
	}
}
