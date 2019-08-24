package Exercices_A;

public class A6 {

	public static void main(String[] args) {
		
		int n = 42;
		int result;
		
		int mod = n%5;
		if (mod<=2) {
			result = n-mod;
		} else {
			result = n+5-mod;
		}
		
		System.out.println("Le multiple de 5 le plus proche de " + n + " est " + result);

	}

}
