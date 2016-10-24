package hackerearth.codemonk.one;

import java.util.Scanner;

public class ArrayAdd {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[] arr1 = new int[n];
		int[] arr2 = new int[n];
		int[] sum = new int[n];
		for(int i=0; i<n; i++)
			arr1[i] = s.nextInt();

		for(int i=0; i<n; i++) {
			arr2[i] = s.nextInt();
			sum[i] = arr1[i] + arr2[i];
		}		
		for(int i=0; i<n; i++)
			System.out.print(sum[i] + " ");
			
		s.close();
	}

}
