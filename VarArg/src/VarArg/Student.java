package VarArg;
import java.lang.reflect.*;
public class Student{
	String name="harsha";
	int rollno=10;
	public String getname() {
		return name;
	}
	public int getrollno() {
		return rollno;
	}
}
class getdetails{
	public static void main(String[] args) throws Exception {
	
		Class c = Class.forName("java.util.Stream.Collector");
		Method[] m=c.getDeclaredMethods();
		for(Method s: m) {
			System.out.println(s.getName());
	}
	
	}
}

class Abc{
	final int number;
	Abc(int number){
		this.number=number;
	}
	public static void main(String[] args) {

	}
}

