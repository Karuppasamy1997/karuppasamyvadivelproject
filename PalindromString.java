package Karupputask;

public class PalindromString {

	public static void main(String[] args) {
		
 String a="teset",b="";

int c=a.length();
System.out.println(c);
System.out.println("normaiemty:"+b);
//char[] d=a.toCharArray();
for(int i=(c-1);i>=0;i--) {
	System.out.println(i);
	System.out.print("char at i:"+a.charAt(i));
	System.out.print("emty:");
	b=b+a.charAt(i);
	System.out.println(b);
	if(a.toLowerCase().equals(b.toLowerCase())) {
		System.out.println("this  palindrom");
		
	}
	else {
		System.out.println("not palindrom");
	}
}

	


	}

}
