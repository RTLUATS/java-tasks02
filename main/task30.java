package by.htp.task07.main;

import java.util.Random;

public class task30 {
	public static void main(String[] args) {
		
		Random rand = new Random();
		
		int n = 10;
		int twoDim[][] = new int [n][];
		
		for(int i = 0; i < n; i++) {
			twoDim[i] = new int [20];
		}
		
		System.out.println("\nМассив :");
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < (n * 2); j++) {
				twoDim[i][j] = rand.nextInt(16);
				System.out.print(twoDim[i][j  ] + "   ");
			}
			System.out.print("\n");
		}
		
		int k = 0;
		
		System.out.println("\nНомера строк :");
		
		for(int i = 0; i < n; i++) {
			k = 0;
			for(int j = 0; j < (n * 2); j++) {
				if(twoDim[i][j] == 5) {
					k++;
				}
			}
			
			if(k >= 3) {
				System.out.print(i + ",  ");
			}
			
		}
		
	}
}
