/**
 * 
 */
package hackerrank.thirty;

import java.util.Scanner;

/**
 * @author lightbringer
 *
 */
public class StringReview {
	
	public static void main(String[] args) {
	        /* Enter your code here. Read input from STDIN. Print output to STDOUT. 
	         * Your class should be named Solution. */
		Scanner scan = new Scanner(System.in);
		int times = scan.nextInt();
		scan.nextLine();
		String analysis;
		for (int i=0; i<times; i++) {
			analysis = scan.nextLine();
			for (int j=0; j<analysis.length(); j=j+2)
				 System.out.print(analysis.charAt(j));
			System.out.print(" ");
			for (int k=1; k<analysis.length(); k=k+2)
				 System.out.print(analysis.charAt(k));
			System.out.println();			
		}
		
		scan.close();
	 }
}



