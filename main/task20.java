package by.htp.task07.main;

public class task20 {
	public static void main(String[] args) {
		
		int n = 10;
		int twoDim[][] = new int[n][];
		
		for(int i = 0; i < n; i++) {
			twoDim[i] = new int [n];
		}
		
		System.out.println("Массив :");
		
		int k = 0, k1 ;
		
		for(int i = 0; i < n; i++) {

			k1 = k;
		
			for(int j = 0; j < n; j++) {
				
				if((k == j) || (k + j + 1 == n) ) {
					twoDim[i][j] = 1;
				}
				
				if((k1 != 0) && (k1 < (n / 2))) {
					twoDim[i][j] = 1;
					k1--;
				}
				
			}
			k++;
		}
		
		k = 0;
		
		for(int i = 0; i < n; i++) {

			k1 = k;
		
			for(int j = n - 1; j > 0; j--) {
				
				if((k1 != 0) && (k1 < (n / 2))) {
					twoDim[i][j] = 1;
					k1--;
				}
				
			}
			k++;
		}
		

		k = 0;
		
		for(int i = n - 1; i > 0; i--) {

			k1 = k;
		
			for(int j = n - 1; j > 0; j--) {
				
				if((k1 != 0) && (k1 < (n / 2))) {
					twoDim[i][j] = 1;
					k1--;
				}
			}
			k++;
		}
		
		k = 0;
		
		for(int i = n - 1; i > 0; i--) {

			k1 = k;
		
			for(int j = 0; j < n; j++) {
				
				if((k1 != 0) && (k1 < (n / 2))) {
					twoDim[i][j] = 1;
					k1--;
				}
				
			}
			k++;
		}
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				System.out.print(twoDim[i][j] + "  ");
			}
			System.out.print("\n");
		}
	}
}
