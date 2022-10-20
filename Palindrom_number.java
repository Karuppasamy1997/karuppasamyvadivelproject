package Karupputask;

import java.util.Scanner;

public class Palindrom_number {

	public static void main(String[] args) {
		 int r,sum=0,temp;    
		  Scanner t=new Scanner(System.in);
		  System.out.println("enter the number");
		  
		 int n=t.nextInt();
		 int temp1=n;
		  while(n>0){    
		   r=n%10;   
		   sum=(sum*10)+r;    
		   n=n/10;    
		  }    
		  if(temp1==sum)    
		   System.out.println("palindrome number ");    
		  else    
		   System.out.println("not palindrome");    
		}  

	}

