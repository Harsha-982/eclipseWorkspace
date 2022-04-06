package Operator;

public class Relational {
	public static void main(String[] args) {
		
		// can compare any primitive except boolean
		System.out.println(10>'a');
		System.out.println('a'>10);
		System.out.println(10<20);
		System.out.println(97.5<'a');
		
		// invalid for objects
		
//	 		System.out.println("harsha">"usha");
	}
}
class Equality {
	public static void main(String[] args) {
		
		//for every primitive we can apply equality operator including boolean
		System.out.println(10==20); //false
		System.out.println('a'=='b');//false
		// true because char while comparing automatically converted to double
		System.out.println('a'==97.0);// true
		System.out.println(true!=false);//true "NO CE"
		System.out.println(false==false);// true
		
		//"==" operator in java for comparing reference so we can apply for objects 
		String str="Harsha";
		String str1=new String("Harsha");
		String str2=str1;
		
		System.out.println(str1==str);// false 
		System.out.println(str1==str2); // true
	}
}
		

