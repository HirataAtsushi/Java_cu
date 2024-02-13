public class Theme2_2 {
	//フィールド変数（String型）を宣言
	private String animal;
	//フィールド変数（double型）を宣言
	private double length;
	//フィールド変数（int型）を宣言
	private int speed;
	//フィールで変数animalのgetterを作成。
	public String getAnimal() {
		return this.animal;
	}
	//フィールで変数lengthのgetterを作成。
	public double getLength() {
		return this.length;
	}
	//フィールで変数speedのgetterを作成。
	public int getSpeed() {
		return this.speed;
	}
	//フィールド変数animalに引数を代入するsetterを作成
	public void setAnimal(String A ) {
	    this.animal = A;
	}
	//フィールド変数lengthに引数を代入するsetterを作成
	public void setLength(double B) {
	    this.length = B;
	}
	//フィールド変数speedに引数を代入するsetterを作成
	public void setSpeed(int C) {
	    this.speed = C;
	}
}