public class sample3_car {

    // フィールド(クラス直下で定義された変数)
    String carModel; // 車種名
    String owner; // オーナー
    String color; // 塗装色
    int speed; // 現在の速度
    boolean right; // ライト点灯(true:点灯/false:消灯)

    // コンストラクタ
    // コンストラクタ① (引数無)
    sample3_car() {
        System.out.println("コンストラクタ① (引数無)");
        carModel = "未登録"; // 車種名
        owner = "未登録"; // オーナー
        color = "未登録"; // 塗装色
        speed = 0; // 現在の速度
        right = false; // ライト点灯(true:点灯/false:消灯)
        System.out.println("-----------------------");
    }

    // コンストラクタ② (引数有)
    sample3_car(String cm, String on, String cl, int sp, boolean rt) {
        this(); // コンストラクタ① (引数無)の起動
        System.out.println("コンストラクタ② (引数有)");
        this.carModel = carModel;
        owner = owner; // オーナー
        color = color; // 塗装色
        speed = speed; // 現在の速度
        right = right; // ライト点灯(true:点灯/false:消灯)
        System.out.println("-----------------------");
    }

    // メソッド
    // acceleratarメソッド(現在の速度を1km上げる)
    void accelerator() {
        speed++;
        System.out.println("(少し速くなった)");
    }

    // breakeメソッド(現在の速度を1km下げる)
    void brake() {
        speed--;
        System.out.println("(少し遅くなった)");
    }

    // rightOffメソッド(ライトを消灯する)
    void rightOff() {
        right = false;
        System.out.println("(ライトを消灯しました)");
    }
}
