package chapter5.Polymorphisme;

public class MainVoiture {

	
	public static void infoV(Voiture v)  // m�thode polymorphe
	{
		v.info();
	}
	
	public static void main(String[] args) {
		
		// tab est un tableau polymorphe
		Voiture []tab = {new Voiture(),new VCitadine(),new VCourse()};
		
		
		infoV(new Voiture());
		infoV(new VCitadine());
		infoV(new VCourse());

	}

}
