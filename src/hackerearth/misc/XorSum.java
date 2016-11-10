package hackerearth.misc;

import java.util.Scanner;

public class XorSum {
	
	
	public static int xor(int a, int b) {
		return a^b;
	}

	public static int sum(int a, int b) {
		return a+b;
	}
	
	public static int[] loop(int n) {
	    int[] a = new int[n];
	    for (int i = 0; i < n; ++i) {
	        a[i] = i+1;
	    }
	    return a;
	}
	
	
	
	
	public static int countValues(int n)
	{
	    // unset_bits keeps track of count of un-set
	    // bits in binary representation of n
	    int unset_bits=0;
	    while (n>0)
	    {
	        if ((n & 1) == 0)
	            unset_bits++;
	        n=n>>1;
	    }
	 
	    // Return 2 ^ unset_bits
	    return 1 << unset_bits;
	}
	
	
	
	
	public static void main(String[] argv) {
		
		Scanner scan = new Scanner(System.in);
		
		int times = scan.nextInt();
		
		for(int i=0; i< times; i++) {
			int number = scan.nextInt();
			System.out.println(countValues(number)-1);
			
		}
		
		
		scan.close();
	}
}
