package ex09_09;

public class Ex09_09 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		double[] a = {10.5, 2.3, 3.7};
		double[] b = {1.5, 2.8, 4.1};
		double[] ans = new double[3];

		addArray(a, b, ans);

		for (int i = 0; i < a.length; i++) {
			System.out.println("ans[" + i + "] = " + ans[i]);
		}

	}
	public static double[] addArray(double[] a, double[] b, double[] ans)
	{
		for (int i = 0; i < a.length; i++) {
			 ans[i] += (a[i] + b[i]);
		}
		return ans;
	}
}
