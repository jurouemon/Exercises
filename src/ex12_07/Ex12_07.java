package ex12_07;

class Product
{
	protected String code;
	protected String name;

	public Product(String code, String name)
	{
		this.code = code;
		this.name = name;
	}
	public String getCode()
	{
		return code;
	}
	public String getName()
	{
		return name;
	}
}
abstract class AbsProduct extends Product
{
	public AbsProduct(String code, String name)
	{
		super(code, name);
	}
	public abstract int price();

}

interface Shipping
{
	String info();
	int shipping();
	int handling();
}

class Handbag extends AbsProduct implements Shipping
{
	private int size;

	public Handbag(String code, String name, int size)
	{
		super(code, name);
		this.size = size;
	}
	public String info()
	{
		return name + "\t" + code + "\t" + String.format("%8d", price()) + "\t"
				+ String.format("%8d", shipping()) + "\t" + String.format("%8d", handling());
	}
	public int shipping()
	{
		switch(size) {
		case 1 :
			return 500;
		case 2 :
			return 700;
		default:
			return 1000;
		}

	}
	public int handling()
	{
		if (size >=2)
			return 200;
		else
			return 0;
	}
	public int price()
	{
		String str = code.substring(0, 3);

		if (str.equals("SIG"))
			return 10000;
		else if (str.equals("SHO"))
			return 12000;
		else
			return 15000;
	}
}

class Chair extends AbsProduct implements Shipping
{
	public Chair(String code, String name)
	{
		super(code, name);
	}

	public String info()
	{
		return name + "\t\t" + code + "\t" + String.format("%8d", price()) + "\t"
				+ String.format("%8d", shipping()) + "\t" + String.format("%8d", handling());
	}

	public int shipping()
	{
		switch(code.charAt(0)) {
		case 'S' :
			return 1200;
		case '0' :
			return 1400;
		default:
			return 2000;
		}

	}

	public int handling()
	{
		return 200;
	}

	public int price()
	{
		switch(code.charAt(0)) {
		case 'S' :
			return 12000;
		case '0' :
			return 20000;
		default:
			return 30000;
		}
	}
}

class Dumbbell extends AbsProduct implements Shipping
{
	private int weight;

	public Dumbbell(String code, String name, int weight)
	{
		super(code, name);
		this.weight = weight;
	}

	public String info()
	{
		return name + "\t" + code + "\t" + String.format("%8d", price()) + "\t"
				+ String.format("%8d", shipping()) + "\t" + String.format("%8d", handling());
	}

	public int shipping()
	{
		switch(weight) {
		case 1 :
			return 300;
		case 2 :
		case 3 :
		case 4 :
			return 400;
		default:
			return 500;
		}
	}

	public int handling()
	{
		return 100;
	}

	public int price()
	{
		String str = code.substring(0, 3);

		if (str.equals("SQR"))
			return 1000;
		else if (str.equals("RND"))
			return 1100;
		else
			return 900;
	}
}

public class Ex12_07 {

	public static void main(String[] args) {

		Shipping[] sp = new Shipping[3];

		System.out.println("品名　　　　　　　CODE　　　価格" + ""
				+ "　　　送料　　　手数料");

		sp[0] = new Handbag("SIG101", "クリスティン", 1);

		sp[1] = new Chair("S203", "藤スツール");

		sp[2] = new Dumbbell("RND11", "丸型ダンベル", 3);

		for (Shipping ship : sp) {
			System.out.println(ship.info());
		}
	}

}
