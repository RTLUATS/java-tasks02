package by.htp.task05.main;

import java.util.Random;

public class task12 {
	public static void main(String[] args) {
		
		Random rand = new Random();
		
		int n = 15;
		double [] arr = new double[n];
		double sum = 0;
		
		for(int i = 0; i < arr.length; i++) {
			
			arr[i] = rand.nextDouble() + rand.nextInt(100);
			
			boolean key = true;
			
			if(i > 1) {
				
				for(int j = 2; j < i; j++ ) {
					
					if(i % j == 0) {
						key = false;
					}
				}
			}
			
			if(key == true) {
				sum += arr[i];
			}
			
		}
		System.out.println(sum);
	}
}
