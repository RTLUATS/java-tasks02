package by.htp.task07.main;



public class task01 {
	public static void main(String[] args) {
		
		int twoDim [][] = new int[3][];
		twoDim[0] = new int [4];
		twoDim[1] = new int [4];
		twoDim[2] = new int [4];
		
		for(int i = 0, j = 0; i < 3; i++, j++) {
			
			twoDim[i][j] = 1 ;
			
			
		}
		
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 4; j++) {
				System.out.print(twoDim[i][j] + "	");
			}
			System.out.print("\n");
		}
		
	}
}
