package Exercices_A;

public class A15 {

	public static void main(String[] args) {
		
		String ch = "La rue assour[dissante autour de m]oihurlait.";
		String new_ch = ch.substring(ch.indexOf('[')+1,ch.indexOf(']'));
		System.out.println(new_ch);

	}

}
