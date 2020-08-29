package ex09_07;

class Range
{
	private double min;
	private double max;

	private Range()
	{
		min = 0.0;
		max = 0.0;
	}
	public Range(double min, double max)
	{
		this();
		this.min = min;
		this.max = max;
	}
	public boolean isOk(double a)
	{
		return (a >= min && a < max) ? true : false;
	}
	public String toString()
	{
		return "min : " + min + " - max : " + max;
	}
	public void show()
	{
		System.out.println(toString() + "\n");
	}
	public void showHani(double a)
	{
		if (a >= min && a < max)
			System.out.println(a + "\t範囲内\n");
		else
			System.out.println(a + "\t範囲外\n");
	}

}

public class Ex09_07 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Range range = new Range(50.0, 250.0);

		double[] data = {150.5, 75.1, 35.3, 281.2, 210.3};

		range.show();

		for (int i = 0; i < data.length; i++) {
			range.isOk(data[i]);
			range.showHani(data[i]);
		}

	}

}
