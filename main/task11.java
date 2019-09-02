package by.htp.task05.main;

import java.util.Random;

public class task11 {
	public static void main(String[] args) {
		
		Random rand = new Random();
		
		int n = 10;
		int m = 10;
		int l = 5;
		int [] arr = new int [n];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = rand.nextInt(100);
			
			if(arr[i] % m == l) {
				System.out.println(arr[i] + ", ");
			}
		}
	}

}
