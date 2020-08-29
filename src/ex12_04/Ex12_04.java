package ex12_04;

interface Information
{
	String className();
	String exp();
}
class DiceGame implements Information
{
	private Dice	dice;	// Diceクラスの変数
	private int		score;	// 得点
	private int		man;	// 人のサイコロの目
	private int		com;	// コンピュータの目

	/*==  コンストラクタ  ==*/
	public  DiceGame( int max )
	{
		dice	=  new Dice( max );
		score	=  0;
		man		=  0;
		com		=  0;
	}

	/*-- ゲーム見出しの表示 --*/
	public  void  init( )
	{
		System.out.println
		("■■　サイコロゲーム　■■");
	}

	/*--  サイコロの目を割り当て、表示する  --*/
	public  void  play( )
	{
		man	  =  dice.randomNumber();
		com	  =  dice.randomNumber();

		System.out.println
			("人の目の数：" + man );

		System.out.println
			("コンピュータの目の数：" + com );
	}

	/*--  スコアを表示する  --*/
	public  void  eval( )
	{
		if ( man > com )
			score	+=  10;
		else if ( man < com )
			score   -=  10;

		System.out.println
		("現在の得点 = " + score );
	}
	public String className()
	{
		return "DiceGameクラスです。";
	}
	public String exp()
	{
		return "  サイコロゲーム(最大の目の数は、" + dice.getMax() + ")です。";
	}
}
class Dice
{
	private		int		max;	// サイコロの目の最大値


	/*==  コンストラクタ  ==*/
	public  Dice( int m )
	{
		max		=  m;
	}


	/*--  変数maxのゲッター  --*/
	public  int  getMax( )
	{
		return		max;
	}


	/*--  対戦して結果を表示  --*/
	public  void  match()
	{
		int		man, com;

		man		=  randomNumber();
		com		=  randomNumber();

		disp( man, com );
	}


	/*--  勝ち負けを判定して表示  --*/
	public  void  disp( int man, int com )
	{
		System.out.println
		("人：" + man + " -- コンピュータ：" + com);

		if ( man > com )
			System.out.println("人の勝ち");
		else if ( man < com )
			System.out.println("コンピュータの勝ち");
		else
			System.out.println("引き分け");
	}


	/*--  サイコロの目の数を戻す  --*/
	public  int  randomNumber()
	{
		return
			(int)(Math.random() * max) + 1;
	}
}
class  Student implements Information
{
	private  String		name;	// 名前
	private  int		age;	// 年齢

	/*==  コンストラクタ  ==*/
	public  Student( String name, int age )
	{
		this.name	=  name;
		this.age	=  age;
	}


	/*--  名前のゲッターメソッド  --*/
	public  String getName( )
	{
		return  name;
	}
	public String className()
	{
		return "Studentクラスです。";
	}
	public String exp()
	{
		return "  名前は" + name + "、年齢は" + age + "です。";
	}

	/*--  年齢のゲッターメソッド  --*/
	public  int getAge( )
	{
		return  age;
	}
}

public class Ex12_04 {

	public static void main(String[] args) {

		Information info = new DiceGame(6);

		System.out.println(info.className());
		System.out.println(info.exp());

		info = new Student("田中　浩", 25);
		System.out.println(info.className());
		System.out.println(info.exp());

	}

}
