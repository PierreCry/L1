package Exercices_A;

public class A1 {

	public static void main(String[] args) {
		
		int seconde = 1;
		int minute = 60*seconde;
		int heure = 60*minute;
		int jour = 24*heure;
		double an = 365*jour;
		double siecle = 100*an;
		
		System.out.println("Il y a " + siecle + " secondes dans un siècle.");

	}

}
