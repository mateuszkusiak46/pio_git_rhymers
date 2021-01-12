package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

	private static final int STAT_12 = 12;
	private static final int STAT_1 = -1;
	private final int[] numbers = new int[STAT_12];

	public static int getStat12() {
		return STAT_12;
	}

	public static int getStat1() {
		return STAT_1;
	}

	public int getTotal() {
		return total;
	}


	private int total = STAT_1;


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

	public int[] getNumbers() {
		return numbers;
	}
}
