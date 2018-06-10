package practice06;
/*
 * PTra06_02.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */

public class PTra06_02 {
	public static void main(String[] args) {

		// ★ 20回繰り返しを行うfor文を記述してください
		//-----for start
		int i;

		for(i=2;i<=21;i++) {



			// ★ 今何回目の処理なのかを出力してください
//			ここの処理を聞く
			if(i%2==1) {
				System.out.println(i-1);
			}


		// ★ 奇数回のときには、「奇数」を出力してください
			else if(i%2==0) {
				System.out.println((i-1)+"回目は奇数です");

			}



		}
		//-----for end
	}
}
