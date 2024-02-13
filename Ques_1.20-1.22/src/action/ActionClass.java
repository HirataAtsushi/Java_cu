package action;

//SimpleDateFormatクラスをインポート。
import java.text.SimpleDateFormat;
//Dateクラスをインポート
import java.util.Date;

//MethodClassをインポート
import method.MethodClass;

public class ActionClass {
	public static void main(String[] args) {
		//MethodClassインスタンスの生成
		MethodClass MC = new MethodClass();
		//インスタンス変数に定義した文章を出力。
		System.out.println(MC.japan);
		//インスタンス変数に定義した文章を出力。
		System.out.println(MC.sushi);
		//インスタンス変数に定義した文章を出力。
		System.out.println(MC.food);
		//現在の日時取得
		Date currentDate = new Date();

		//yyyy/MM/dd H:m:s形式を変数にセットしている。
		SimpleDateFormat dateFormat = new SimpleDateFormat("今の現在日時はyyyy/MM/dd H:m:sです");
		//上記を現在の日付に適応する。
		String formattedDate = dateFormat.format(currentDate);

		// コンソールに出力
		System.out.println(formattedDate);
	}
}