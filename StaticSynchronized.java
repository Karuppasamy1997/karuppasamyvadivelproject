package Karupputask;

public class StaticSynchronized {
	
	int amount = 1000;

synchronized void withdrow(int amount) {
	System.out.println("going withraw");
	if(this.amount<amount) {
		System.out.println("low balance");
		try {
			wait();
		}
		catch(Exception e){
	
		}
	    int a= this.amount-=amount;
		System.out.println("withdrow completed:" +a);
		
       }
      }

	synchronized void deposit(int amount) {
		System.out.println("deposit");
		int b=this.amount+=amount;
		System.out.println("deposit:");
		notify();
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          StaticSynchronized obj =new StaticSynchronized();
    
     new Thread() {
	            public void run() {
		        obj.withdrow(1100);
		
	}
	           
}
     .start();
     new Thread() {
	 public void run() {
		           obj.deposit(1000);}
		           
     
}
     .start();
}
}

