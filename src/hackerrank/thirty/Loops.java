package hackerrank.thirty;

import java.util.Scanner;

public class Loops {
	
	
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.close();
        for(int i=1; i<=10; i++){
        	System.out.println(n+ " x " + i + " = "+(n*i));
        }
    }

}
