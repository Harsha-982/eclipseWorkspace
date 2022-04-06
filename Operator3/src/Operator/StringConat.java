package Operator;

public class StringConat {
	public static void main(String[] args) {
		String str="happy";
		int int1=10,int2=20,int3=30;
		
		// precidence from left to right because operator is only "+"
		
		System.out.println(int1+int2+int3+str);//60happy
		System.out.println(int1+int2+str+int3);//30happy30
		System.out.println(int1+str+int2+int3);//10happy2030
		System.out.println(str+int1+int2+int3);//happy102030
		
		//valid expressions
		
//		int1=int2+int3+str;// never valid "CE":unresolved 
		str=str+int1+int2;	// str=happy1020
		str=int1+str+int2; // str=10happy102020
		System.out.println(str);
		
		
	}
}
