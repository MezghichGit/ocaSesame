package chapter5.LesInterfaces;

//public interface Vehicule {  // public abstract interface Vahicule {
public abstract interface Vehicule {
	
	
	//void info();
	//public abstract void info();
	
	//int val =100;
	//public static final int val=100;
	public default void info() {}
}
