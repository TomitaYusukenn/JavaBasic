package practice06;
/*
 * PTra06_07.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */

public class PTra06_07 {
	public static void main(String[] args) {

		// ★ for文を使って、以下のような出力になるようにしてください
		/*
		 * 出力結果例
		 * -----------------------------------
		 * □□□□□
		 * ■□□□□
		 * ■■□□□
		 * ■■■□□
		 * ■■■■□
		 * ■■■■■
		 * ■■■■□
		 * ■■■□□
		 * ■■□□□
		 * ■□□□□
		 */
		int i ;
		int z;
		int y;

		for (i=0;i<=5;i++) {
			for(z=0;z<=i-1;z++) {
				System.out.print("■");

			}
			for(y=1;y<=5-i;y++) {
				System.out.print("□");
			}
			System.out.println("");
		}
		for (i=1;i<=4;i++) {


			for(y=1;y<=5-i;y++) {
				System.out.print("■");
			}
			for(z=1;z<=i;z++) {
				System.out.print("□");

			}
			System.out.println("");
		}

	}
}
