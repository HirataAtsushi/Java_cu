package adventureSub;

public class adventureSub {
	// フィールド変数（String型）を宣言
	private String Name;
	// フィールド変数（int型）を宣言
	private int HP;
	// フィールド変数（int型）を宣言
	private int MP;
	// フィールド変数（int型）を宣言
	private int ATK;
	// フィールド変数（int型）を宣言
	private int SPD;
	// フィールド変数（int型）を宣言
	private int DEF;


	// フィールドで変数Nameのgetterを作成。
	public String getName() {
		return Name;
	}
	// フィールドで変数HPのgetterを作成。
	public int getHP() {
		
		return HP;
	}
	// フィールドで変数MPのgetterを作成。
	public int getMP() {
		return MP;
	}
	// フィールドで変数ATKのgetterを作成。
	public int getATK() {
		return ATK;
	}
	// フィールドで変数SPDのgetterを作成。
	public int getSPD() {
		return SPD;
	}
	// フィールドで変数DEFのgetterを作成。
	public int getDEF() {
		return DEF;
	}
	// フィールド変数Nameに引数を代入するsetterを作成。
	public void setName(String name) {
		this.Name = name;
	}
	// フィールド変数HPに引数を代入するsetterを作成。
	public void setHP(int hp) {
		this.HP = hp;
	}
	// フィールド変数MPに引数を代入するsetterを作成。
	public void setMP(int mp) {
		this.MP = mp;
	}
	// フィールド変数ATKに引数を代入するsetterを作成。
	public void setATK(int atk) {
		this.ATK = atk;
	}
	// フィールド変数SPDに引数を代入するsetterを作成。
	public void setSPD(int spd) {
		this.SPD = spd;
	}
	// フィールド変数DEFに引数を代入するsetterを作成。
	public void setDEF(int def) {
		this.DEF = def;
	}
}