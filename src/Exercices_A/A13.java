package Exercices_A;

public class A13 {

	public static void main(String[] args) {
		
		String ch = "Je suis Pierre Cry";
		int n = 0;
		boolean flag = true;
		
		//01
		while (flag && n<ch.length()) {if ((ch.charAt(n)) == 'e') {flag = false;}n++;}
		if (!flag) {System.out.println("La chaîne contient la lettre 'e'");}
		else {System.out.println("La chaîne ne contient pas la lettre 'e'");}
		
		//02
		if (ch.indexOf("e") >= 0) {
			System.out.println("La chaîne contient la lettre 'e'");
		} else {
			System.out.println("La chaîne ne contient pas la lettre 'e'");
		}
		
	}

}
