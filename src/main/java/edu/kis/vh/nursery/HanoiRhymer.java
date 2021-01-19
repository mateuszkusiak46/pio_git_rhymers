package edu.kis.vh.nursery;

/**
 * Klasa obslugujaca stos
 */
public class HanoiRhymer extends DefaultCountingOutRhymer {
	/**
	 * Całkowita ilosc dodanych elementow
	 */
	private int totalRejected = 0;

	/**
	 *	Metoda zwracajaca liczbe dodanych elementow
	 * @return Zwraca całkowita ilosc dodanych elementow
	 */
	public int reportRejected() {
		return totalRejected;
	}

	/**
	 *	Metoda zwiekszajaca stos
	 * @param in Liczba dodawana do stosu
	 */
	@Override
	public void countIn(int in) {
		if (!callCheck() && in > peekaboo())
			totalRejected++;
		else
			super.countIn(in);
	}

}
