package chapter_1;

public class PrimitifsType {

	public static void main(String[] args) {
		byte x = -128;
       System.out.println(Byte.MAX_VALUE);
       System.out.println(Byte.MIN_VALUE);
       
       System.out.println(Integer.MAX_VALUE);
       System.out.println(Integer.MIN_VALUE);
       
       System.out.println(Long.MAX_VALUE);
       System.out.println(Long.MIN_VALUE);
       
       int k = 0x21; // nombre dans la base hexadécimale
       int v = 011;  // nombre dans la base octale
       int u = 0b11; // nombre dans la base binaire
       System.out.println(k);
       System.out.println(v);
       System.out.println(u);
       
       int a = 100_000_000;
       double m = 12.5;
       System.out.println(a);
       
       //0x7fffffffffffffffL
       
      // max long : 922_337_2036_854_775_807
       long b = 3_654_775_807L;   // nombre litérale
          //9223372036854775807
       
       float n = 12.5F;  // nombre litérale réel
	}

}
