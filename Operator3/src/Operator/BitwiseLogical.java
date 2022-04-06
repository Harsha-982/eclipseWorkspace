package Operator;

public class BitwiseLogical {

	public static void main(String[] args) {
		
		// can be applied for integral anf boolean not for floating points
		System.out.println(4&5);
		System.out.println(4|5);
		System.out.println(4^5);
		
		
		//~only for integral  not boolean and floating points
		System.out.println(~4); // 00.....0100==>11....1011==>(1's compliment)100....0100==>(add 1)100....0101
		//-5
	
		//BOOLEAN COMPLIMENT NEGATION ("!")
//		System.out.println(!5); in valid
		System.out.println(!true);
		//false
	}
}
	
class Logical{
	public static void main(String[] args){
		// only for boolean not integral
		System.out.println(false && true);
		
		int int1=100;
		int int2=20,int3=10;
		if((int1>int2 )&&(int1>int3))
			System.out.println("int1 is larger");
	}
}

class CompareBitLogic{
	public static void main(String[] args) {
		int integer1=10;
		int integer2=15;
		if(++integer1==integer1)
			System.out.println("hq"); // this true because in pre increment it gets incremented and then compared..
		
		
		if(++integer1<10 & ++integer2>15) 
			System.out.println(integer1);// we know ++integer1 is 11<10.. and ++integer2 is16>15..
		else
			System.out.println(integer2); //16
		
		int int1=10,int2=15;
		
		if((++int1<10) && (++int2>15)) 
			System.out.println(int1);// we know ++int1 is 11<10.. and 2nd part will not exceute..
		
		// time gets saved
		
		else
			System.out.println(int2); //15
	}
}
class Terinary{
	public static void main(String[] args) {
		int int1=10;
		int int2=11;
		int compare;
		compare=(int1>int2)?int1:int2;	
		System.out.println(compare); //11
	}
}

