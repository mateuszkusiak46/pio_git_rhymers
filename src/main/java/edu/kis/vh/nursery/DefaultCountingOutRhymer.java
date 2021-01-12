package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

	public static final int STAT_12 = 12;
	public static final int STAT_1 = -1;
	private int[] numbers = new int[STAT_12];

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public int total = STAT_1;


	public void countIn(int in) {
		if (!isFull())
			numbers[++total] = in;
	}

	public boolean callCheck() {
		return total == -1;
	}
		
	public boolean isFull() {
		return total == 11;
	}
		
	protected int peekaboo() {
		if (callCheck())
			return -1;
		return numbers[total];
	}
			
	public int countOut() {
		if (callCheck())
			return -1;
		return numbers[total--];
	}

}
