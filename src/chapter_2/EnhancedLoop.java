package chapter_2;

public class EnhancedLoop {
	public static void main(String[] args) {

		/*
		 * String names[] = { "Amine", "Hamza", "Cyrine" };
		 * 
		 * for (int i = 0; i < names.length; i++) { System.out.println(names[i]); }
		 * 
		 * 
		 * for(String s : names) { System.out.println(s); }
		 */

		// label, break, continue

		outer : for (int i = 0; i < 10; i++) {
			ab : for (int k = 0; k < 10; k++) {
				if (k == 5)
					continue;
					//break;
					//break outer;
					//continue outer;
				System.out.println(i + "," + k);
			}

		}

		System.out.println("Suite du programme");
	}
}
