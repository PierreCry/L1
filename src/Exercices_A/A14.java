package Exercices_A;

public class A14 {

	public static void main(String[] args) {
		
		String ch = "kayak";
		int n=0;
		boolean flag = true;
		
		while (flag && n<(ch.length())/2) {
			if (ch.charAt(n) != ch.charAt(ch.length()-n-1)) {
				flag = false;
			}
			n++;
		}
		
		if (flag) {
			System.out.println(ch + " est un palindrome.");
		} else {
			System.out.println(ch + " n'est pas un palindrome.");
		}

	}

}
