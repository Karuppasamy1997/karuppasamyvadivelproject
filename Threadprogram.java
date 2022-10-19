package Threadmultiadd;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;  
public class Threadprogram {
	public static void main(String[] args)  {
		Add add = new Add();
		Mul mul = new Mul();
		Div div = new Div();
		
		
		

		add.setPriority(10);
		mul.setPriority(9);
		div.setPriority(4);
		add.start();
		mul.start();
		div.start();

		
		
//		System.out.println(add.getPriority());
		
//		add.setPriority(7);
//		System.out.println(add.getPriority());
	}
}