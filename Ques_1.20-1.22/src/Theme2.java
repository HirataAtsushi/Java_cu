public class Theme2 {
	/*
	 	
	 	下記がコンソールに出力されるように作成してください
	 	※thisとsetterとgetterとフィールドを使ってください
	 	
	  	動物名：ライオン
		体長：2.1m
		速度：80km/h
	 	
	 */
	public static void main(String[] args) {
		//インスタンス生成。
		Theme2_2 theme2 = new Theme2_2();
		//setterを使ってフィールド変数animalに引数（ライオン）を代入
		theme2.setAnimal("ライオン");
		//setterを使ってフィールド変数lengthに引数（2.1）を代入
		theme2.setLength(2.1);
		//setterを使ってフィールド変数speedに引数（80）を代入
		theme2.setSpeed(80);
		//getterを使用してフィールド変数animalの値を取得しコンソールに出力。
		System.out.println("動物名：" + theme2.getAnimal());
		//getterを使用してフィールド変数lengthの値を取得しコンソールに出力。
		System.out.println("体長：" + theme2.getLength() + "m");
		//getterを使用してフィールド変数speedの値を取得しコンソールに出力。
		System.out.println("速度：" + theme2.getSpeed() + "km/h");
	}
}