package hackerearth.codemonk.one;

import java.util.Scanner;

public class PalindromeCheck {
	
	
	public static String reverse(String string) {
	    StringBuffer sb = new StringBuffer(string);

	    return sb.reverse().toString();
	  }
	
	public static void main(String argv[]) {
		
		Scanner scan = new Scanner(System.in);
		
		int times = scan.nextInt();
		scan.nextLine();
		for(int i=0; i<times; i++) {
			
			String s = scan.nextLine();
			if(s.equals(reverse(s))) {
				System.out.print("YES");
				if(s.length()%2==0)
					System.out.println(" EVEN");
				else
					System.out.println(" ODD");
					
			}
					
			else
				System.out.println("NO");
			
		
		}
		
		scan.close();
			
	}
		
}
