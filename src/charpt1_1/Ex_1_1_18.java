package charpt1_1;

public class Ex_1_1_18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("ans: " + mystery(2, 25));
		System.out.println("ans: " + mystery(3, 11));
		System.out.println("ans2: " + mystery2(2, 25));
		System.out.println("ans2: " + mystery2(3, 11));
	}
	
	public static int mystery (int a, int b) {
		if (b == 0) return 0;
		if (b % 2 == 0) return mystery (a + a, b/2);
		return mystery(a + a, b / 2) + a;
	}
	
	public static int mystery2 (int a, int b) {
		if (b == 0) return 1;
		if (b % 2 == 0) return mystery2 (a * a, b/2);
		return mystery2(a * a, b / 2) + a;
	}

}
