package starter;

import Calculator.AverageTimeCalculator;
import Calculator.PrimeNumberCalculator;
import Timer.MilisecondTimer;
import Timer.Timer;

public class Starter {

	public static void main(String[] args) {
		System.out.println("start");
		Timer timer = new MilisecondTimer();
		timer.startTimer();
		
		
		AverageTimeCalculator atc = new AverageTimeCalculator(new PrimeNumberCalculator(), Long.valueOf(300), 10000);
		atc.computeAverageTime();
		// atc.executeOnce();
		
		
		timer.stopTimer();
		System.out.println("end! " + timer.computeTime());
	}

}
