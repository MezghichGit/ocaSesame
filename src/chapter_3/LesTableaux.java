package chapter_3;

import java.util.Arrays;

public class LesTableaux {

	
	public static void main(String[] args)
	{
		// Sort d'un tableau
		
		Animal tab[] = {new Animal(12),new Animal(9),new Animal(10)};
		System.out.println("Avant tri");
		for(Animal a : tab)
		{
			System.out.println(a.toString());
		}
		Arrays.sort(tab);
		
		System.out.println("Après tri");
		for(Animal a : tab)
		{
			System.out.println(a.toString());
		}
		
		/*
		 * int tab[] = {10,2,14,8,3,2}; System.out.println("Tab avant Sort"); for(int t
		 * : tab) { System.out.print(t+"\t"); } Arrays.sort(tab);
		 * System.out.println("\nTab après Sort");
		 * 
		 * for(int t : tab) { System.out.print(t+"\t"); }
		 * 
		 * System.out.println(); System.out.println(Arrays.binarySearch(tab, 2));
		 */
		
		/*
		 * // tableau uni-dim int tab[] = new int[3]; tab[0]=1; tab[1]=10; tab[2]=11;
		 * 
		 * int []tab2 = {15,4,23}; System.out.println(tab2.length);
		 * //System.out.println(tab2[3]); String names[] = {"amine","ali"};
		 * 
		 * // tableau multi-dim
		 * 
		 * int[][]t = new int[3][2];
		 * 
		 * int [] t1 [] = new int[3][]; t1[0] = new int[4]; t1[1] = new int[2]; t1[2] =
		 * new int[3]; System.out.println(t1.length); System.out.println(t1[0].length);
		 * 
		 * System.out.println(t1); System.out.println(names);
		 */
	}
}
