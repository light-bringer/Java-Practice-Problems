package hackerrank.thirty;

import java.util.Scanner;

/**
 * @author lightbringer
 *
 */
public class DataTypes {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int i = 4;
		 double d = 4.0;
		 String s = "HackerRank ";
		 Scanner scan = new Scanner(System.in);
		 /* Declare second integer, double, and String variables. */
	     /* Read and save an integer, double, and String to your variables.*/
		 int value = scan.nextInt();
		 double dobVal = scan.nextDouble();
		 scan.nextLine();
		 String newString = scan.nextLine();
		 /* Print the sum of both integer variables on a new line. */
		 System.out.println(i+value);
		 /* Print the sum of the double variables on a new line. */
		System.out.println(d+dobVal);
		/* Concatenate and print the String variables on a new line; 
	        	the 's' variable above should be printed first. */
		System.out.println(s+newString);
		 scan.close();
	}

}
