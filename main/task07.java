package by.htp.task05.main;

import java.util.Random;

public class task07 {
	public static void main(String[] args) {
		
		Random rand = new Random();
		
		int n = 10;
		int z = 28;
		int count = 0;
		int [] arr = new int [n];
		
		System.out.println("Начальная последовательность :");
		
		for(int i = 0; i < arr.length; i++) {
			
			arr[i] = rand.nextInt(100) ; 
			
			System.out.print(arr[i] + ", ");
			
			if(arr[i] > z) {
				count++;
				arr[i] = z;
			}
		}
		
		System.out.println("\nКоличество эллементов больших " + z + " равно = " + count);
		System.out.println("\nКонечная последовательность:");
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + ", ");
		}
		
		
		
		
	}
}
