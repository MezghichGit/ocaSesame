package chapter4;

public class Main {
	

	public static void info()
	{
		System.out.println("Pas d'info");
	}
	
	public static void info(String msg)
	{
		System.out.println("info : "+msg);
	}
	
	public static int info(int x, String msg)
	{
		return 0;
	}
	
	
	
	public static void info(String msg1, String msg2)
	{
		info("OCA");
		System.out.println("info : "+msg1  + " "+msg2);
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
