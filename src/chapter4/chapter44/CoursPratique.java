package chapter4.chapter44;
import chapter4.chapter43.Cours;
public class CoursPratique extends Cours{

	public void info() {
		System.out.println("Cours Pratiques : "+ super.auteur + " "+this.pages);
	}
	
	public static void main(String args[])
	{
		Cours c = new Cours();
		//c.pages = 20;
		
		CoursPratique cp = new CoursPratique();
		cp.pages = 140;
	}
}
