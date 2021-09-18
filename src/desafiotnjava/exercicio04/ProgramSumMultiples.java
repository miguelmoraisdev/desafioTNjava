package desafiotnjava.exercicio04;

import java.util.Scanner;

public class ProgramSumMultiples {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean closeProgram = false;
		
		do {
			System.out.println("Enter with a number: ");
			int number = sc.nextInt();
			System.out.println("The sumn of multiples of 3 or 5 below " + number + " is " + SumMultiples.sumMultiples(number));
			System.out.println("Do you want to close program? y/n ");
			char answer = sc.next().toUpperCase().charAt(0);
			if (answer == 'Y') {
				closeProgram = true;
			}
		} while(closeProgram == false);
		

		sc.close();
	}

}
