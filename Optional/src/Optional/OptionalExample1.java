package Optional;

import java.util.*;
import java.util.function.Consumer;
import java.util.stream.Collectors;
public class OptionalExample1 {
	public static void main(String[] args) {
		List l=Arrays.asList(null,"harsha","usha");
		Optional op=Optional.of(l.get(1));  // ==Optional[Harsha]
		System.out.println("--ofNullable is combination of empty() and of() methods---");
		Optional op1=Optional.ofNullable(l.get(0));
		System.out.println(op+" "+op1);
		System.out.println(op.isPresent());
		l.stream().filter(i->((Optional) op).isPresent()).forEach(y->System.out.println(y));;
		
		
	}
}
