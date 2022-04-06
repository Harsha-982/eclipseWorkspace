package Operator;

public class Arithmetic {
	public static void main(String[] args) {
		int num =10;
		num=num+10; 
		
		float floatvar=1.5f;
		floatvar=floatvar+1.0f;
		// ANY NUMBER BY ZERO
//		System.out.println(num/0); "RE"==>we dont have infinity for integral arthimetic (int,short,byte,long)
		System.out.println(num/0.0f); // Infinity for long and double
		
		//ZERO BY ZERO
//		System.out.println(0/0); "RE" 
		System.out.println(0/0.0);// NaN(not a number)
		
		byte bytevar=10;
//		bytevar=bytevar+1;// invalid because of "+" arthimetic operator
//		max(int,type of bytevar, type of b) 
		
		bytevar=(byte)(bytevar+1);// valid after type casting 
		
		char chvarint='b'+9;// it will convert b+9=k
		System.out.println(chvarint+10); // it wil give 117 int
		
//		char chvardouble='c'+10.5; is invalid with double at assignment
		char chdoublevar='b';
		System.out.println(chdoublevar+10.5); // it wil give 117.5 int
	}
}
