package by.htp.task07.main;

import java.util.Random;

public class task40 {
	public static void main(String[] args) {
		
		Random rand = new Random();
		
		int n = 4;
		
		int twoDim[][] = new int [n][];
		
		for(int i = 0; i < n ; i++) {
			twoDim[i] = new int [n];
		}
		
		boolean okkay = true;
		boolean good = true;
		int sum = n *(n * n + 1) / 2;  
		int check = sum;
		
		do {
			
			okkay = true;
			
			for(int i = 0; i < n; i++) {
				do {
					good = true;
					check = sum;
					for(int j = 0; j < n; j++) {
					
						twoDim[i][j] = rand.nextInt(n * n) + 1;
						check -= twoDim[i][j];
					}
					
					if(check != 0) {
						good = false;
					}
					
				}while(!good);
			}
			
			for(int j = 0; j < n; j++) {
				
				check = sum;
				
				for(int i = 0; i < n; i++) {
					check -= twoDim[i][j];
				}
				if(check != 0) {
					okkay = false;
					break;
				}
			}
			
			if(okkay) {
				check = sum;
				for(int j = 0; j < n; j++) {
					for(int i = 0; i < n; i++) {
						if(j == i) {
							check -= twoDim[i][j];
						}
					}
				}
				if(check != 0) {
					okkay = false;
					
				}
			}
			
			if(okkay) {
				
				check = sum;
				
				for(int i = 0; i < n; i++) {
					for(int j = 0; j < n; j++) {
							if(i + j + 1 == n) {
								check -= twoDim[i][j];
							}
					}
				}
				if(check != 0) {
					okkay = false;
				}
			}
			
		}while(!okkay);
		
		System.out.println("Магический квадрат :");
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				System.out.print(twoDim[i][j] + "  ");
			}
			System.out.print("\n");
		}
	}
}
