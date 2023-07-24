package sumofseries.com;

import java.util.Scanner;

public class SumOfSeries {

	public static void main(String[] args) {
		// 1/1 + 1/2 + 1/3........1/n
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter A Number");
		int n = sc.nextInt();
		double sum = sumOfNaturalSeries(n);
		System.out.println(sum);
	}

	public static double sumOfNaturalSeries(int n) {
		double sum = 0.0;
		for (double i = 1; i <= n; i++) {
			sum = sum + 1 / i;
		}
		return sum;
	}
}
