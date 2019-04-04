package charpt1;

public class Ex_1_1_09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N = 8999999;
		System.out.println(int2Bit(N));
		System.out.println(int2Dec(N));
	}
	
	public static String int2Bit(int N) {
		String s = "";
		for (int n = N; n > 0; n /= 2)
			s = n % 2 + s;
		return s;
	}
	
	public static String int2Dec (int N) {
		String s = "";
		for (int n = N; n > 0; n /= 10)
			s = n % 10 + s;
		return s;
	}

}
