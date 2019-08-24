package Exercices_A;

public class A4 {

	public static void main(String[] args) {
		
		int a = 5;
		int b = 10;
		int c = 15;
		
		if ((b<a && a<c) || (c<a && a<b)) {
			System.out.println(a);
		} else if ((a<b && b<c) || (c<b && b<a)) {
			System.out.println(b);
		} else if ((a<c && c<b) || (b<c && c<a)) {
			System.out.println(c);
		}

	}

}
