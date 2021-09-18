package desafiotnjava.exercicio02;

import java.util.Scanner;

public class ProgramSwapVect {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter with vect's lenght: ");
		int n = sc.nextInt();
		
		int i;
		int vect[] = new int[n];
		for (i=0; i < n; i++) {
			System.out.println("Enter with a value: ");
			int value = sc.nextInt();
			vect[i] = value;
		}
		
		/*for (i=0; i < n; i++) {
			System.out.print(vect[i]);
		}
		*/
		SwapVect.swapVect(vect);
		
		for (i=0; i < n; i++) {
			System.out.print(vect[i]);
		}
		sc.close();
	}

}
