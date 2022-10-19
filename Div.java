package Threadmultiadd;

public class Div extends Thread {
	int a=10;
	int b=20;
	public void run() {
		int d=a/b;
		System.out.println("div"+d);
	}
}

