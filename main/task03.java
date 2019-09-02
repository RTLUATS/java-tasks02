package by.htp.task06.main;

import java.util.Random;

public class task03 {
	public static void main(String[] args) {
	
		Random rand = new Random();
		
		int n = 10;
		int[] arr = new int[n];
		int min = 0;
		boolean k = true;
		
		for(int i = 0; i < arr.length; i++) {
			
			do {
				
				k = true;
				
				arr[i] = rand.nextInt(100) - rand.nextInt(100);
				
				if(arr[i] > min) {
					min = arr[i];
					k = false;
				}
				
			}while(k == true);
		}
		
		int k1 = arr.length - 1;
		
		for(int i = 0; i < arr.length; i++, k1--) {
	
			if(arr[i] > arr[k1]) {
				int temp = arr[i];
				arr[i] = arr[k1];
				arr[k1] = temp;
			}
		}
		
		System.out.println("Массив : ");
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + ", ");
		}
	}
}
