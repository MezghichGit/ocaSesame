package chapter_6;

public class Main {

	public static void main(String[] args) {
		
		int x = 10;
		int y = 0;
		System.out.println("D�but Calcul");
		
		try {
		 System.out.println("x/y = "+x/y);
		}
		catch(Exception e)
		{
			//System.out.println("Probl�me division par z�ro");
			//System.out.println(e.getMessage());
			e.printStackTrace();
			
			return;
		}
		
		finally {
		System.out.println("Fin Calcul");
		}
		//int tab[]= {1,2,5};
		//System.out.println(tab[3]);
		
		/*String formation = null;
		System.out.println(formation.length());*/

	}

}
