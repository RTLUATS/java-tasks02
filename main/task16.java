package by.htp.task04.main;

import java.util.Random;

public class task16 {
	public static void main(String[] args) {

		int n = 0;
		n = prost(n);
		System.out.println(n);
		print(n);
		
	}

	public static int prost(int a) {
		Random rand = new Random();
		a = rand.nextInt(1000) + 2;
		return a;
	}

	public static void print(int a) {
		
		boolean key;
		
		for (int i = a; i <= (a * 2); i++) {
		
			key = true;
			int j = 2;
			
			while(j < i) {
			
				if(i % j == 0) {
					key = false;
					break;
				}else if((i - 2) % j == 0) {
					key = false;
					break;
				}
				j++;
			}
			
			if (key == true) {
				System.out.println("Пара близнецов : " + i + ", " + (i - 2));
			}
		}
		
	}
}
