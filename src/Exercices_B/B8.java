package Exercices_B;

public class B8 {

	public static void main(String[] args) {
		
		int[] tab = new int[20];
		int max = tab[0];
		int lower = 10; 
		int higher = 50;
		
		for (int i=0; i<tab.length; i++) {
			tab[i] = (int)(Math.random()*(higher-lower))+lower;
			max = Math.max(max,tab[i]);
			System.out.print(tab[i] + " ");
		}
		
		System.out.println("");
		System.out.println("Le maximun du tableau est " + max);
		
	}

}
