package src.Inheritance;

public class ToyPoodle extends Dog {

    // フィールド
    String name; // 名前
    String skill; // 技能

    // コンストラクタ
    public ToyPoodle() {
        this.name = "未設定(name)";
        this.skill = "未設定(skill)";
    }

    public ToyPoodle(String v) {
        super(v);
        this.name = "未設定(name)";
        this.skill = "未設定(skill)";
    }

    public ToyPoodle(String n, String s, String v) {
        super(v);
        this.name = n;
        this.skill = s;
    }

    // メソッド
    void doskill() {
        System.out.println(skill);
    }

}
