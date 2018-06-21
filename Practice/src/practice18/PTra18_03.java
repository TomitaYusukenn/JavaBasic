/*
 * PTra18_03.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package practice18;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import entity.Player;

public class PTra18_03 {

	/*
	 * PTra19_02で作成したPlayerクラスを使用します
	 */

	public static void main(String[] args) {

		ArrayList<Player> players = new ArrayList<>();

		try (Scanner scanner = new Scanner(new File("file/BestElevenCandidate.csv"))) {

			while (scanner.hasNext()) {

				Player player = new Player();

				String line = scanner.nextLine();

				player.toString(line);

				players.add(player);

			}
		} catch (FileNotFoundException e) {

			System.out.println("ファイルが見つかりません");
		}
//		for (int i = 0; i < players.size(); i++) {
//
//						System.out.println(i + 1);
//						System.out.println(players.get(i).getPosition());
//						System.out.println(players.get(i).getName());
//						System.out.println(players.get(i).getCountry());
//						System.out.println(players.get(i).getTeam());
//						System.out.println("");
//					}

		// ★ ①のArrayListの中から"レアル・マドリード", "バルセロナ"の選手を除外してください

		Iterator<Player>it=players.iterator();

		while(it.hasNext()) {
			Player hh =it.next();



				System.out.println(hh.getName());
				System.out.println(hh.getTeam());
				hh.getTeam();
				String rm = "レアル・マドリード";
				String bs = "バルセロナ";
				if(hh.getTeam().endsWith(rm)) {
					it.remove();
				}else if(hh.getTeam().endsWith(bs)) {
					it.remove();
				}
		}



//		 ★ 削除後のArrayListの中身を全件出力してください
		for (int i = 0; i < players.size(); i++) {

			System.out.println(i + 1);
			System.out.println(players.get(i).getPosition());
			System.out.println(players.get(i).getName());
			System.out.println(players.get(i).getCountry());
			System.out.println(players.get(i).getTeam());
			System.out.println("");
		}

	}
}
