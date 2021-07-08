package chapter5.Polymorphisme;

public class Main {

	public static void main(String[] args) {
		Animal a = new Animal();
		Oiseau o = new Oiseau();
		Oiseau o1 = new Oiseau();
		// a=o;        // Cas 1 : UpCasting   : OK
		// o =a;       // Cas 2 : DownCasting : Compilation Error
		//o =(Oiseau)a;  // Cas 3 : DownCasting + Cast Explicite : Compilation Error
		
		a = o1;  // Upcast
		o =(Oiseau) a; //Cas 4 : DonwCat + Cast Explicite + UpCat avant

	}

}
