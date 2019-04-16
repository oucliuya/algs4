package Ex_1_1_33;

public interface Matrix {
	public double dot(double[] x, double[] y);
	public double[][] transpose(double[][] a);
	public double[][] mult(double[][] a, double[][] b);
	public double[][] mult(double[][] a, double[] x);
	public double[] mult(double[] y, double[][] a);
}

