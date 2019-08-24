package Exercices_B;

import java.util.ArrayList;
import java.util.Random;

public class B3 {

	public static void main(String[] args) {

		Random r = new Random();
		String[] num = {"zéro","un","deux"};
		ArrayList<String> tab = new ArrayList<>();
		
		for (int i=0; i<10; i++) {
			tab.add(num[r.nextInt(num.length)]);
			System.out.println(tab.get(i));
		}

	}

}
