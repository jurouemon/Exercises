package ex09_08;

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

public class Health {

	public static void main(String[] args) {
		
		HealthRecord h = new HealthRecord();

		String[] name = {"佐藤 一郎", "荒川 弘子", "江頭 幸一"};
		double[] height = {170.2, 162.0, 175.5};
		double[] weight = {65.3, 52.5, 82.1};

		for (int i = 0; i < name.length; i++) {
			h = new HealthRecord(name[i], height[i], weight[i]);
			h.show();
			DecimalFormat b1 = new DecimalFormat("#0.00");
			String b2 = b1.format(h.bmi());
			System.out.println("BMI値=" + b2);
		}

	}

}
