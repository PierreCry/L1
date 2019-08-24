package Exercices_B;

import java.util.Random;

public class B2 {

	public static void main(String[] args) {

		Random r = new Random();
		float[] tab = new float[10];
		
		for (int i=0; i<tab.length; i++) {tab[i] = r.nextFloat();}
		System.out.println(tab[r.nextInt(10)]);
		System.out.println(tab[r.nextInt(10)]);
		System.out.println(tab[r.nextInt(10)]);

	}

}
