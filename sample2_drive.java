class sample2_drive {
    public static void main(String[] args) {

        // ①車を場に登場させる(sample2_carクラスのインスタンス化)
        System.out.println("①車を場に登場させる----------");

        sample2_car chocoCar = new sample2_car();
        sample2_car mocoCar = new sample2_car("クーペ", "モコ", "赤", 100, true);
        sample2_car pochiCar = new sample2_car("トラック", "ポチ", "白", 80, true);

        System.out.println("----------");

        // ②車の情報(初期)の確認(mocoCarインスタンスのフィールドの確認)
        System.out.println("②車の情報(初期)の確認----------");

        System.out.println("<chocoCar>");
        System.out.println("chocoCar.carModel:" + chocoCar.carModel);
        System.out.println("chocoCar.owner:" + chocoCar.owner);
        System.out.println("chocoCar.color:" + chocoCar.color);
        System.out.println("chocoCar.speed:" + chocoCar.speed);
        System.out.println("chocoCar.right:" + chocoCar.right);

        System.out.println("<mocoCar>");
        System.out.println("mocoCar.carModel:" + mocoCar.carModel);
        System.out.println("mocoCar.owner:" + mocoCar.owner);
        System.out.println("mocoCar.color:" + mocoCar.color);
        System.out.println("mocoCar.speed:" + mocoCar.speed);
        System.out.println("mocoCar.right:" + mocoCar.right);

        System.out.println("<pochiCar>");
        System.out.println("pochiCar.carModel:" + pochiCar.carModel);
        System.out.println("pochiCar.owner:" + pochiCar.owner);
        System.out.println("pochiCar.color:" + pochiCar.color);
        System.out.println("pochiCar.speed:" + pochiCar.speed);
        System.out.println("pochiCar.right:" + pochiCar.right);

        System.out.println("----------");

        // ③メソッドの起動＆確認
        System.out.println("③メソッドの起動＆確認----------");

        chocoCar.accelerator(); // chocoCarはacceleratorメソッド起動
        mocoCar.rightOff(); // mocoCarはrightOffメソッド起動
        pochiCar.brake(); // pochiCarはbrakeメソッド起動

        System.out.println("<chocoCar>");
        System.out.println("chocoCar.carModel:" + chocoCar.carModel);
        System.out.println("chocoCar.owner:" + chocoCar.owner);
        System.out.println("chocoCar.color:" + chocoCar.color);
        System.out.println("chocoCar.speed:" + chocoCar.speed);
        System.out.println("chocoCar.right:" + chocoCar.right);

        System.out.println("<mocoCar>");
        System.out.println("mocoCar.carModel:" + mocoCar.carModel);
        System.out.println("mocoCar.owner:" + mocoCar.owner);
        System.out.println("mocoCar.color:" + mocoCar.color);
        System.out.println("mocoCar.speed:" + mocoCar.speed);
        System.out.println("mocoCar.right:" + mocoCar.right);

        System.out.println("<pochiCar>");
        System.out.println("pochiCar.carModel:" + pochiCar.carModel);
        System.out.println("pochiCar.owner:" + pochiCar.owner);
        System.out.println("pochiCar.color:" + pochiCar.color);
        System.out.println("pochiCar.speed:" + pochiCar.speed);
        System.out.println("pochiCar.right:" + pochiCar.right);

        System.out.println("----------");
    }
}
