//package ex11_04;

//class Hizuke
//{
//	protected int nen;
//	protected int tuki;
//	protected int hi;
//
//	public Hizuke()
//	{
//		nen = 0;
//		tuki = 0;
//		hi = 0;
//	}
//	public Hizuke(int nen, int tuki, int hi)
//	{
//		this.nen = nen;
//		this.tuki = tuki;
//		this.hi = hi;
//	}
//	public String date()
//	{
//		return "西暦 : " + nen + "年" + tuki + "月" + hi + "日";
//	}
//}
//class HizukeJp extends Hizuke
//{
//	int[] gengouStart = {1912,1926,1989,2019};
//	String[] gengou = {"大正","昭和","平成","令和"};
//
//	public HizukeJp(int nen, int tuki, int hi)
//	{
//		super(nen, tuki, hi);
//	}
////	public String date()
//	{
//		if (nen > 1912 && nen < 1926)
////			return "和暦 : " + gengou[0] + (nen - gengouStart[0]) + "年" + tuki + "月" + hi + "日";
//	}
//}
//
//public class Ex11_04 {
//
//	public static void main(String[] args) {
//
//		Hizuke[] hizuke;
//		hizuke = new Hizuke[2];
//
//		if (args.length < 3)
//		{
//			System.out.print
//			("引数の数が足りません。 ");
//			System.exit(0);
//		}
//		else if (args.length > 3)
//		{
//			System.out.print
//			("引数の数が多すぎます。 ");
//			System.exit(0);
//		}
//
//		int nen = Integer.parseInt(args[0]);
//		int tuki = Integer.parseInt(args[1]);
//		int hi = Integer.parseInt(args[2]);
//
//		int[] date = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
//		if (((nen % 400) == 0) || ((nen % 4 == 0) && (nen % 100) != 0)) {
//			date[1] = 29;
//		}
//
//		if (tuki < 1 || tuki > 12) {
//			System.out.println("月は1～12月を指定してください。");
//
//		}
//
//		if (hi < 1 || hi > 31) {
//			System.out.println("日は1～n(各月の最終日)を指定してください。");
//
//		}
//
//		hizuke[0] = new Hizuke(nen, tuki, hi);
//		hizuke[1] = new HizukeJp(nen, tuki, hi);
//
//		System.out.println(hizuke[0].date());
//		System.out.println(hizuke[1].date());
//
//	}
//}
