package chapter_6;

public class LesExceptionsSuite {
public static void main(String[] args) {
		
		int x = 10;
		int y = 0;
		int tab[] = {10,20};
		System.out.println("Début Calcul");
		
		try {
			
		 System.out.println(tab[2]);
		}
		catch(IndexOutOfBoundsException e)
		{
			System.out.println("Block catch IndexOutOfBounds");
			e.printStackTrace();
		}
	    
		try {
			
			 System.out.println("x/y = "+x/y); 
			}
		
		catch(ArithmeticException e)
		{
			System.out.println("Block catch Arithmetic");
			e.printStackTrace();
		}
		
		catch(Exception e)
		{
			
			e.printStackTrace();
		}
		finally {
			System.out.println("Fin du programme");
		}
		
		
    }
		
}
