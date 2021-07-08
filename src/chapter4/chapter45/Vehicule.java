package chapter4.chapter45;


@FunctionalInterface
public interface Vehicule {
	
	public void demarrer();  // m�thode abstraite
	
	//public void arreter(); 
	
	public default void affichage()  // m�thode concr�te
	{
		System.out.println("Une interface fonctionnelle");
	}
	
	public static void message()  // m�thode concr�te
	{
		System.out.println("Une interface fonctionnelle");
	}

}
