package chapter_3;

public class VarArgs {
	
	public static void somme(int x, int ... val)
	{
		int res = 0;
		
		for(int k =0; k<val.length;k++)
		{
			res = res + val[k];
		}
		System.out.println(res);	
	}
	public static void main(String ... args) {
		//somme(); // avec 0 param�tres
		somme(10); // avec 1 param�tre
		
		somme(10,14,3,4); // avec 1 param�tre
	}
}
