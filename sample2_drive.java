class sample2_drive {
    public static void main(String[] args) {

        // 車を場に登場させる(sample_carクラスのインスタンス化)
        System.out.println("車を場に登場させる");

        sample1_car mocoCar = new sample1_car();
        sample1_car chocoCar = new sample1_car();

        // 車の情報(初期)の確認(monoCarインスタンスのフィールドの確認)
        System.out.println("車の情報(初期)の確認(monoCarインスタンスのフィールドの確認)");
        System.out.println("車種名:" + mocoCar.carModel);
        System.out.println("オーナー:" + mocoCar.owner);
        System.out.println("塗装色:" + mocoCar.color);
        System.out.println("現在の速度:" + mocoCar.speed);
        System.out.println("ライト点灯:" + mocoCar.right);

        // メソッドを呼び出す
        car.accelerator(); // 速度を上げる
        car.rightOn(); // ライトを点灯させる
        car.klaxon(); // クラクションを鳴らす
    }

}
