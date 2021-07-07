package chapter_3;

import java.util.*;
public class LesCollections {

	
	public static void main(String[] args)
	{
		// Collection non générique
		/*
		ArrayList al = new ArrayList();
		System.out.println(al.isEmpty());  //1- isEmpty
		System.out.println(al.size());     //2- size()
		al.add("Amine");
		al.add(10);                          //3- add(Element e)
		al.add(true);
		System.out.println(al.isEmpty());
		System.out.println(al.size());
		
		System.out.println(al);
		System.out.println(al.contains("AMine"));  //4- contains(Element e)
		System.out.println(al.remove(new Integer(10)));  // 5- remove(Element e); //6-remove(int index)
	    al.clear();   //7-clear pour vider la collection
		System.out.println(al);
		*/
		
		
		// Avant generics(version 4 de java)
		/* 
		ArrayList al = new ArrayList();
		
		//Depuis la version 5 :  utilisation des collections avec generics
		//ArrayList<String> al = new ArrayList<String>();
		//ArrayList<String> al = new ArrayList<>();
		al.add("Amine");
		al.add("Ali");  
		al.add(10);
		al.add("Ahmed");
		
		String ch=null;
		for(Object e : al)
		{
			if(e instanceof String)
			{
				 ch = (String)e;
			}
			System.out.println(ch.length());
		}
		*/
		
		/*
		List<String> l1 = new ArrayList<>(); // possiblité d'affectation à une ArraList ou LinkedList
		
		l1 = new LinkedList<>();
		//l1.
		ArrayList<String> l2 = new ArrayList<>(); // Affectation de l2 a seulement des ArrayList
		//l2 = new LinkedList<>();
		*/
		
		/*
		ArrayList<Integer>li = new ArrayList<>();
		li.add(new Integer(10));  // Autoboxing : primitif =>Object
		li.add(3);
		li.add(11);
		li.add(2);
		int x = li.get(0);  // unboxing : object: Integer =>int(primitif)
		System.out.println(li);
		Collections.sort(li);
		
		System.out.println(li);
		System.out.println(Collections.binarySearch(li,11));*/
		
		// Conversion du tab vers list
		/*
		Integer[] tab = {4,3,10};
		List<Integer> l = Arrays.asList(tab); // avec la méthode asList : la liste et le tableau représente un seul objet qui un tableau donc on ne peut modifier sa taille
		System.out.println(l);
		l.set(0,20);
		System.out.println(l);
		System.out.println(tab[0]);*/
		
		// Conersion de list vers tableau
		
		List<String> l = new ArrayList<>();
		l.add("oca");
		l.add("ocp");
		
		Object[] tab = l.toArray();
		l.add("spring");
		System.out.println(tab.length);
		
	}
}
