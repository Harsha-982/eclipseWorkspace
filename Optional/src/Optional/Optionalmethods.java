package Optional;

import java.util.*;
import java.util.stream.*;
public class Optionalmethods {
	public static void main(String[] args) {
		Optional op=Optional.of(987654);
		System.out.println("-------Value gets printed---------");
		System.out.println(op);
		
		System.out.println("-------Stream gets printed---------");
		op.stream().forEach(System.out::println);
		
		
		Optional<Integer> op1= Optional.empty();
	
	     System.out.println("Optional: "+ op1);
	
	     try {
	         System.out.println("Getting the Stream:");
	         op1.stream().forEach(System.out::println);
	     }
	     catch (Exception e) {
	         System.out.println(e);
	     }
	     Optional<Integer> op2=Optional.ofNullable(768);
	     System.out.println(op2);// gets Optional[768]
	     System.out.println("---------to get normal 768----");
	     System.out.println(op2.get());
	     System.out.println("----------to get ints stream-----");
	     op2.stream().forEach(System.out::println);
	     Stream s=Stream.of(1,2,4,6,8,9);
		}
	}
