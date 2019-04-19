package charpt1_1;

public class Ex_1_1_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] testArray = { {1,2,3,4},{1,2,3,4}, {1,2,3,4},{1,2,3,4},{1,2,3,4}};
		int M = testArray.length;
		int N = testArray[0].length;
		int[][] res = new int[N][M];
		for (int i =0; i < N; i++)
			for (int j = 0; j < M; j++)
				res[i][j] = testArray[j][i];
		
		for (int i =0; i < N; i++) {
			System.out.println("");
			for (int j = 0; j < M; j++)
				System.out.print(res[i][j]);
		}
				
	}

}
