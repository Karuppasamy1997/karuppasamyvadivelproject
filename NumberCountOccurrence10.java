package Karupputask;

public class NumberCountOccurrence10 {
    public static void main(String[] args) {
		int[] arr= {1,2,2,2,22,34,434,334,3333,23,3,6,22,6,334};
		int l=arr.length;
		int x=2;
	 int a= count(arr, l,x);
	   System.out.println(a);
	}

	 static int count(int[] arr, int l, int x) {
		int rev=0;
		for(int i=0;i<l;i++) 
			if(x==arr[i]) 
				rev++;
				return rev;
				
		}
	 
		
		
	}

