import java.util.Scanner;

public class Array2D
{
	static Scanner in = new Scanner(System.in);
	public static void main(String[] args)
	{
		int arr[][] = new int[6][6];
        for(int i=0; i < 6; i++){
            for(int j=0; j < 6; j++){
                arr[i][j] = in.nextInt();
            }
        }
        
        int max = -63;
        //check for the 3*3 block
        for(int i=0; i < 4; i++)
        {
            for(int j=0; j < 4; j++)
            {
            	int sum = arr[i][j]+arr[i][j+1]+arr[i][j+2]+arr[i+1][j+1]+arr[i+2][j]+arr[i+2][j+1]+arr[i+2][j+2];
            	
            	if(sum > max && sum >= -63 && sum <= 63)
            		max = sum;
            }
        }
        System.out.println(max);
	}
}
