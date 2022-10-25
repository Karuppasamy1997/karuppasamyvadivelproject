package Karupputask;

import java.util.Scanner;

public class Powerofnumber {
 public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("enter base number");
	int base=s.nextInt();
	System.out.println("enter exponent number");
	int exponent=s.nextInt();
	int power=powermethod(base,exponent);
	System.out.println(power);
}

private static int powermethod(int base, int exponent) {
	// TODO Auto-generated method stub
	int count=1;
	for(int i=1;i<=exponent;i++) {
		count=count*base;
	}
	return count;
}
}
