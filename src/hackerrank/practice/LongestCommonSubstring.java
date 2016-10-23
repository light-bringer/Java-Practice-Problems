/**
 * 
 */
package hackerrank.practice;

import java.util.HashSet;
import java.util.Set;

/**
 * @author lightbringer
 *
 */
public class LongestCommonSubstring {

	/**
	 * @param args
	 */
	
	public static Set<String> longestCommonSubstrings(String s, String t) {
	    int[][] table = new int[s.length()][t.length()];
	    int longest = 0;
	    Set<String> result = new HashSet<>();

	    for (int i = 0; i < s.length(); i++) {
	        for (int j = 0; j < t.length(); j++) {
	            if (s.charAt(i) != t.charAt(j)) {
	                continue;
	            }

	            table[i][j] = (i == 0 || j == 0) ? 1
	                                             : 1 + table[i - 1][j - 1];
	            if (table[i][j] > longest) {
	                longest = table[i][j];
	                result.clear();
	            }
	            if (table[i][j] == longest) {
	                result.add(s.substring(i - longest + 1, i + 1));
	            }
	        }
	    }
	    
	    //display(table, s.length(), t.length());
	    
	    return result;
	}
	
	
	public static int sumstring(String s) {
		int sum  = 0;
		//for()
		
		
		return sum;
	}
	
	
	
	public static void display(int[][] table, int m , int n) {
		for(int i=0; i<m; i++) {
			for(int j=0; j<n; j++)
				System.out.print(table[i][j] + " ");
			System.out.println();
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(longestCommonSubstrings("abddab", "abcabc").toArray()[0].toString().length());

	}

}
