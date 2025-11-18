public class sample2_car {

    // フィールド(クラス直下で定義された変数)
    String carModel; // 車種名
    String owner; // オーナー
    String color; // 塗装色
    int speed; // 現在の速度
    boolean right; // ライト点灯(true:点灯/false:消灯)

    // コンストラクタ
    // コンストラクタ① (引数無)
    sample2_car() {
        System.out.println("コンストラクタ① (引数無)");
        carModel = "未登録"; // 車種名
        owner = "未登録"; // オーナー
        color = "未登録"; // 塗装色
        speed = 0; // 現在の速度
        right = false; // ライト点灯(true:点灯/false:消灯)
        System.out.println("-----------------------");
    }

    // コンストラクタ② (引数有)
    sample2_car(String cm, String on, String cl, int sp, boolean rt) {
        System.out.println("コンストラクタ② (引数有)");
        carModel = cm; // 車種名
        owner = on; // オーナー
        color = cl; // 塗装色
        speed = 0; // 現在の速度
        right = rt; // ライト点灯(true:点灯/false:消灯)
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
}