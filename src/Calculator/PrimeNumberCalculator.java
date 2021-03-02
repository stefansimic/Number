package Calculator;

import java.util.List;
import java.util.ArrayList;

public class PrimeNumberCalculator implements ComputingNumber {
	private List<Integer> primeNumbers;
	
	public PrimeNumberCalculator() {
		this.emptyList();
	}
	
	public void emptyList() {
		this.primeNumbers = new ArrayList<Integer>();
	}
	
	public List<Integer> computeNumbers(int tillNumber) {
		for (int index = 2; index < tillNumber; index++) {			
			if (this.isPrimeNumber(index)) {
				this.primeNumbers.add(index);
			}
		}
		
		return this.primeNumbers;
	}
	
	private boolean isPrimeNumber(int number) {
		return this.primeNumbers.stream().filter(value -> number % value == 0).count() == 0;
	}

}
