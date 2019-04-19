package charpt1_1;

public class Ex_1_1_30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println(isPrime(10,5));
		int N = 10;
		boolean a[][] = new boolean[N][N];
		for (int i = 0; i < N; i++)
			for (int j = 0; j < N; j++)
				a[i][j] = isPrime(i, j);
		
		for (int i = 0; i < N; i++) {
			System.out.println();
			for (int j = 0; j < N; j++)
				System.out.print(a[i][j] + " ");
		}
	}
	
	public static boolean isPrime (int i, int j) {
		if (i == 0 || j ==0) return true;
		sortInt(i, j);
		int t;
		while ((t = i % j) > 0) {
			i = j;
			j = t;
		}
		return j == 1;
	}
	
	public static void sortInt (int i, int j) {
		int tmp;
		if (i < j) {
			tmp = i;
			i = j;
			j = tmp;
		}
	}

}
