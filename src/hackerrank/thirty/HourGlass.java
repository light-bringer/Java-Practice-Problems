/**
 * 
 */
package hackerrank.thirty;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author light-bringer
 *
 */
public class HourGlass {
	
	
	public static int sum(int[] arr)  {
		int sum = 0;
		for (int i=0; i<arr.length; i++)
			sum+=arr[i];
		return sum;	
	}
	
	public static void display(int[] arr) {
		for(int i=0; i< arr.length; i++)
			System.out.print(arr[i] + " ");
	
		System.out.println();
	}
	
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[][] = new int[6][6];
        for(int i=0; i < 6; i++){
            for(int j=0; j < 6; j++){
                arr[i][j] = in.nextInt();
            }
        }
        in.close();
        int sum;
       int max = Integer.MIN_VALUE;
        ArrayList<int[]> glasslist = new ArrayList<int[]>();
        for(int i=0;i<6; i++) {
        	for(int j=0; j<6; j++) {
        		if((i+2<6) && (j+2<6))
        		{
        			int[] hourglass = {arr[i][j], arr[i][j+1], arr[i][j+2], arr[i+1][j+1], arr[i+2][j], arr[i+2][j+1], arr[i+2][j+2]};
            		glasslist.add(hourglass);
            		sum = sum(hourglass);
            		//System.out.println(sum);
    				if(sum>max)
            			max=sum;
       
        		}
        		
        	
        	}
        	
        }
        
        System.out.println(max);
        
    }

}
