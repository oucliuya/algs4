package Ex_1_1_33;

public class MatrixTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Matrix ma = new MatrixImpl();
		double[] x = {1.1, 2.2 , 3.3, 4.4, 5.5};
		double[] y = {4.4, 5.5 , 6.6, 7.7, 8.8};
		System.out.println("vector * vector");
		System.out.println(ma.dot(x, y));
		
		double[][] a = { {1,2,3,4},{1,2,3,4}, {1,2,3,4},{1,2,3,4},{1,2,3,4}};
		System.out.println("transpose:");
		printMatrix(ma.transpose(a));
		
		double[][] b = { {1,2,3,4},{1,2,3,4}, {1,2,3,4},{1,2,3,4},{1,2,3,4}};
		double[][] c = { {1,2,3,4,5},{1,2,3,4,5}, {1,2,3,4,5},{1,2,3,4,5}};
		System.out.println("matrix * matrix:(not match)");
		printMatrix(ma.mult(a, b));
		System.out.println("matrix * matrix:(match)");
		printMatrix(ma.mult(a, c));
		System.out.println("vector * matrix:");
		printMatrix(ma.mult(y, a));
		
		double[][] d = {{1}, {2}, {3}, {4}, {5}};
		System.out.println("matrix * vector:");
		printMatrix(ma.mult(d, x));
		
		
	}
	
	
	public static void printMatrix(double[] m) {
		System.out.println("\n");
		if (m == null) {
			System.out.println("\nnull");
			return;
		}
		for (double each : m) {
			System.out.print(each + " ");
		}
		System.out.println("\n");
	}
	
	public static void printMatrix(double[][] m) {
		if (m == null) {
			System.out.println();
			System.out.println("\nnull");
			return;
		}
		for (double[] row : m) {
			System.out.println();
			for (double each : row)
				System.out.print(each + " ");
		}
		System.out.println("\n");
	}
}
