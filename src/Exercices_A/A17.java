package Exercices_A;

public class A17 {

	public static void main(String[] args) {
		
		int[][] matrice = {{1,2,3},{4,5,6},{7,8,9}};
		for (int i=0; i<matrice.length; i++) {
			for (int j=0; j<matrice[0].length; j++) {
				System.out.print(matrice[j][i]);
			}
			System.out.println("");
		}

	}

}
