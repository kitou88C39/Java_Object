package sample;

class sample1_car {
    // フィールド(クラス直下で定義された変数)
    String carModel = "クーペ"; // 車種名
    String owner = "モコ"; // オーナー
    String color = "RED"; // 塗装色
    int speed = 0; // 現在の速度
    Boolean right = false; // ライト点灯(true:点灯/false:消灯)

    // メソッド(クラス直下で定義された関数)
    // acceleratorメソッド(現在の速度を1km/h上げる)
    void accelerator() {
        speed++;
        System.out.println("(少し速くなった)");
    }

    // brakeメソッド(現在の速度を1km/h下げる)
    void brake() {
        speed--;
        System.out.println("(少し遅くなった)");
    }

    // rightOnメソッド(ライトを点灯させる)
    void rightOn() {
        right = true;
        System.out.println("(ライトを点灯させる)");
    }

    // rightOffメソッド(ライトを消灯させる)
    void rightOff() {
        right = false;
        System.out.println("(ライトを消灯させる)");
    }

    // klaxonメソッド(クラクションを鳴らす)
    void klaxon() {
        System.out.println("(クラクションを鳴らす)");
    }

}