package Exercices_B;

import java.util.ArrayList;
import java.util.Random;

public class B4 {

	public static void main(String[] args) {
		
		Random r = new Random();
		ArrayList tab = new ArrayList();
		
		while (tab.size() < 10) {
			int n = r.nextInt(10);
			if (!tab.contains(n)) {
				tab.add(n);
			}
		}
		
		for (int i=0; i<tab.size(); i++) {
			System.out.println(tab.get(i));
		}

	}

}
