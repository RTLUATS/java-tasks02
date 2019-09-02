package by.htp.task06.main;

import java.util.Random;

public class task10 {
	public static void main(String[] args) {

		Random rand = new Random();

		int n = 10;
		int[] arr = new int[n];
		int maxNum = -1;

		System.out.println("Массив1 :");

		for (int i = 0; i < arr.length; i++) {

			arr[i] = rand.nextInt(10);

			if (arr[i] > maxNum) {
				maxNum = arr[i];
			}
			System.out.print(arr[i] + ", ");
		}

		int[] arr2 = new int[maxNum + 1];

		for (int i = 0; i < arr2.length; i++) {
			arr2[i] = 0;
		}

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr2.length; j++) {

				if (arr[i] == j) {
					arr2[j]++;
				}

			}
		}
		System.out.println("\nМассив2 :");

		for (int i = 0; i < arr2.length; i++) {
			System.out.print(arr2[i] + ", ");
		}
		
		int check = -1;
		
		for (int k = 0; k < arr2.length; k++) {

			
			for (int j = 0; j < arr.length; j++) {

				if ((arr2[k] > 0) && (check < j) ) {

					arr[j] = k;
					arr2[k]--;
					check = j;

				}

			}
		}

		System.out.println("\nМассив1 :");

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + ", ");
		}

	}

}
