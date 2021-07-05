package chapter_1;

public class Salmon {

	int count;
	
	public void Salmon() // méthode et non un constructeur
	{
		count = 4;
	}
	public static void main(String[] args) {
		
		Salmon s = new Salmon();
		//s.Salmon(); //appel à la méthode
		System.out.println(s.count);
	}

}
