package charpt1_1;

public class Ex_1_1_26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a = 44.99;
		double b = 22.888;
		double c = 22.887;
		double t = 0;
		if (a > b) { t = a; a = b; b = t; }
		if (a > c) { t = a; a = c; c = t; }
		if (b > c) { t = b; b = c; c = t; }
		System.out.println(a + " " + b + " " + c);
	}

}
