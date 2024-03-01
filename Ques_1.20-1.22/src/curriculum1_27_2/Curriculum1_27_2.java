package curriculum1_27_2;

public class Curriculum1_27_2 {
	// フィールド変数（String型）を宣言
	private String Animal;
	// フィールド変数（double型）を宣言
	private double Length;
	// フィールド変数（int型）を宣言
	private int SPD;
	// フィールドで変数Animalのgetterを作成。
	public String getAnimal() {
		return Animal;
	}
	// フィールドで変数Lengthのgetterを作成。
	public double getLength() {
		return Length;
	}
	// フィールドで変数SPDのgetterを作成。
	public int getSPD() {
		return SPD;
	}
	// フィールド変数Animalに引数を代入するsetterを作成。
	public void setAnimal(String animal) {
		Animal = animal;
	}
	// フィールド変数Lengthに引数を代入するsetterを作成。
	public void setLength(double length) {
		this.Length = length;
	}
	// フィールド変数SPDに引数を代入するsetterを作成。
	public void setSPD(int spd) {
		SPD = spd;
	}
}
