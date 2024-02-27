package class_array;

public class DiamondArray {

	public static void main(String[] args) {
		int[][] A = new int[5][5];
		
		int k = 0; 
		int s = 2;
		int e = 2;
		
		for(int i = 0; i <= 4; i++) {
			for(int j = s; j <= e; j++) {
				k = k + 1;
				A[i][j] = k;
			}
			if(i >= 2) {
				s = s + 1;
				e = e - 1;
			}else {
				s = s - 1;
				e = e + 1;
			}
		}
		
		for(int i = 0; i <= 4; i++) {
			for(int j = 0; j <= 4; j++) {
				System.out.printf("%2d ", A[i][j]);
			}
			System.out.println();
		}
	}

}
