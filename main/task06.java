package by.htp.task06.main;

import java.util.Random;

public class task06 {
	public static void main(String[] args) {

		Random rand = new Random();

		int n = 10;
		int[] arr = new int[n];
		int temp;

		System.out.println("Массив : ");

		for (int i = 0; i < arr.length; i++) {
			arr[i] = rand.nextInt(100);
			System.out.print(arr[i] + ", ");
		}

		boolean key = false;

		while(key != true) { 

			key = true;
			int j = 0;

			while (j < arr.length - 1) {

				if (j < 0) {

					j = 0;

				}

				if (arr[j] <= arr[j + 1]) {

					j = j + 1;

				} else {

					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					j = j - 1;
				}

			}

			int norm = arr[0];

			for (int i = 1; i < arr.length; i++) {

				if (norm <= arr[i]) {

					norm = arr[i];

				} else {

					key = false;

				}

			}

		} 

		System.out.println("\nМассив : " + key);

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + ", ");
		}
	}
}
