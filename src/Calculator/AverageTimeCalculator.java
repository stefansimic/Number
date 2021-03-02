package Calculator;

import Timer.MilisecondTimer;
import Timer.Timer;

public class AverageTimeCalculator {
	final private Timer msTimer;
	final private ComputingNumber cn;
	final private long howManyTries;
	final private int computePrimeNumbersTill;
	
	private long timeInMiliseconds = 0;
	
	public AverageTimeCalculator(ComputingNumber cn, long howManyTries, int computePrimeNumbersTill) {
		this.msTimer = new MilisecondTimer();
		this.howManyTries = howManyTries;
		this.computePrimeNumbersTill = computePrimeNumbersTill;
		this.cn = cn;
	}
	
	public void computeAverageTime() {
		for (int i = 0; i < this.howManyTries; i++) {
			this.execute();
			this.cn.emptyList();
		}
		
		System.out.println("average time in seconds is: " + this.calculateAverageTime() * 0.001);
	}
	
	public void executeOnce() {
		this.execute();
		this.cn.emptyList();
		this.timeInMiliseconds = 0;
		System.out.println("Time is: " + msTimer.computeTime());
	}
	
	private void execute() {
		msTimer.startTimer();
		
		this.cn.computeNumbers(this.computePrimeNumbersTill);
		
		msTimer.stopTimer();
	    this.timeInMiliseconds += msTimer.computeTime();
	}
	
	private double calculateAverageTime() {
		return Double.longBitsToDouble(this.timeInMiliseconds) / Double.longBitsToDouble(this.howManyTries);
	}
}