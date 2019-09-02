package by.htp.task07.main;

import java.util.Random;
import java.util.Scanner;

//Задание под номером 10

public class task02 {
	public static void main(String[] args) {
		
		Random rand = new Random();
		Scanner in = new Scanner(System.in);
		
		System.out.print("Please enter integer num 'k'  < 5 = ");
		
		
		while(!(in.hasNextInt())) {
			
			System.out.println("\nError!Enter again");
			
			in.next();
		}
		
		
		int k = in.nextInt();
	
		System.out.print("Please enter integer num 'p'  < 5 = ");
		
		
		while(!(in.hasNextInt())) {
			
			System.out.println("\nError!Enter again");
			
			in.next();
		}
		
		
		int p = in.nextInt();
		
		int n = 5;
		
		int twoDim[][] = new int[5][];
		for(int i = 0; i < n; i++) {
			twoDim[i] = new int [5];
		}
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				
				twoDim[i][j] = rand.nextInt(100);
				System.out.print(twoDim[i][j] + "  ");
			}
			System.out.print("\n");
		}
		
		System.out.println("\nRow == " + k + " :");
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				
				if(k == i + 1) {
					
					System.out.print(twoDim[i][j] + "  ");
				}
			}
		}
		
		System.out.println("\nColumn == " + p + " :");
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				
				if(p == j + 1) {
					
					System.out.print(twoDim[i][j] + "  ");
				}
			}
		}
		
		in.close();
		
	}
}
