package ex12_06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

interface iGame
{
	void init();
	void play() throws IOException;
	void eval();
}

class GameSys
{

	BufferedReader  br  =
			new BufferedReader
			( new InputStreamReader(System.in));

	/* ゲームを実行する */
	public  void  playGame( ) throws IOException
	{
		init();		// 開始処理

		do {
			play( );	// ゲームを1回実行する
			eval( );	// 勝敗の判定

		} while ( next( ) );

		System.out.println("終了します。");
	}


	/* ゲームの繰り返しを判定する */
	public  boolean  next( ) throws IOException
	{
		System.out.print
			("\nゲームを続けますか？(y/n)");

		String  str	 =  br.readLine();

		return	( str.charAt(0) == 'n' ) ? false : true;

	}
	void init() {};
	void play()  throws IOException{};
	void eval() {};

}

class  Dice
{
	private		int		max;	// サイコロの目の最大値

	/*  コンストラクタ  */
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
		return		(int)(Math.random() * max) + 1;
	}
}

/*
 *  Rouletteクラス
 */
class  Roulette  extends  Dice
{
	/*==  コンストラクタ  ==*/
	public  Roulette( int max )
	{
		super( max );
	}


	/*--  ルーレットの目の数を戻す  --*/
	public  int  randomNumber()
	{
		return
			(int)(Math.random() * (getMax() + 1));
	}
}


/*
 *  RouletteGameクラス
 */
class  RouletteGame  implements  iGame
{
	private  Roulette 	roulette;	// rouletteクラスのオブジェクト
	private  int		score;		// 得点
	private  int		bet;		// 0:偶数、1:奇数
	private  int		num;		// ルーレットの値


	/*==  コンストラクタ  ==*/
	public  RouletteGame( int max )
	{
		roulette	=  new Roulette( max );
		score		=  0;
		bet			=  0;
	}

	/*-- ゲーム見出しの表示 --*/
	public  void  init( )
	{
		System.out.println
		("■■　ルーレットゲーム　■■");
	}


	/*--  ルーレットの目を割り当て、表示する  --*/
	public  void  play( ) throws IOException   // 付けないとエラー
	{
		BufferedReader br =
				new BufferedReader(new InputStreamReader(System.in));
		System.out.print
		("0(偶数)か1(奇数)のどちらに賭けますか？");

		String  str		=  br.readLine();

		bet		=  Integer.parseInt(str);
		num		=  roulette.randomNumber();

		System.out.println
			("ルーレットの数：" + num );
	}


	/*--  スコアを表示する  --*/
	public  void  eval( )
	{
		if ( num % 2 == bet )
			score	+=  10;
		else
			score   -=  10;

		System.out.println
		("現在の得点 = " + score );
	}
}

public class Ex12_06 {

	public static void main(String[] args) throws IOException{

		iGame ig = new RouletteGame(36);

		ig.init();
		ig.play();
		ig.eval();

	}

}
