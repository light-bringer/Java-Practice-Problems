/**
 * 
 */
package hackerearth.codemonk.sorting;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

/**
 * @author lightbringer
 *
 */
public class ModuloSorting {

	/**
	 * @param args
	 */
	
	public static void display(int[] arr) {
		for (int i=0; i< arr.length; i++)
			System.out.print(arr[i] + " ");
		System.out.println();
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] arr = new int[n];
		int[] arr2 = new int[n];
		int modulo = scan.nextInt();
		HashMap<Integer, Integer> array = new HashMap<Integer, Integer>();
		for(int i=0; i<n; i++)
		{
//			array.
		}
		
		Arrays.sort(arr2);
		
		display(arr);
		display(arr2);
		
		
		
		scan.close();
		

	}

}
