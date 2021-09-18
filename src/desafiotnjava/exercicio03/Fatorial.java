package desafiotnjava.exercicio03;

public class Fatorial {
	
	public static int factorialOfNumber(int number) {
		int fact = 1;
		int i;
		
		for (i=1; i <= number; i++) {
			fact = fact * i;
		}
		return fact;
	}

}
