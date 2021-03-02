package Timer;

public class MilisecondTimer implements Timer {
	private long startTime = 0;
	private long stopTime = 0;
	
	public void startTimer() {
		this.startTime = System.currentTimeMillis();
	}
	
	public void stopTimer() {
		this.stopTime = System.currentTimeMillis();
	}
	
	public long computeTime() {
		return this.calculateTimeDifference();
	}
	

	private long calculateTimeDifference() {
		return this.stopTime - this.startTime;
	}
}
