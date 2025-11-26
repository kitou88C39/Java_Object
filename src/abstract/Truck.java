package src.abstract;

public class Truck extends AbstractTruck {

    // フィールド
    private String color;
    private int speed;

    // コンストラクタ
    public Truck() {
        // 暗黙的に super() が呼び出される
        this.color = "未登録";
        this.speed = 0;
    }

    // メソッド
    // paintメソッド(色を塗る)※セットできる塗装色『白』『黒』『赤』
    public void paint(String color) {
        if (color.equals("白") || color.equals("黒") || color.equals("赤")) {
            this.color = color;
        }
    }

    // acceleratorメソッド(現在の速度を1km/h上げる)※180km/h以上にはならない制御
    public void accelerator() {
        if (this.speed < 180) {
            this.speed++;
        }

    // brakeメソッド(現在の速度を1km/h下げる)※0km/h以下にはならない制御
    public void brake() {
        if (this.speed > 0) {
            this.speed--;
        }
    }
}}
