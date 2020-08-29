package ex07_06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex07_06 {

	public static void main(String[] args) throws IOException
	{
		// TODO 自動生成されたメソッド・スタブ
		BufferedReader br =
				new BufferedReader(new InputStreamReader(System.in));

		String[] s1 = new String[5];
		System.out.print("配列s1の内容 = ");
		for (String str : s1) {
			System.out.print(str + " ");
		}
		System.out.println("");

		for (int i = 0; i < s1.length; i++) {
			System.out.print("文字列の入力 : ");
			s1[i] = br.readLine();
		}

		System.out.print("配列s1の内容 = ");
		for (String str : s1) {
			System.out.print(str + " ");
		}
		System.out.println("");

		String[] s2 = new String[5];

		for (int i = 0; i < s1.length; i++) {
			s2[i] = s1[i];
		}

		System.out.print("配列s2の内容 = ");
		for (String str : s2) {
			System.out.print(str + " ");
		}
		System.out.println("");
	}

}
