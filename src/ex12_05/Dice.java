package ex12_05;

public class Dice
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
