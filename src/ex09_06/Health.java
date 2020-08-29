package ex09_06;

import java.text.DecimalFormat;

class HealthRecord
{
	private String name;
	private double height;
	private double weight;

	public HealthRecord()
	{
		name = null;
		height = 0.0;
		weight = 0.0;
	}
	public HealthRecord(String name, double height, double weight)
	{
//		this();
		this.name = name;
		this.height = height;
		this.weight = weight;
	}
	public double bmi()
	{
		return 10000 * weight / (Math.pow(height, 2));
	}
	public String toString()
	{
		return name + "/" + height + "cm/" + weight + "kg ";
	}
	public void show()
	{
		System.out.print(toString());
	}
}
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
		System.out.println(toString());
	}
	public void showHani(double a)
	{
		if (a >= min && a < max)
			System.out.println("---〇\n");
		else
			System.out.println("---×\n");
	}

}

public class Health {

	public static void main(String[] args) {

		HealthRecord h = new HealthRecord();
		Range range = new Range(18.5, 25.0);

		String[] name = {"前田 浩二", "中村 二郎", "本田 末男", "岡村 由紀", "斉藤 真理"};
		double[] height = {178.8, 165.7, 172.1, 158.8, 155.6};
		double[] weight = {70.1, 72.8, 65.5, 51.3, 56.5};

		for (int i = 0; i < name.length; i++) {
			h = new HealthRecord(name[i], height[i], weight[i]);
			h.show();

			DecimalFormat b1 = new DecimalFormat("#0.00");
			String b2 = b1.format(h.bmi());
			System.out.print("BMI値=" + b2);
			double b = Double.parseDouble(b2);

			range.showHani(b);
		}

	}

}
