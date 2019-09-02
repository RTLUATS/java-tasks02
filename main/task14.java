package by.htp.task05.main;

import java.util.Random;

public class task14 {
	public static void main(String[] args) {
		
		Random rand = new Random();
		
		int n = 10;
		int min = 100;
		int max = 0;
		int [] a = new int [n];
		
		for(int i = 0; i < a.length;i++) {
			
			a[i] = rand.nextInt(100);
			
			if((i + 1) % 2 == 0) {
				
				if(max < a[i]) {
					max = a[i];
				}
		
			}else {
				
				if(min > a[i]) {
					min = a[i];
				}
			}
			
		}
		int sum = min + max;
		
		System.out.println("Сумма равна = " + sum);
	}

}
