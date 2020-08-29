package ex10_10;

public class Ex10_10 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int[] dt = {5, 7, 9, 14, 7, 4, 2};

		graph(dt);
		dot();
	}
	public static void graph(int[] dt)
	{
		for (int i = 0; i < dt.length; i++) {
			while(dt[i] == 0)
				dot();

		}
	}
	public static void dot()
	{
		 System.out.println("#");
	}

}
