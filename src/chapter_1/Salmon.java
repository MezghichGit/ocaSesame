package chapter_1;

public class Salmon {

	int count;
	
	public void Salmon() // m�thode et non un constructeur
	{
		count = 4;
	}
	public static void main(String[] args) {
		
		Salmon s = new Salmon();
		//s.Salmon(); //appel � la m�thode
		System.out.println(s.count);
	}

}
