package org.Electricalbillsconstructor;

import java.util.Scanner;

public class  Electricalbills {
	double billpay;
		class Bill {
	     
			void billmethod(int n)
			{
				 
				if(n<100) {
					billpay=0;
					System.out.println("no pay"+billpay);
				}
				else if(n>100) {
					if(n<300) {
						billpay=100*1.20+(n-100)*2;
						System.out.println("s."+billpay);
						
					}
					else if(n>300) {
						billpay=100*1.20+200*2+(n-300)*3;
						System.out.println("Rs."+billpay);
					}
				}
		}
		}
	public static void main(String args[]) {

		Scanner a=new Scanner(System.in);
		System.out.println("enter  units number");
		int n=a.nextInt();
	
		Electricalbills.Bill obj = new Electricalbills().new Bill();
		
		
		obj.billmethod(n);
		
	
}
}
