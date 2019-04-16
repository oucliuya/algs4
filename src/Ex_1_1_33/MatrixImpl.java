package Ex_1_1_33;

public class MatrixImpl implements Matrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	}

	@Override
	public double dot(double[] x, double[] y) {
		// TODO Auto-generated method stub
		double res = 0;
		for (int i = 0; i < x.length; i++)
			res += x[i] * y[i];
		return res;
	}

	@Override
	public double[][] transpose(double[][] a) {
		// TODO Auto-generated method stub
		int M = a.length;
		int N = a[0].length;
		double res[][] = new double[N][M];
		for (int i = 0; i < N; i++)
			for (int j = 0; j < M; j++)
				res[i][j] = a[j][i];
		return res;
	}

	@Override
	public double[][] mult(double[][] a, double[][] b) {
		// TODO Auto-generated method stub
		int M = a.length;
		int N = a[0].length;
		int R = b.length;
		int T = b[0].length;
		if (N != R)
			return null;
		double[][] ans = new double[M][T];
		for (int i = 0; i < M; i++)
			for (int j = 0; j < T; j++)
				ans[i][j] = this.dot(a[i], transpose(b)[j]);
		return ans;
		
	}

	@Override
	public double[][] mult(double[][] a, double[] x) {
		// TODO Auto-generated method stub
		int M = a.length;
		int N = a[0].length;
		int R = x.length;
		if (N != 1) return null;
		double[][] ans = new double[M][R];
		for (int i = 0; i < M; i++)
			for (int j = 0; j < R; j++)
				ans[i][j] = a[i][0] * x[j];
		return ans;
	}

	@Override
	public double[] mult(double[] y, double[][] a) {
		// TODO Auto-generated method stub
		int R = y.length;
		int M = a.length;
		int N = a[0].length;
		if (R != M)
			return null;
		double[] ans = new double[N];
		for (int i = 0; i < N; i++)
			ans[i] = this.dot(y, this.transpose(a)[i]);
		return ans;
	}

}
