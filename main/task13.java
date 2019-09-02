package by.htp.task05.main;

import java.util.Random;

public class task13 {
	public static void main(String[] args) {
		
		Random rand = new Random();
		
		int n1 = 20;
		int n = 1500;
		int l = 5;
		int m = 3;
		int k = 0;
		int [] arr = new int [n1];
		
		System.out.println("Массив :");
		
		for(int i = 0; i < arr.length; i++) {
			
			arr[i] = rand.nextInt(10000);
			
			if((arr[i] >= l) && (arr[i] <= n) && (arr[i] % m == 0)) {
				k++;
			}
			
			System.out.print(arr[i] + ", ");
		}
		
		System.out.println("\nКол-во чисел кратных " + m + " равно = " + k);
	}

}
