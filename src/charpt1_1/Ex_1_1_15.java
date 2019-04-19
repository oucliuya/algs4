package charpt1_1;

public class Ex_1_1_15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {1,2,3,4,4,4,4,4,4,4,3,3,3,3,2,2,2};
		int M = 6;
		int[] res = histogram(a, M);
		for (int i : res)
			System.out.println(i);
	}
	
	public static int[] histogram(int[] a, int M) {
		int[] res = new int[M];
		for (int i = 0; i < M; i++) {
			int cnt = 0;
			for (int j =0; j < a.length; j++)
				if (i == a[j]) cnt++;
			res[i] = cnt;
		}			
		return res;
	}

}
