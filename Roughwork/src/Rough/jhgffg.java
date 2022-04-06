package Rough;
import java.util.stream.*;
import java.util.function.*;
import java.lang.reflect.Method;
import java.util.*;

public class jhgffg{
	public static void main(String[] args) {
		var x=10;
		System.out.println(x);
	}
}

class stream{
	public static void main(String[] args) {
		ArrayList<Integer> a=new ArrayList<Integer>();
		a.add(10);
		a.add(2);
		a.add(4);
		a.add(5);
		a.add(18);
		List<Integer> l1=a.stream().filter(i->i%2==0).collect(Collectors.toList());
		Integer count=(int) a.stream().count();
		
		System.out.println(count);
		
	
	}
}