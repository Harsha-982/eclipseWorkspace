package ToInteger;
import java.util.Scanner;

public class ToInteger{
	static void convertToInt(String str) {
		int number=Integer.parseInt(str);
		System.out.println(number);
	}
	static void covertToInteger(String str) {
		Integer integer=Integer.valueOf(str);
		System.out.println(integer);
	}
	
	
	public static void main(String[] args){
		// primitive data type int
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
//		ToInteger.convertToInt(str);
		ToInteger.covertToInteger(str);
		
	}
}
	
