package chapter4;

public class Etudiant extends Personne{
 String nom = "Fils";  //attribut d'instance avec modificateur de visibilt� default : package private
 int age;
 
 

 public Etudiant(String nom)
 {
	// this(); //appel au constructeur par d�faut
	 //super();  // par d�faut appel au constructeur par d�faut de la classe m�re
	 super(nom);
	 this.nom = nom;
	 System.out.println("Constructeur avec un param");
	
 }
 
 public Etudiant()
 {
	 
	//super("student");
	this("student");
	//super();
	System.out.println("Constructeur par d�faut " + this.nom + " "+super.nom) ;
 }
 

 public Etudiant(String nom, int age)
 {
	 this(nom);
	 //this.nom = nom;
	 this.age = age;
	 System.out.println("Constructeur avec 2 params") ;
	 
 }
}
