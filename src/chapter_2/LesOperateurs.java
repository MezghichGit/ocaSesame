package chapter_2;

public class LesOperateurs {

	public static void main(String[] args) {
		
		//boolean test = true;
		//System.out.println(!test);  // ! : operateur inverse d'une valeur booléenne
		/*
		int x = 10;
		//int y = ++x;
		int y = x++;
		System.out.println("x = "+x);
		System.out.println("y = "+y);*/
		/*
		int y = 4;
		//double x = (3 + 2)*--y + ++y - 3*y;
		double x = 3 + 2*--y + ++y - 3*y;
		//double x = 3*y+2;
		System.out.println("x = "+x);
		System.out.println("y = "+y);*/
		/*
		byte x = 1;
		byte y = 2;
		*/
		/*short x = 1;
		short y = 2;
		double z = x+y;
		System.out.println("z = "+z);*/
		//System.out.println(Short.MAX_VALUE);
		//System.out.println(Short.MIN_VALUE);
		//short y = (short)32770;//1921222;
		//System.out.println("y = "+y);
		/*
		double x = 12.5; //64 bits
		float y = (float)x;
		System.out.println("y = "+y);*/
		/*
		long x = 10;
		int y = 5;
		//y = y * x; 
		y *= x; // comme si on a fait un cast vers type de x
		
		short a = 12;
		short b = 10;
		b += a;*/
		//b = (short) (b+a);
		/*
		Animal a = new Animal();
		Oiseau o = new Oiseau();
		
		boolean test = o instanceof Animal;
		boolean test1 = o instanceof Oiseau;
		boolean test2 = a instanceof Oiseau;
		System.out.println(test2);*/
		
		//Logical Opérators
		
		int x = 10;
		//boolean res = (x>100) && (++x<100);
		boolean res = (x<100) || (++x<100) ||(++x>2);
		System.out.println(res);
		System.out.println(x);
		
		
	}

}
