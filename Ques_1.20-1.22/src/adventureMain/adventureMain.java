package adventureMain;

import java.util.Scanner;

import adventureSub.adventureSub;
//adventureMainクラスにadventureSubクラスを継承。
public class adventureMain extends adventureSub {
	public static void main(String[] args) {
		// Name変数を初期化する。
		String Name = null;
		// flagを初期化
		boolean flag = true;
		// flagがtrueである限りループさせる。
		while (flag) {
			//ユーザー名入力を受け付けるScannerオブジェクトの作成。
			Scanner scanner = new Scanner(System.in);
			// 入力されたユーザー名をNameに代入。
			Name = scanner.nextLine();
			//条件式をユーザー名の入力が空でない場合に設定。
			if (!("".equals(Name))) {
				// 条件式が真の場合ループを抜ける。
				flag = false;
			}
		}
		// adventureSubインスタンスの生成
		adventureSub status = new adventureSub();
		// HPに1から1000の間のランダムな数字を設定する。
		status.setHP((int) (Math.random() * 1000) + 1);
		// MPに1から1000の間のランダムな数字を設定する。
		status.setMP((int) (Math.random() * 1000) + 1);
		// ATKに1から1000の間のランダムな数字を設定する。
		status.setATK((int) (Math.random() * 1000) + 1);
		// SPDに1から1000の間のランダムな数字を設定する。
		status.setSPD((int) (Math.random() * 1000) + 1);
		// DEFに1から1000の間のランダムな数字を設定する。
		status.setDEF((int) (Math.random() * 1000) + 1);
		// コンソールに入力された名前を取得し表示。
		System.out.println("こんにちは 「 " + Name + " 」 さん");
		// コンソールにステータスを表示。
		System.out.println("ステータス");
		// getHP()メソッドを使用しコンソールにHPを出力。
		System.out.println("HP:" + status.getHP());
		// getMP()メソッドを使用しコンソールにMPを出力。
		System.out.println("MP:" + status.getMP());
		// getATK()メソッドを使用しコンソールに攻撃力を出力。
		System.out.println("攻撃力:" + status.getATK());
		// getSPD()メソッドを使用しコンソールに素早さを出力。
		System.out.println("素早さ:" + status.getSPD());
		// getDEF()メソッドを使用しコンソールに防御力を出力。
		System.out.println("防御力:" + status.getDEF() + "\n");
		// さあ冒険に出かけよう！とコンソールに出力。
		System.out.println("さあ冒険に出かけよう！");
	}
}