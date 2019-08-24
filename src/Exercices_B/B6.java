package Exercices_B;

import java.util.ArrayList;
import java.util.Random;

public class B6 {

	public static void main(String[] args) {
		
		Random r = new Random();
		ArrayList tab = new ArrayList();
		
		for (int i=0; i<20; i++) {
			if (r.nextBoolean()) {tab.add(r.nextInt(10));}
			else {tab.add(r.nextBoolean());}
			System.out.print(tab.get(i) + " ");
		}

	}

}
