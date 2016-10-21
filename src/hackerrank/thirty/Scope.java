/**
 * 
 */
package hackerrank.thirty;

import java.util.Scanner;


/**
 * @author lightbringer
 *
 */

class Difference {
  	private int[] elements;
  	public int maximumDifference;
  	
  	
  	public Difference(int[] a) {
  		this.elements = a;
  		HourGlass.display(elements);
  		HourGlass.display(a);
  		
  		
  	}


	public void computeDifference() {
		// TODO Auto-generated method stub
		
	}
	 
}


public class Scope {
	
	
	public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int n = sc.nextInt();
	        int[] a = new int[n];
	        for (int i = 0; i < n; i++) {
	            a[i] = sc.nextInt();
	        }
	        sc.close();

	        Difference difference = new Difference(a);

	        difference.computeDifference();

	        System.out.print(difference.maximumDifference);
	    }

}
