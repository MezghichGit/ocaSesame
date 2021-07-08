package chapter5.LesInterfaces;

public interface C extends A,B{
	@Override
	 public default void affichage()
		{}

}
