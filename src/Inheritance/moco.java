package src.Inheritance;

public class moco extends dogs {

    // フィールド
    String type = "犬科";

    // メソッド
    // ストレッチ
    void stretch() {
        System.out.println("ストレッチ");
    }

    // スーパークラスも含め、全てのフィールドの情報を表示
    void printAllinfo() {
        System.out.println("name:" + name + "type:" + type + "group:" + group);
    }

    // スーパークラスも含め、全てのメソッドの情報を表示
    void executeAllAction() {
        stretch();
        bark();
        breatheLungs();
    }
}
