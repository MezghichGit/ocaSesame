package chapter4.chapter45;


@FunctionalInterface
public interface Vehicule {
	
	public void demarrer();  // méthode abstraite
	
	//public void arreter(); 
	
	public default void affichage()  // méthode concrète
	{
		System.out.println("Une interface fonctionnelle");
	}
	
	public static void message()  // méthode concrète
	{
		System.out.println("Une interface fonctionnelle");
	}

}
