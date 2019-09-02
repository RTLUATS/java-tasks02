package by.htp.task06.main;

import java.util.Random;

public class task08 {
	public static void main(String[] args) {
		
		Random rand = new Random();
		
		int n = 10;
		double[] num = new double[n];
		double[] dem = new double[n];
		boolean ok = true;
		double max = 0;
		double mn;
		
		System.out.println("Дроби :");
		
		for(int i = 0; i < num.length; i++) {
			
			do {
				
				ok = true;
				
				num[i] = rand.nextInt(100) + 1;
				dem[i] = rand.nextInt(100) + 1;
				
				if(num[i] >= dem[i] ) {
					ok = false;
				}
			}while(ok == false);
			
			print(num[i], dem[i]);
			
			if(max <= dem[i]) {
				max = dem[i];
			}
		}
		System.out.println("\nДроби :");
		for(int i = 0; i < num.length; i++) {
			
			if(max % dem[i] == 0) {
				mn = max / dem[i];
				num[i] = num[i] * mn;
				dem[i] = max;
			} else {
				num[i] = ((num[i] / dem[i]) * max);
				dem[i] = max;
			}
			
			print(num[i], dem[i]);
			
		}
		
	}
	
	public static void  print(double num, double dem) {
		System.out.print(num + "/" + dem + ", ");
	}
}
