package by.htp.task04.main;

import java.util.Random;

public class task15 {
	public static void main(String[] args) {
		
		int n = 6;
		int k = 15;
		int num = 10;
		int [] mas = new int[num];
		
		init(mas, n, k);
		
		System.out.print("При N = "+ n + " и при К = " + k + " элементы в массиве :");
		
		print(mas);
		
		
	}
	
	public static void init(int [] mas, int n, int k) {
		
		Random rand = new Random();
		
		for(int i = 0; i < mas.length; i++) {
			
			boolean key = true;
			int num = 0;
			
			do {
				
				key = true;
				num = rand.nextInt(1000) + 1;
				int temp = num;
				int temp1 = 0;
				int sum = 0;
				int count = 0;
				
				while(temp != 0) {
					
					temp /= 10;
					count++;
				}
				
				int[] arsup = new int[count];
				temp = num;
				int i2 = 0;
				
				while(temp != 0) {
					
					temp1 = temp - (temp / 10) * 10;
					sum += temp1;
					temp /= 10;
					arsup[i2] = temp1;
					i2++;
					
				}
				
				for(i2 = 0; i2 < arsup.length; i2++) {
					
					if((arsup[i2] > n) || (sum != k)) {
						key = false;
					}
				}
				
			}while(key == false);
			
			mas[i] = num;
		}
		
	}
	
	public static void print(int[] mas) {
		
		for(int i = 0; i < mas.length; i++) {
			System.out.print(mas[i] + ", ");
		}
	}

}
