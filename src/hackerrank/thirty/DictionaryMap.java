/**
 * 
 */
package hackerrank.thirty;

import java.util.HashMap;
import java.util.Scanner;

/**
 * @author lightbringer
 *
 */
public class DictionaryMap {
	
	public static void main(String[] args) {
		
		
		Scanner in = new Scanner(System.in);
        HashMap<String, Integer> myMap = new HashMap<String, Integer>();
    
		int n = in.nextInt();
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            myMap.put(name, phone);
            // Write code here
            }
//        System.out.println(myMap);
        while(in.hasNext()){
            String s = in.next();
            if(myMap.containsKey(s))
            	System.out.println(s+"="+myMap.get(s));
            else
            	System.out.println("Not found");
            // Write code here
        }
        in.close();
		
	}

}
