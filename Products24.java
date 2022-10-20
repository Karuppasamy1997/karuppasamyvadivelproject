package supermarket;

import java.util.Scanner;

public class Products24{
	static int count;
	static String name,name1,name2;
	static Scanner s=new Scanner(System.in);
	static String[] stringArray =new String[3];
	 static String[] dairy= new String[] {"milk", "curd", "butter"};
	 static String[] sauce= new String[] {"chilly", "tomotosauce", "soya"};
	 static String[] vegetable =new String[] {"tomato","potato","onion"};
public static void main(String[] args) {
	
		System.out.println("enter the product");
		for(int i=0;i<stringArray.length;i++) {
			stringArray[i]=s.nextLine();
			}
		
		Products24 sm =new Products24();
		Product2 v=new Product2();
		
		v.setName("dairy");
		name=v.getName();
        v.start();
        Product2 v1=new Product2();
	    v1.setName("Sauce");
	    name1=v1.getName();
     v1.start();
     product3 v3=new product3();
     v3.setName("vegetable");
     name2=v3.getName();
     v3.start();
;
     }


static synchronized public void  sauce() {
	// TODO Auto-generated method stub
	System.out.println("name1");
	for(int i=0;i<stringArray.length;i++) {
		for(int j=0;j<sauce.length;j++) {
			if(stringArray[i].equals(sauce[j])) {
				System.out.println(sauce[i]);
			}
		}
		
	}
}


static synchronized public void  dairy() {
	// TODO Auto-generated method stub
	System.out.println("name");
	for(int i=0;i<stringArray.length;i++) {
		for(int j=0;j<dairy.length;j++) {
			if(stringArray[i].equals(dairy[j])) {
				System.out.println(dairy[i]);
			}
		}
		
	}
}


public static void vegetable() {
	// TODO Auto-generated method stub
	System.out.println("name2");
	for(int i=0;i<stringArray.length;i++) {
		for(int j=0;j<vegetable.length;j++) {
			if(stringArray[i].equals(vegetable[j])) {
				System.out.println(vegetable[i]);
			}
		}
		
	}
}
}
class Product1 extends Thread   {
@Override
public void run() {
	// TODO Auto-generated method stub
	Products24.dairy();
}
}
	 class Product2 extends Thread{
		@Override
		public void run() {
			// TODO Auto-generated method stub
			Products24.sauce();
		}
	}
    class product3 extends Thread{
		@Override
		public void run() {
			// TODO Auto-generated method stub
			Products24.vegetable();
		}
	}
    