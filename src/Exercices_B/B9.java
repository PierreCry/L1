package Exercices_B;

public class B9 {

	public static void main(String[] args) {
		
		int a = 3;
		int b = 6;
		int c = 2;
		
		double delta = Math.pow(b,2)-4*a*c;
		if (delta < 0) {
			System.out.println("Il n'y a pas de solution");
		} else if (delta == 0) {
			int x0 = -(b/2*a);
			System.out.println("Il y a une solution : " + x0);
		} else if (delta > 0) {
			double x1 = (-b+Math.sqrt(delta))/(2*a);
			double x2 = (-b-Math.sqrt(delta))/(2*a);
			System.out.println("Il y a deux solution : " + x1 + " et " + x2);
		}

	}

}
