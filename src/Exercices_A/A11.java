package Exercices_A;

public class A11 {
	
	public static void main(String[] args) {
	
		int[] tab = {2,4,59,8,6,2,5,6,63,7};
		int cpt3 = 0;
		int sumep = 0;
		int sumip = 0;
		int max = tab[0];

		for (int i=0; i<tab.length-1; i++) {
			System.out.print(tab[i] + " ");			//1
			if (tab[i]%3==0) {cpt3++;}				//2
			if (tab[i]%2==0) {sumep=sumep+tab[i];}	//3
			if (i%2==0) {sumip=sumip+tab[i];}		//4
			if (tab[i]>max) {max=tab[i];}			//5			
		}
		
		System.out.println("");
		System.out.println("cpt3 = " + cpt3);
		System.out.println("sumep = " + sumep);
		System.out.println("sumip = " + sumip);
		System.out.println("max = " + max);
		
		///////////////////////////////////////////////////////
		
		int temp = tab[0];							//6
		for (int j=0; j<tab.length-1; j++) {
		    tab[j] = tab[j+1];
		}
		tab[tab.length-1] = temp;

		///////////////////////////////////////////////////////
		
		for (int k=tab.length-1; k>0; k--) {		//7
			System.out.print(tab[k] + " ");
		}
		
	}

}
