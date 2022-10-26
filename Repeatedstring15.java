package Karupputask;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Repeatedstring15 {
	public static void main(String[] args) {

		String s = "abcddeefddaag";
		char[] c = s.toCharArray();
		Arrays.sort(c);
		for (char d : c) {
			System.out.print(d);
		}
		System.out.println("--------------");
	          int count=0;
	        System.out.println(" No Duplicate characters given string: ");  
	       
	        for(int i = 0; i <c.length; i++) {  
	            count = 1;  
	            for(int j = i+1; j <c.length; j++) {  
	                if(c[i] == c[j] ) {  
	                     c[i]='0';
	                     
		             // System.out.println(c[i]);
		              if('0'!=c[i]) {
		            	  
		            	  System.out.println(c[i]);
		              }
	                  
	                }  
	               // count++;
	            }  
	            
	            if(count > 0 && c[i] != '0')  
	               System.out.println(c[i]);  
	        }  
	    }  
}