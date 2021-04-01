package Threading;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		int maxNumber = 0, thread = 0;
		System.out.println("Program to print Prime Numbers with Threads");
		Scanner sc = new Scanner(System.in);

		System.out.print("We will print the prime from 1 to ? ");
		try {
			maxNumber = sc.nextInt() + 1;
		} catch (InputMismatchException e) {
			System.err.println("wrong entry");
			System.exit(0);
		}

		System.out.print("How many threads? ");
		try {
			thread = sc.nextInt();
		} catch (InputMismatchException e) {
			System.err.println("wrong entry");
			System.exit(0);
		}

		int step = maxNumber / thread;
		List<Integer> arrayLimits = new ArrayList<Integer>();
		PrimeNumber p1;

		for (int i = 1; i <= maxNumber; i += step) {
			arrayLimits.add(i);
		}

		for (int i = 0; i < arrayLimits.size() - 1; i++) {
			p1 = new PrimeNumber(arrayLimits.get(i), arrayLimits.get(i + 1) - 1);
			p1.start();
		}

	}
}
