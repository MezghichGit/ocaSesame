package chapter4.chapter45;

import java.util.function.Predicate;
public class Main {

	public static void main(String[] args) {
		//Predicate p;
		
		Prediction p = (String ch)-> { return ch.length()>10;};  // une expression lambda : version complète
		
		Prediction p3 =  ch->ch.length()>10?true:false;
		
		
		Prediction p2 = ch-> ch.startsWith("oc");  // une expression lambda :version réduite
		
		System.out.println(p.test("ocaocaocaoca"));
		
		System.out.println(p2.test("aocaocaocaoca"));
		
		int tab[] = {4,2,1};
		Pred pr1 = (int[] t) ->{
				    int res = 0;
				 for(int e : t)
				     {
					 res += e;
					 }
				  return res;
			};
		
		System.out.println(pr1.operation(tab));
		
		//Pred pr2 = (a, b)->a*b;
		
		//System.out.println(pr2.operation(10,20));

	}

}
