package desafiotnjava.exercicio02;

public class SwapVect {

	public static void swapVect(int vect[]) {
		int j;
		int i;
		boolean control;
		for (i=0; i<vect.length; i++) {
			control = true;
			for (j=0; j < vect.length-1; j++) {
				if (vect[j] > vect[j+1]) {
					int aux;
					aux = vect[j];
					vect[j] = vect[j+1];
					vect[j+1] = aux;
					control = false;
				}
			}
			if (control == true) {
				break;
			}
		}
		
	}
}
