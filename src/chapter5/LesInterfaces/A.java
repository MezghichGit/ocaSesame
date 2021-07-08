package chapter5.LesInterfaces;

public interface A {

	public default void info()
	{
		System.out.println("info");
	}
	
	public default void affichage()
	{}
}
