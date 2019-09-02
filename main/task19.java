package by.htp.task04.main;

public class task19 {
	public static void main(String[] args) {
		int sum = 0;
		int n = 3;
		
		sum = nech(sum, n);
		chet(sum,n);
	}
	
	public static int nech(int sum, int n) {
		
		int temp, temp1;
		boolean  key = true;
		
		for(int i =(int)( Math.pow(10, n)); i < (int)( Math.pow(10, n + 1)); i++ ) {
			
			temp = i;
			key = true;
			
			while(temp != 0) {
				
				temp1 = temp - (temp / 10) * 10;
				
				if(temp1 % 2 == 0) {
					key = false;
				}
				temp /= 10;
			}
			if (key) {
				sum +=i; 
			}
		}
		return sum;
	}
	
	public static void chet(int sum, int n) {
		
		int temp = sum;
		int temp1;
		int k = 0;
		
		while(temp != 0) {
			
			temp1 = temp - (temp / 10) * 10;
			
			if(temp1 % 2 == 0) {
				k++;
			}
			temp /= 10;
		}
		
		System.out.println("Сумма "+ n + "-значных нечётных равна : " + sum + " и тут есть " + k + " чётных цифр");
	}
}
