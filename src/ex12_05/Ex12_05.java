package ex12_05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

interface iGame
{
	void init();
	void play()  throws IOException;
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
		init( );		// 開始処理

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

class  DiceGame  implements  iGame
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
}

public class Ex12_05 {

	public static void main(String[] args) throws IOException{

		iGame  ig  =  new DiceGame( 6 );

		ig.init();
		ig.play();
		ig.eval();

	}

}
