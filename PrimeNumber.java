package Threading;

public class PrimeNumber extends Thread {

	private int fromNumb;
	private int untilNumb;

	public PrimeNumber(int fromNumb, int untilNumb) {
		super();
		this.fromNumb = fromNumb;
		this.untilNumb = untilNumb;
	}

	public void primeNumb() {
		if (fromNumb < 1 || fromNumb > untilNumb) {
			return;
		}

		for (int i = fromNumb; i <= untilNumb; i++) {
			if (isPrime(i)) {
				System.out.println(i);
			}
		}

	}

	private boolean isPrime(int number) {
		int cont = 0;
		for (int i = 1; i <= number; i++) {
			if (number % i == 0) {
				cont++;
			}
		}
		if (cont == 2) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public void run() {
		primeNumb();
	}

}
