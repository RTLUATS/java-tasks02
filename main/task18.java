package by.htp.task05.main;

import java.util.Random;

public class task18 {
	public static void main(String[] args) {
	
		Random rand = new Random();
		
		int n = 10;
		int [] arr = new int[n];
		boolean key = true;
		
		arr[0] = 2;
		arr[1] = 3;
		
		for(int i = 2; i < arr.length; i++) {
			
			do {
				key = true;
				
				arr[i] = rand.nextInt(5) + 1;
			
				if((arr[i-2] + arr[i-1] + arr[i]) == 10) {
					key = false;
				}
				
			}while(key);
		}
		
		System.out.println("Ключ :");
		
		for(int i = 2; i < arr.length; i++) {
			System.out.print(arr[i] + ", ");
		}
	}
}