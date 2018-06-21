/*
 * PTra18_04.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package practice18;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

import entity.Player;

public class PTra18_04 {

	/*
	 * PTra19_02で作成したPlayerクラスを使用します
	 */

	public static void main(String[] args) {

		/*
		 * ①
		 * ★ file/BestElevenCandidate.csvの内容を取得し、１行毎にPlayerインスタンスに情報を格納してください
		 * ★ ArrayListを作成して、Playerインスタンスを格納してください
		 */

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

		// ★ ①のArrayListの中からGK1名、DF4名、MF4名, FW2名をランダムで出力してください
		ArrayList<Player> GK = new ArrayList<>();
		ArrayList<Player> DF = new ArrayList<>();
		ArrayList<Player> MF = new ArrayList<>();
		ArrayList<Player> FW = new ArrayList<>();

		Iterator<Player> it = players.iterator();

		while (it.hasNext()) {
			Player hh = it.next();

			hh.getPosition();
			if (hh.getPosition().endsWith("GK")) {
				it.remove();
				GK.add(hh);

			} else if (hh.getPosition().endsWith("DF")) {
				it.remove();
				DF.add(hh);
			} else if (hh.getPosition().endsWith("MF")) {
				it.remove();
				MF.add(hh);
			} else {
				it.remove();
				FW.add(hh);
			}

		}

//		for (Player i : GK) {
//			System.out.println(i.getPosition());
//			System.out.println(i.getName());
//			System.out.println(i.getCountry());
//			System.out.println(i.getTeam());
//		}
//		for (Player i : DF) {
//			System.out.println(i.getPosition());
//			System.out.println(i.getName());
//			System.out.println(i.getCountry());
//			System.out.println(i.getTeam());
//		}
//		for (Player i : MF) {
//			System.out.println(i.getPosition());
//			System.out.println(i.getName());
//			System.out.println(i.getCountry());
//			System.out.println(i.getTeam());
//		}
//		for (Player i : FW) {
//			System.out.println(i.getPosition());
//			System.out.println(i.getName());
//			System.out.println(i.getCountry());
//			System.out.println(i.getTeam());
//		}
		int limitNumber = GK.size();
		int random = new Random().nextInt(limitNumber );
		System.out.println(GK.get(random).getPosition());
		System.out.println(GK.get(random).getName());
		System.out.println(GK.get(random).getCountry());
		System.out.println(GK.get(random).getTeam());
//		System.out.println(GK.get(4).getPosition());
//		System.out.println(GK.get(4).getName());
//		System.out.println(GK.get(4).getCountry());
//		System.out.println(GK.get(4).getTeam());

		int[] answer = new int[4];
		//1~6までの数字を格納
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < DF.size() ; i++) {
			list.add(i);
		}
		//listをシャッフル
		Collections.shuffle(list);

		//３つ取り出しanswer配列に入れる
		for (int i = 0; i < 4; i++) {
			answer[i] = list.get(i);

			System.out.println(DF.get(answer[i]).getPosition());
			System.out.println(DF.get(answer[i]).getName());
			System.out.println(DF.get(answer[i]).getCountry());
			System.out.println(DF.get(answer[i]).getTeam());
		}


		int[] answer1 = new int[4];
		//1~6までの数字を格納
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		for (int i = 0; i < MF.size() ; i++) {
			list1.add(i);
		}
		//listをシャッフル
		Collections.shuffle(list1);

		//３つ取り出しanswer配列に入れる
		for (int i = 0; i < 4; i++) {
			answer1[i] = list1.get(i);

			System.out.println(MF.get(answer1[i]).getPosition());
			System.out.println(MF.get(answer1[i]).getName());
			System.out.println(MF.get(answer1[i]).getCountry());
			System.out.println(MF.get(answer1[i]).getTeam());
		}
		int[] answer2 = new int[2];
		//1~6までの数字を格納
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		for (int i = 0; i < FW.size() ; i++) {
			list2.add(i);
		}
		//listをシャッフル
		Collections.shuffle(list2);

		//３つ取り出しanswer配列に入れる
		for (int i = 0; i < 2; i++) {
			answer2[i] = list2.get(i);

			System.out.println(FW.get(answer2[i]).getPosition());
			System.out.println(FW.get(answer2[i]).getName());
			System.out.println(FW.get(answer2[i]).getCountry());
			System.out.println(FW.get(answer2[i]).getTeam());
		}

	}
}
