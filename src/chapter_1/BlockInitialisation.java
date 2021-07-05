package chapter_1;

public class BlockInitialisation {

	public static void main(String ... args) {
		
		String ch [];
		String [] ch2;
		int _x = 10;
		//int k@ = 20;
		int  _= 20;
		int $c = 10;
		System.out.println(_);
		System.out.println($c);
		Voiture v1 = new Voiture();
		Voiture v2 = new Voiture();
		
		Voiture v3 = new Voiture(2021,"Noir");
		int a=10;
		System.out.println(a);
		System.out.println(v1.annee);
		System.out.println(v2.annee);
		
		System.out.println(v1.couleur);
		System.out.println(v2.couleur);
		
		System.out.println(Voiture.nb);
		
		System.out.println(v3.annee);
		
		System.out.println(v3.couleur);
	}

}
