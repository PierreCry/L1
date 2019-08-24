package Exercices_A;

public class A16 {

	public static void main(String[] args) {
		
		String phrase = "La rue assourdissante autour de moi hurlait.";
		String new_phrase = "";
		String[] mots = phrase.split(" ");
		
		for (int i=0; i<mots.length; i++) {
		    if (mots[i].length() > 3) {
		    	new_phrase = new_phrase + " " + mots[i]; 
		    }
		}
		
		System.out.println(new_phrase);
		
	}

}
