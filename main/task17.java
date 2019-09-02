package by.htp.task04.main;

import java.util.Random;

public class task17 {
	public static void main(String[] args) {

		Random rand = new Random();

		int k = rand.nextInt(10000);
		System.out.println("Начальное число = " + k);
		System.out.println("Числа Армстронга : ");
		for (int i = 1; i < k; i++) {
			int count = count(i);
			check(i, count);
		}
	}

	public static int count(int temp) {

		int count = 0;

		while (temp != 0) {
			temp /= 10;
			count++;
		}

		return count;
	}

	public static void check(int k, int count) {

		int temp = k;
		int sum = 0;
		int temp1;

		while (temp != 0) {

			temp1 = temp - (temp / 10) * 10;
			sum += temp1;
			temp /= 10;

		}

		if (Math.pow(sum, count) == k) {
			System.out.print(k + " ,");
		}
	}
}
