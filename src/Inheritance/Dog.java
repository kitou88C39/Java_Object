package src.Inheritance;

public class Dog {
    // フィールド
    String voice; // 鳴き声

    // コンストラクタ①：引数なし（デフォルト）
    public Dog() {
        this.voice = "ワンワン"; // デフォルト値
    }

    // コンストラクタ②：引数あり
    public Dog(String v) {
        this.voice = v; // 引数で受け取った値
    }

    // メソッド
    // 吠える
    void bark() {
        System.out.println(voice);
    }
}
