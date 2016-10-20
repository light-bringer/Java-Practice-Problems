package hackerrank.thirty;

import java.util.Scanner;

public class RecursionFactorial {
	
	
	static int factorial(int a) {
	
		if(a<2)
			return 1;
		else 
			return(a*factorial(a-1));
		
	}
	
	    public static void main(String[] args) {
	        /* Enter your code here. 
	         * Read input from STDIN. 
	         * Print output to STDOUT. Your class should be named Solution. */
	    	Scanner s = new Scanner(System.in);
	    	int n = s.nextInt();
	    	System.out.println(factorial(n));
	    	s.close();
	    	
	    }
	}

