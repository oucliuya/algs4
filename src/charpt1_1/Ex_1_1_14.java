package charpt1_1;

public class Ex_1_1_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N = 8;
		double ans = Math.log(N) / Math.log(2);
		int res = lg(N);
		System.out.println(ans + " " + res);
//		System.out.println(1<<4);
//		System.out.println(1>>4);
	}
	
	public static int lg(int N) {
		int x = 0;
		// N is integer , min(N) = 1;
		if (N >= 1) {
			while (1 << x < N)
				x++;
			if (1 << x > N) 
				x -=1;
		}
		return x;
	}
}
