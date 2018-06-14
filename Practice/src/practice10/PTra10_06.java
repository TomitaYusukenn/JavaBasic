package practice10;
/*
 * PTra10_06.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */

public class PTra10_06 {

	/*
	 * PTra10_05で作成したCarクラスを使用します
	 */

	public static void main(String[] args) {

		/*
		 * carインスタンスを3件作成し、それぞれの色、ガソリンを入力して決定してください
		 * 各carインスタンスのrunメソッドを実行して、それぞれ「目的地にまでn時間かかりました。残りのガソリンは、xリットルです」を出力してください。
		 */
		Car [] cars=new Car[3];
		int go=0;
		final int distance=300;

		for(int i=0; i<cars.length;i++) {
			Car car =new Car();
			int Random=new java.util.Random().nextInt(30);
			String line;
			if(Random>=20) {
				line="black";
			}
			else if (10<=Random) {
				line="blue";
			}
			else {
				line="red";
			}
				car.seialNo=(i+1)*100+Random;
				car.color=line;
				car.gasoline=Random+20;
				cars[i]=car;
				for(int z=1;cars[i].gasoline>0;z++) {
					int random=car.run();

					go+=random;
					if(cars[i].gasoline<=0&&go<distance) {
						System.out.println(((i+1)*100+Random)+"番は目的地に到達できませんでした");

					}
					else if(go<distance) {

//						System.out.println("残り"+(distance-go));
					}
					else{
						System.out.println(((i+1)*100+Random)+"番は目的にまで"+(50-cars[i].gasoline)+"時間かかりました。残りのガソリンは"+(cars[i].gasoline)+"です。");
						break;
					}

				}





		}


	}
}
