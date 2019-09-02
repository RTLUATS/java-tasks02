package by.htp.task06.main;

import java.util.Random;

public class task05 {
	public static void main(String[] args) {
		
		Random rand = new Random();
		
		int n = 10;
		int[] arr = new int[n];
		
		System.out.println("Последовательность : ");
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = rand.nextInt(100) - rand.nextInt(100);
			System.out.print(arr[i] + ", ");
		}
		
		System.out.println("\nПоследовательность : ");
		
		for(int j = 1; j < arr.length; j++) {
			
			int key = arr[j];
			int i = j - 1;
			
			while((i >= 0) && (arr[i] > key)) {
				
				arr[i + 1] = arr[i]	;
				i = i - 1;
			}
			arr[i + 1] = key;
		}
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + ", ");
		}
	}
}
