package charpt1;

public class Ex_1_1_07 {
	public static void main(String[] args) {
		System.out.println("a");
		double t = 9.0;
		while (Math.abs(t - 9.0/t) > .001)
			t = (9.0/t + t) / 2.0;
		System.out.printf("%.5f\n", t);
		
		System.out.println("b");
		int sum = 0;
		for (int i = 1; i < 1000; i++) 
			for ( int j = 0; j < i; j++)
				sum++;
		System.out.println(sum);
		
		System.out.println("c");
		sum = 0;
		for (int i = 1; i < 1000; i *= 2)
			for (int j = 0; j < 1000; j++)
				sum++;
		System.out.println(sum);
	}
}
