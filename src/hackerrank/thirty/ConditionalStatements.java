/**
 * 
 */
package hackerrank.thirty;

import java.util.Scanner;

/**
 * @author lightbringer
 *
 */
public class ConditionalStatements {
	public static void main(String[] args) {
	      Scanner scan = new Scanner(System.in);
	      int n = scan.nextInt(); 
	      scan.close();
	      String ans="";
	          
	      // if 'n' is NOT evenly divisible by 2 (i.e.: n is odd)
	      if(n%2==1){
	         ans = "Weird";
	      }
	      else{
	         // Complete the code
	    	  if(n>=2 && n<=5)
	              ans = "Not Weird";
	          if(n>=6 && n<=20)
	              ans = "Weird";
	          if(n>20)
	              ans = "Not Weird";
	      }
	      System.out.println(ans);
	   }
	}


