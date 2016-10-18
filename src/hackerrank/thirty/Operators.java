package hackerrank.thirty;


import java.util.Scanner;


public class Operators {
	    public static void main(String[] args) {
	        Scanner scan = new Scanner(System.in);
	        double mealCost = scan.nextDouble(); // original meal price
	        int tipPercent = scan.nextInt(); // tip percentage
	        int taxPercent = scan.nextInt(); // tax percentage
	        scan.close();
	        double totalCosts = mealCost+(tipPercent*mealCost/100.0) +
	        		(taxPercent*mealCost/100.0);
	        // Write your calculation code here.
	      
	        // cast the result of the rounding operation to an int and save it as totalCost 
	        int totalCost = (int) Math.round(totalCosts);
	      
	        // Print your result
	        System.out.println("The total meal cost is "+totalCost+" Dollars");
	        
	    }


}
