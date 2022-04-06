package Operator;

public class InceDec {
	public static void main(String[] args) {
		int int1=10;
		int int2=++int1; // first increment then assign value of int1(int1=11,int2=11)
		System.out.println(int1+" "+int2);
		int2=int1++;// int1=12;int2=11
		System.out.println(int1+" "+int2);
		int2=--int1;//int1=11;int2=11
		System.out.println(int1+" "+int2);
		int2=int1--;// assign and then decrement (int1=10;int2=11)
		System.out.println(int1+" "+int2);		
//		int2=++10; invalid
//		int2=++(++int1); invalid 
		
		
		final int int3=10; 
		//		int3++; can't assign or increment even  because final variable
		
		
		char chvar='b';
		++chvar;// b
		
		double doublevar=10.5;
		++doublevar;// 11.5
		
//		boolean bool=true; bool++ invalid
		byte bytevar=10;
		bytevar++;
		

		
	}
}