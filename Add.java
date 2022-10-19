package Threadmultiadd;

public class Add extends Thread {
	int a=10;
	int b=20;
	int c=30;

	public void run() {
		int d=a+b+c;
		System.out.println("Addition: "+d);
	}
	
	
}