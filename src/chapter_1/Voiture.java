package chapter_1;

public class Voiture {
	
	int annee;  // attribut d'instance
	String couleur; // attribut d'instance
	
	static int nb;  // attribut de classe
	
	

	public Voiture() {
		System.out.println("Un constructeur");
	}

	// block d'initialisation d'instance
	{
		int a = 10; // variable locale au block
		System.out.println("Je suis un block d'initialisation d'instance");
	}
	
	// block d'initialisation d'instance 2
		{
		
			//System.out.println(a);
		}
	
	//block d'initialisation de classe : sera exécuté une seule fois
	static {	
		System.out.println("Block de classe");
	}
	
	
	public Voiture(int annee, String couleur) {
		
		this.annee = annee;
		this.couleur = couleur;
	}

	@Override
	public String toString() {
		return "Voiture [annee=" + annee + ", couleur=" + couleur + "]";
	}

	  public void finalize()
	  {
		  System.out.println("Objet détruit");
	  }

}