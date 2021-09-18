package desafiotnjava.exercicio01;

public class CalculatePercentage {

	public static double getPercetageOfValidVotes(Double validVotes, Double blankVotes, Double nullVotes) {
		Double totalVotes = validVotes + blankVotes + nullVotes;
		return (validVotes / totalVotes * 100);
	}
	
	public static double getPercetageOfBlankVotes(Double validVotes, Double blankVotes, Double nullVotes) {
		Double totalVotes = validVotes + blankVotes + nullVotes;
		return (blankVotes / totalVotes * 100);
	}
	
	public static double getPercetageOfNullVotes(Double validVotes, Double blankVotes, Double nullVotes) {
		Double totalVotes = validVotes + blankVotes + nullVotes;
		return (nullVotes / totalVotes * 100);
	}

}
