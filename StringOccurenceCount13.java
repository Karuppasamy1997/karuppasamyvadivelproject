package Karupputask;

public class StringOccurenceCount13 {


	/*public static void main(String[] args) {
		String s1 = "Fuzzy Wuzzy was a bear. Fuzzy Wuzzy had no hair. Fuzzy Wuzzy wasn’t fuzzy, was he?";
		String s2 = "fuzzy";

		String[] word = s1.toLowerCase().split(s2);

		System.out.println("The count of the word " + s2 + " is " + (word.length - 1));

	}

}*/
	static int count(String str,String word){
		
	
	String a[]=str.split(" ");
	int count=0;
	for(int i=0;i<a.length;i++) {
		if(word.equals(a[i]))
			count++;
	
	}
	return count;
	}
	public static void main(String[] args) {
		String str="Fuzzy Wuzzy was a bear. the Fuzzy Wuzzy had no the hair. Fuzzy Wuzzy wasn’t fuzzy, was he?";
		String word="the";
		System.out.println(count(str,word));
	}
	}
	
