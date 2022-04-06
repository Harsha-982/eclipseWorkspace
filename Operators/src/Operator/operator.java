package Operator;

public class operator {
	public static void main(String[] args){
		int a,c,d;
		a=c=d=40;
		
//		int e=f=g=h=20; because i didnt declare f,g,h but declared only e
		int f,g,h;
		int e=f=g=h=20; //we declared f,g,h...
		a^=2 ;
//		int m=e+=f-=g*=h/=2;//-160
//		 assignment is always from right to left appended
		int m=a+=e/=20;
		System.out.println(m);
		byte b=10;
		b++;
		b+=1;
//		b=b+1;
				
	}
}
