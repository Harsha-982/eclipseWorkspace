package ToInteger;
import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		int m=s.length();
		boolean flag=false;
		for(int i=0;i<m/2;i++) {
			if(s.charAt(i)==s.charAt(m-1-i)) {
				flag=true;
			
			}
		}
		if(flag==true) 
			System.out.println("Palindrome");
		else 
			System.out.println("Not Palindrome");
	}
}
