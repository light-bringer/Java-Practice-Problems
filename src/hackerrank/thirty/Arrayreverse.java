package hackerrank.thirty;

import java.util.Scanner;

public class Arrayreverse {
	
	
	static void reverseArray(int arr[], int start, int end)
	{
	    int temp;
	    while (start < end)
	    {
	        temp = arr[start];   
	        arr[start] = arr[end];
	        arr[end] = temp;
	        start++;
	        end--;
	    }   
	}     
 
	
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i=0; i < n; i++){
            arr[i] = in.nextInt();
        }
        
        in.close();
        
        reverseArray(arr, 0, arr.length-1);
        for(int i=0; i < n; i++)
            System.out.print(arr[i]+ " ");
  
	}
}
