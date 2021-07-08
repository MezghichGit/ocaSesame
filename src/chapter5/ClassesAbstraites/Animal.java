package chapter5.ClassesAbstraites;

public abstract class Animal {
	 String espece;
	 int age;
	 
	 public void manger()
	 {
		 System.out.println("J'ai faim");
	 }
	 
	 public abstract void sedeplacer();
}
