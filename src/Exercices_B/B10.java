package Exercices_B;

import java.util.Random;

public class B10 {

	public static void main(String[] args) {
		
		Random r = new Random();
		int[] tab = new int[3];
		
		for (int i=0; i<tab.length; i++) {tab[i] = r.nextInt(7);}
		if (contains(tab,4) && contains(tab,2) && contains(tab,1)) {
			System.out.println("421!!");
		}

	}
	
	public static boolean contains (int[] tab, int a) {
		for (int i=0; i<tab.length; i++) {if (tab[i]==a) {return true;}}
		return false;
	}

}
