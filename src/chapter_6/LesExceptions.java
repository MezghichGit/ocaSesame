package chapter_6;

import java.io.IOException;

public class LesExceptions {

	public static void info() throws NullPointerException // unchecked exception
	{
	
		//System.out.println("Hello");
		//throw new NullPointerException();
	}
	
	
	public static void affichage() throws Exception  //checked exception
	{
	
		//System.out.println("Hello");
		throw new NullPointerException();
	}
	
	
	public static void main(String[] args)  throws Exception{  //
		
		info();
		affichage();
		/*try {
		affichage();
		}
		catch(Exception e)
		{}*/
		
		/*try {
		   info();
		}
		catch(NullPointerException e)
		{
			e.printStackTrace();
		}*/
		
		System.out.println("Suite du programme...");
	}
}
