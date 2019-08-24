package Exercices_B;

import java.util.ArrayList;
import java.util.Random;

public class B5 {

	public static void main(String[] args) {

		Random r = new Random();
		ArrayList tab = new ArrayList();
		
		for (int i=0; i<20; i++) {
			tab.add(r.nextInt(20)-10);
			System.out.print(tab.get(i) + " ");
		}
		
		for (int j=0; j<tab.size(); j++) {
			int n = (int) tab.get(j);
			if ((n<0) || (n%2==0)) {
				tab.remove(j);
				j--;
			}
		}
		
		System.out.println("");
		for (int k=0; k<tab.size(); k++) {
			System.out.print(tab.get(k) + " ");
		}

	}

}
