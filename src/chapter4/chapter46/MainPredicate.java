package chapter4.chapter46;

import java.util.function.Predicate;

public class MainPredicate {

	
	public static void main(String[] args) {
		
		Predicate <String> p;  // boolean test(T t);
		
		p = (String s)->{return s.contains("o");};
		
		System.out.println(p.test("ocp"));
	}
}
