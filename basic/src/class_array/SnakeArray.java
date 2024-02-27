package class_array;

public class SnakeArray {

	public static void main(String[] args) {
		int[][] A = new int[5][5];
		
		int k = 0; 
		boolean sw = true; 
		
		for(int i = 0; i < 5; i++) {
			if(sw) {
				for(int j = 0; j < 5; j++) {
					k = k + 1;
					A[i][j] = k;
				}
				sw = false;
			}else {
				for(int j = 4; j >= 0; j--) {
					k = k + 1;
					A[i][j] = k;
				}
				sw = true;
			}
		}
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5; j++) {
				System.out.print(A[i][j] + "  ");
			}
			System.out.println();
		}
	}

}
