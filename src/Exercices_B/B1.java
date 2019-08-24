package Exercices_B;

import java.util.Random;

public class B1 {

	public static void main(String[] args) {
		
		Random r = new Random();
		int n = 0;
		
		while (n != 99) {
			n = r.nextInt(100);
			System.out.println(n);
		}

	}

}
