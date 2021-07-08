package chapter4.chapter42;

public class PassageParametres {

	public static void permut(int a, int b)
	{
		System.out.println("valeurs avant : a = "+a +" b ="+b);
		int temp;
		temp =a;
		a=b;
		b=temp;
		System.out.println("valeurs après : a = "+a +" b ="+b);
	}
	
	public static void modifSB(StringBuilder sb)  // passage par valeur
	{
		System.out.println(sb.append("-ocp"));
	}
	
	
	public static void modifS(String st)  // passage par valeur
	{
		//System.out.println(st.concat("-ocp"));
		st = st.concat("-ocp");
	}
	
	public static void main(String[] args) {
		/*
		int x = 10, y = 20;
		//PassageParametres m = new PassageParametres();
		//m.permut(x,y);
		permut(x,y);
		System.out.println("x = "+x);
		System.out.println("y = "+y);*/
		
		/*StringBuilder s = new StringBuilder("oca");
		modifSB(s);
		System.out.println(s);*/
		
		String s = new String("oca");
		modifS(s);
		System.out.println(s);
	}

}
