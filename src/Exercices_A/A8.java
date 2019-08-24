package Exercices_A;

public class A8 {

	public static void main(String[] args) {
		
		int n = 0;
		for (int i=2014; i<=2020; i++) {
			if (i%5==0) {
				n++;
			}
		}
		
		System.out.println("Il y a " + n + " multiples de 5 entre 2014 et 2020.");

	}

}
