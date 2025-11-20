package src.capsule;

public class sample_drive {
    public static void main(String[] args) {

        // ①車を場に登場させる(sample_carクラスのインスタンス化)

        sample_car chocoCar = new sample_car();
        sample_car mocoCar = new sample_car("クーペ", "モコ", "赤", 100, true);
        sample_car pochiCar = new sample_car("トラック", "ポチ", "白", 80, true);

        // ②各インスタンスのフィールドの状態を確認(インスタンス化直後)
        System.out.println("各インスタンスのフィールドの状態を確認(インスタンス化直後)");

        System.out.println("<chocoCar>");
        System.out.println("chocoCar.getCarModel:" + chocoCar.getCarModel);
        System.out.println("chocoCar.getOwner:" + chocoCar.getOwner);
        System.out.println("chocoCar.getColor:" + chocoCar.getColor);
        System.out.println("chocoCar.getSpeed:" + chocoCar.getSpeed);
        System.out.println("chocoCar.getRight:" + chocoCar.getRight);
        System.out.println("<mocoCar>");
        System.out.println("mocoCar.getCarModel:" + mocoCar.getCarModel);
        System.out.println("mocoCar.getOwner:" + mocoCar.getOwner);
        System.out.println("mocoCar.getColor:" + mocoCar.getColor);
        System.out.println("mocoCar.getSpeed:" + mocoCar.getSpeed);
        System.out.println("mocoCar.getRight::" + mocoCar.getRight);
        System.out.println("<pochiCar>");
        System.out.println("pochiCar.getCarModel:" + pochiCar.getCarModel);
        System.out.println("pochiCar.getOwner:" + pochiCar.getOwner);
        System.out.println("pochiCar.getColor:" + pochiCar.getColor);
        System.out.println("pochiCar.getSpeed:" + pochiCar.getSpeed);
        System.out.println("pochiCar.getRight:" + pochiCar.getRight);

        // ③各インスタンスのメソッドを実行
        chocoCar.paint("黒"); // chocoCar.paintメソッド起動(設定成功)
        mocoCar.paint("金"); // mocoCar.paintメソッド起動(設定失敗)
        pochiCar.rightOn(); // pochiCar.rightOnメソッド起動(trueで設定)

        for (int i = 0; i < 100; i++) {
            chocoCar.accelerator(); // chocoCarはacceleratorメソッド起動(速度が100km/h上昇)
            mocoCar.rightOff(); // mocoCarはrightOffメソッド起動(速度が最大値100km/hになる)
            pochiCar.brake(); // pochiCarはbrakeメソッド起動(速度が最小値100km/hになる)
        }

        // ④各インスタンスのフィールドの状態を確認(メソッド実行後)
        System.out.println("各インスタンスのフィールドの状態を確認(メソッド実行後)");

        System.out.println("<chocoCar>");
        System.out.println("chocoCar.getCarModel:" + chocoCar.getCarModel);
        System.out.println("chocoCar.getOwner:" + chocoCar.getOwner);
        System.out.println("chocoCar.getColor:" + chocoCar.getColor);
        System.out.println("chocoCar.getSpeed:" + chocoCar.getSpeed);
        System.out.println("chocoCar.getRight:" + chocoCar.getRight);
        System.out.println("<mocoCar>");
        System.out.println("mocoCar.getCarModel:" + mocoCar.getCarModel);
        System.out.println("mocoCar.getOwner:" + mocoCar.getOwner);
        System.out.println("mocoCar.getColor:" + mocoCar.getColor);
        System.out.println("mocoCar.getSpeed:" + mocoCar.getSpeed);
        System.out.println("mocoCar.getRight::" + mocoCar.getRight);
        System.out.println("<pochiCar>");
        System.out.println("pochiCar.getCarModel:" + pochiCar.getCarModel);
        System.out.println("pochiCar.getOwner:" + pochiCar.getOwner);
        System.out.println("pochiCar.getColor:" + pochiCar.getColor);
        System.out.println("pochiCar.getSpeed:" + pochiCar.getSpeed);
        System.out.println("pochiCar.getRight:" + pochiCar.getRight);
    }
}
