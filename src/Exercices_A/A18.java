package Exercices_A;

public class A18 {

	public static void main(String[] args) {
		
		int[][] matrice = {{2,7,6},{9,5,1},{4,3,8}};
		int totalL = 0;
		int totalC = 0;
		int totalD = 0;
		
		for (int i=0; i<matrice.length; i++) {
			for (int j=0; j<matrice[0].length; j++) {
				totalL = totalL + matrice[i][j];
				totalC = totalC + matrice[j][i];
				if (i == j) {totalD = totalD + matrice[i][j];}
			}
		}
		
		if ((totalL == totalC) && (totalC == totalD*3)) {
			System.out.println("La matrice est carré.");
		} else {
			System.out.println("La matrice n'est pas carré.");
		}
		
	}

}
