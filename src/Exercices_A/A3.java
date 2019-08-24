package Exercices_A;

public class A3 {

	public static void main(String[] args) {
		
		int an = 2016;
		if (((an%4 == 0) && an%100 != 0) || (an%400 == 0)) {
			System.out.println("L'année " + an + " est bissextile.");
		} else {
			System.out.println("L'année " + an + " n'est pas bissextile.");
		}

	}

}
