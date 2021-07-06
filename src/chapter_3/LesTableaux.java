package chapter_3;

public class LesTableaux {

	
	public static void main(String[] args)
	{
		// tableau uni-dim
		int tab[] = new int[3];
		tab[0]=1;
		tab[1]=10;
		tab[2]=11;
		
		int []tab2 = {15,4,23};
		System.out.println(tab2.length);
		//System.out.println(tab2[3]);
		String names[] = {"amine","ali"};
		
		// tableau multi-dim
		
		int[][]t = new int[3][2];
		
		int [] t1 [] = new int[3][];
		t1[0] = new int[4];
		t1[1] = new int[2];
		t1[2] = new int[3];
		System.out.println(t1.length);
		System.out.println(t1[0].length);
		
		System.out.println(t1);
		System.out.println(names);
		
	}
}
