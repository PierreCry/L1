package Exercices_A;

public class A9 {

	public static void main(String[] args) {
		
		int c = 5;
		
		for (int i=0; i<c; i++) {
			for (int j=0; j<c; j++) {
				if (i%2==0) {
					if (j%2==0) {
						System.out.print(0);
					} else {
						System.out.print(1);
					}
				} else {
					if (j%2==0) {
						System.out.print(1);
					} else {
						System.out.print(0);
					}
				}
			}
			System.out.println("");
		}

	}

}
