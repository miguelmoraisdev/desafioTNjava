package desafiotnjava.exercicio01;

import java.util.Scanner;

public class ProgramCalculatePercentage {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter with the valid votes: ");
		Double validVotes = sc.nextDouble();
		
		System.out.println("Enter with the blank votes: ");
		Double blankVotes = sc.nextDouble();
		
		System.out.println("Enter with the null votes: ");
		Double nullVotes = sc.nextDouble();

		System.out.println("Percentage of valid votes: " + CalculatePercentage.getPercetageOfValidVotes(validVotes, blankVotes, nullVotes) + "%");
		System.out.println("Percentage of blank votes: " + CalculatePercentage.getPercetageOfBlankVotes(validVotes, blankVotes, nullVotes) + "%");
		System.out.println("Percentage of null votes: " + CalculatePercentage.getPercetageOfNullVotes(validVotes, blankVotes, nullVotes) + "%");
		
		sc.close();

	}

}
