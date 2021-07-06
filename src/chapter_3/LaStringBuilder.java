package chapter_3;

public class LaStringBuilder {

	
	public static void main(String[] args)
	{
        //Version String
		
		/*
		 * String alpha = "";
		 * 
		 * for(char current = 'a'; current <= 'z'; current++) //alpha += current; alpha
		 * = alpha + current;
		 */
		
		//Version StringBuilder
		/*
		 * StringBuilder alpha=new StringBuilder(); System.out.println(alpha.length());
		 * System.out.println(alpha.capacity());
		 * 
		 * alpha.append("ababababababababaababababababababaabc");
		 * System.out.println(alpha);
		 * 
		 * 
		 * System.out.println(alpha.length()); System.out.println(alpha.capacity());
		 */
		
		/*
		 * StringBuilder sb = new StringBuilder(); System.out.println(sb.capacity());
		 * 
		 * StringBuilder sb1 = new StringBuilder(10);
		 * System.out.println(sb1.capacity());
		 * 
		 * String ch = "oca";
		 * 
		 * StringBuilder sb4= new StringBuilder("oca");
		 * 
		 * StringBuilder sb3 = new StringBuilder(sb4); System.out.println(sb3);
		 * //System.out.println(sb3.capacity());
		 */		
		
		
		String ch = "oca";
		StringBuilder sb = new StringBuilder(ch);
		sb.append("ocp");
		ch = sb.toString();
		System.out.println(ch);
}
}
