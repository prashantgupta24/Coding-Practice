package p1;

import java.util.ArrayList;
import java.util.HashMap;

public class DP_Examples {

	public static int count = 0;
	static HashMap fibCount = new HashMap();
	static HashMap values = new HashMap();

	public static void main(String[] args) {

		int n = 28;
		int count = 0;

		/*
		 * for (int i = 1; i < 100; i++) { if(steps(i)!= steps_opt(i))
		 * System.out.println("No. is : "+i); }
		 */
		// System.out.println(steps(n));
		// System.out.println(steps_opt(n));

		knapsack();

	}

	private static int steps_opt(int n) {
		if (n <= 1)
			return 0;

		if (values.get(n) != null)
			return (int) values.get(n);

		System.out.println("Count" + count++);

		if (n % 2 == 0) {
			values.put(n, 1 + min(steps_opt(n / 2), steps_opt(n - 1)));
			return 1 + min(steps_opt(n / 2), steps_opt(n - 1));
		}

		if (n % 3 == 0) {
			values.put(n, 1 + min(steps_opt(n / 3), steps_opt(n - 1)));
			return 1 + min(steps_opt(n / 3), steps_opt(n - 1));
		}

		values.put(n, 1 + steps_opt(n - 1));
		return 1 + steps_opt(n - 1);

		// return 1 + steps(n/2)+ steps(n/3)+ steps(n-1);

	}

	static int steps(int n) {
		if (n == 1)
			return 0;

		if (n % 2 == 0)
			return 1 + steps(n / 2);

		if (n % 3 == 0)
			return 1 + steps(n / 3);

		return 1 + steps(n - 1);

	}

	private static int min(int steps, int steps2) {
		if (steps < steps2)
			return steps;
		else
			return steps2;
	}

	private static int min(int steps1, int steps2, int steps3) {

		if (steps1 < steps2)
			if (steps1 < steps3)
				return steps1;
			else
				return steps3;
		else if (steps2 < steps3)
			return steps2;
		else
			return steps3;

	}

	static int fib(int n) {
		if (n == 0)
			return 0;

		if (n == 1)
			return 1;
		if (fibCount.get(n) != null)
			return (int) fibCount.get(n);
		else {
			System.out.println("Here" + count++ + " : n : " + n);
			fibCount.put(n, fib(n - 1) + fib(n - 2));
			return fib(n - 1) + fib(n - 2);
		}
	}

	static void knapsack() {
		ArrayList<Integer> value = new ArrayList<>();
		value.add(7);
		value.add(9);
		value.add(5);
		value.add(12);
		value.add(14);
		value.add(6);
		value.add(12);

		ArrayList<Integer> time = new ArrayList<>();
		time.add(3);
		time.add(4);
		time.add(2);
		time.add(6);
		time.add(7);
		time.add(3);
		time.add(5);

		int a[][] = new int[8][16];

		for (int i = 0; i <= 7; i++) {
			for (int j = 0; j <= 15; j++) {
				if (i > 0 && j - time.get(i - 1) >= 0) {
					a[i][j] = Math.max(a[i - 1][j],
							a[i - 1][j - time.get(i - 1)] + value.get(i - 1));
				}
			}
		}
		System.out.println(a[7][15]);

		for (int j = 15; j >= 0; j--) {
			System.out.println();
			for (int i = 0; i <= 7; i++) {
				System.out.print(a[i][j] + "  ");

			}
		}

		int n = 0;
		int m = 0;
		int maxProfit = 0;

	/*	for (int i = 0; i < n; i++)
			for (int t = 0; t < m; t++) {
					minTime = min(t,d[i]) - t[i];
					if (minTime < 0) 
						A[i][t] = A[i-1][t];
					else
						A[i][t] = Max(A[i-1][t], p[i] + A[i-t][minTime]);
			}*/

	}
	
	
}