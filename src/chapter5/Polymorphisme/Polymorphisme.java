package chapter5.Polymorphisme;

//import chapter5.Util;


import static chapter5.Util.Max;
import static chapter5.Util.info;

//import static chapter5.Util.*;

public class Polymorphisme {
	
	public static void info() {
		System.out.println("Ok");
	}
	public static void main(String[] args) {
	
		// sans l'import static
		//Util u = new Util();
		//System.out.println(u.Max);
		//u.info();
		
		//avec le static import et on ecrit import static
		System.out.println(Max);
		info();
	}

}
