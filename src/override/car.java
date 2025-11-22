package src.override;

public class car {
    // フィールド
    protected String color; // 塗装色
    private int speed; // 現在の速度

    // コンストラクタ
    // コンストラクタ①(引数無)
    public car() {
        this.color = "未登録"; // 塗装色
        this.speed = 0; // 現在の速度
    }

    // メソッド
    // paintメソッド(色を塗る)※セットできる塗装色は色は『白』『黒』『赤』
    public void paint(String color) {
        if (color == "白" || color == "黒" || color == "赤") {
            this.color = color;
        }
    }

    // acceleratorメソッド(現在の速度1km/h上げる)※180km/hにはならないように制御
    public void accelerator() {
        if (this.speed < 180) {
            this.speed++;
        }
    }

    // brakeメソッド(現在の速度1km/h下げる)※0km/hにはならないように制御
    public void brake() {
        if (this.speed > 0) {
            this.speed--;
        }
    }
}
