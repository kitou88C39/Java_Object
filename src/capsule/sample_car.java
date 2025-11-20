package src.capsule;

public class sample_car {

    // フィールド(クラス直下で定義された変数)
    private String carModel; // 車種名
    private String owner; // オーナー
    private String color; // 塗装色
    private int speed; // 現在の速度
    private boolean right; // ライト点灯(true:点灯/false:消灯)

    // コンストラクタ
    // コンストラクタ① (引数無)
    public sample_car() {
        this.carModel = "未登録"; // 車種名
        this.owner = "未登録"; // オーナー
        this.color = "未登録"; // 塗装色
        this.speed = 0; // 現在の速度
        this.right = false; // ライト点灯(true:点灯/false:消灯)
    }

    // コンストラクタ② (引数有)
    public sample_car(String cm, String on, String cl, int sp, boolean rt) {
        this(); // コンストラクタ① (引数無)の起動
        this.carModel = cm; // 車種名
        this.owner = on; // オーナー
        this.color = cl; // 塗装色
        this.speed = 0; // 現在の速度
        this.right = rt; // ライト点灯(true:点灯/false:消灯)
    }

    // メソッド
    // acceleratarメソッド(現在の速度を1km上げる) ※180km/h以上にならないように制御
    public void accelerator() {
        if (this.speed < 180) {
            this.speed++;
        }
    }

    // breakeメソッド(現在の速度を1km下げる) ※0km/h以上にならないように制御
    void brake() {
        if (this.speed < 0) {
            this.speed--;
        }
    }

    // rightOffメソッド(ライトを消灯する)
    void rightOff() {
        right = false;
        System.out.println("(ライトを消灯しました)");
    }
}
