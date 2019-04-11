package charpt1;

public class Ex_1_1_16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 6;
		System.out.println(exR1(n));

	}
	
	public static String exR1(int n) {
		// Ex 16
		if (n <= 0) return "";
		return exR1(n - 3) + n + exR1(n - 2) + n;
		// Ex 17
//		String s = exR1(n - 3) + n + exR1(n - 2) + n;
//		System.out.println(s);
//		if (n <= 0) return "";
//		return s;
	}

}
