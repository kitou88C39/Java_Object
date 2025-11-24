package src.override;

public class toyPoodle {
    // フィールド
    String name; // 名前
    String skill; // 特技

    // コンストラクタ
    public toyPoodle(String name, String skill) {
        this.name = name;
        this.skill = skill;
    }

    // toStringメソッド(オーバーライド)
    public String toString() {
        return "toyPoodle(name:" + this.name + "/" + "skill:" + this.skill + ")";
    }
}
