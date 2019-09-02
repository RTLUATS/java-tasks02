package by.htp.task06.main;

import java.util.Random; 

public class task04 {
	public static void main(String[] args) {
		
		Random rand = new Random();
		
		int n = 10;
		int[] arr = new int[n];
		int k = 0;
		
		System.out.println("Последовательность :");
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = rand.nextInt(100) - rand.nextInt(100);
			System.out.print(arr[i] + ", ");
		}
		
		System.out.println("\nПоследовательность :");
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr.length; j++) {
				
				if(arr[i] < arr[j]) {
					
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
					k++;
					
				}
			}
		}
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + ", ");
		}
		
		System.out.println("\nколичество перестановок = " + k);
	}
}
