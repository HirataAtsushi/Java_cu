package curriculum1_27;

import java.util.Scanner;

import curriculum1_27_2.Curriculum1_27_2;

public class Curriculum1_27 extends Curriculum1_27_2 {

	public static void main(String[] args) {
		// コンソールに文字を入力してくださいと表示。
		System.out.println("コンソールに文字を入力してください");
		String Animal = null;
		// 入力を受け付けるScannerオブジェクトの作成。
		Scanner scanner = new Scanner(System.in);
		// 入力された値をAnimalに代入。
		Animal = scanner.nextLine();
		// 条件式を用いてユーザー名の入力が空でないか、nullでないかを確認。
		if ((Animal == null) || (" ".equals(Animal))) {
			//条件式が真の場合処理Scannerを閉じる
			scanner.close();
			//値が入力されていないと表示。
			System.out.println("値が入力されていません。");
			//処理を終了させる。
			System.exit(0);
		}
		// コンソールに入力された値を:と,で区切る。
		String[] animals = Animal.split("[:,]");
		// Curriculum1_27_2のインスタンス生成。
		Curriculum1_27_2 lion = new Curriculum1_27_2();
		// animalsの要素数よりiが少ない限りループさせる。
		for (int i = 0; i < animals.length; i += 3) {
			// i番目の値を動物名として設定。
			lion.setAnimal(animals[i]);
			// i + 1番目の値をdouble型に変換し体長を設定。
			lion.setLength(Double.parseDouble(animals[i + 1]));
			// i + 2番目の入力された値をint型に変換しスピードに設定。
			lion.setSPD(Integer.parseInt(animals[i + 2]));
			// getAnimal()メソッドを使用しコンソールに動物名を出力。
			System.out.println("\n動物名：" + lion.getAnimal());
			// getLength()メソッドを使用しコンソールに体長を出力。
			System.out.println("体長：" + lion.getLength() + "m");
			// getSPD()メソッドを使用しコンソールに速度を出力。
			System.out.println("速度：" + lion.getSPD() + "km/h");
			// 取得した動物名に応じて学名を表示。
			System.out.println("学名：" + getScientificName(animals[i]));
		}
	}
	
	private static String getScientificName(String animals) {
		// 動物名によって異なる学名を返す設定。
		switch (animals) {
		// 動物名がライオンの場合パンテラ　レオと表示。
		case "ライオン":
			return "パンテラ レオ";
		// 動物名がゾウの場合ロキソドンタ・サイクロティスと表示。
		case "ゾウ":
			return "ロキソドンタ・サイクロティス";
		// 動物名がパンダの場合アイルロポダ・メラノレウカと表示。
		case "パンダ":
			return "アイルロポダ・メラノレウカ";
		// 動物名がチンパンジーの場合パン・トゥログロディテスと表示。
		case "チンパンジー":
			return "パン・トゥログロディテス";
		// 動物名がシマウマの場合チャップマンシマウマと表示。
		case "シマウマ":
			return "チャップマンシマウマ";
		// 動物名がインコの場合不明と表示。
		case "インコ":
			return "不明";
		// すべて当てはまらない場合不明と表示。
		default:
			return "不明";
		}

	}

}
