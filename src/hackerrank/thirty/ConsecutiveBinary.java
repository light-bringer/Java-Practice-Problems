/**
 * 
 */
package hackerrank.thirty;

import java.util.Arrays;

/**
 * @author lightbringer
 *
 */

import java.util.Scanner;

public class ConsecutiveBinary {
	
	public static void main(String[] argv) {
		Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.close();
        String binstring = Integer.toBinaryString(n);
        System.out.println(binstring);
        String[] strarray = binstring.split("0");
        Arrays.sort(strarray);
        System.out.println(strarray[strarray.length-1].length());
		
	}

}