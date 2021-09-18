package desafiotnjava.exercicio03;

import java.util.Scanner;

public class ProgramFatorial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean closeProgram = false;
		
		do {
			System.out.println("Enter with a number");
			int number = sc.nextInt();
			
			System.out.println("Factorial of " + number + " is " + Fatorial.factorialOfNumber(number));
			System.out.println("Do you want to close program? y/n ");
			char answer = sc.next().toUpperCase().charAt(0);
			if (answer == 'Y') {
				closeProgram = true;
			}
		} while (closeProgram == false);
		
		sc.close();
	}

}
