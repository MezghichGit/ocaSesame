package chapter4.chapter43;

public class Cours {
	private double prix;  // visible uniquement dans la classe
	String titre;         // visible uniquement dans le package(package private:default)
	protected int pages;  // visible dans le packge et chez le fils même dans un autre package
	public String auteur; // visible partout dans le projet
}
