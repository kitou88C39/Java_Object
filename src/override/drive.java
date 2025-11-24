package src.override;

public class drive {
    public static void main(String[] args) {
        // ①車に場に登場させる
        // carクラスのインスタンスを生成
        car car = new car();
        firetruck firetruck = new firetruck();

        // ②paintメソッドの起動
        car.paint("白");
        firetruck.paint("赤");

        // ③paintメソッドの起動
        // 時速200km/hまで加速
        for (int i = 0; i < 200; i++) {
            car.accelerator();
            firetruck.accelerator();
        }

        // ④carクラスとfiretruckクラスのフィールド値の出力
        System.out.println("carクラスとfiretruckクラスのフィールド値の出力------");

        System.out.println("car.color       :" + car.getColor());
        System.out.println("car.speed       :" + car.getSpeed());
        System.out.println("firetruck.color :" + firetruck.getColor());
        System.out.println("firetruck.speed :" + firetruck.getSpeed());

    }
}
