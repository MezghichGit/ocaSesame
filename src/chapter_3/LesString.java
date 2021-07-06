package chapter_3;

import java.util.ArrayList;

public class LesString {

	public static void main(String[] args) {
		
		
		  String ch1 = "OCAOCA"; // création d'un String dans le pool 
		  //String c = ch1.substring(2,2);
		 // System.out.println(ch1.replace('A', 'P'));
		  ch1 = ch1.replace('A', 'P');
		  System.out.println(ch1);
		  System.out.println("res = " + "abc".startsWith("ab"));
		  
		  //ch1.concat("ocp");
		  // System.out.println(ch1.concat("ocp"));
		  // ch1 = ch1.concat("ocp");
		 // System.out.println(ch1);
		  
			/*
			 * String ch2 = "OCA";// création d'un String dans le pool String ch3 = new
			 * String("OCA"); //création d'un String dans le heap // System.out.println(ch1
			 * == ch2); // true System.out.println(ch1 == ch3); // false
			 * System.out.println(ch1.equals(ch2)); // true
			 * System.out.println(ch1.equals(ch3)); // true
			 * 
			 * System.out.println(ch1); System.out.println(ch2); System.out.println(ch3);
			 */
		 
	
	
		Animal a1 = new Animal();
		a1.id = 100;
		Animal a2 = new Animal();
		a2.id = 100;
		//a1 = a2;
		System.out.println(a1==a2);
		System.out.println(a1.equals(a2));  // par défaut equals se comporte comme ==
		
		
		//System.out.println(a);
		//System.out.println(a.toString());
		
		/*ArrayList al = new ArrayList();
		al.add("oca");
		al.add("ocp");
		System.out.println(al.toString());*/

	}

}
