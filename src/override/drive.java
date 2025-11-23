package src.override;

public class drive {
    public static void main(String[] args) {
        // ①車に場に登場させる
        // carクラスのインスタンスを生成
        car car = new car();
        firetruck firetruck = new firetruck();

        // carクラスのメソッドを実行
        car.paint("白");
        car.accelerator();
        car.accelerator();
        car.brake();

        // carクラスのフィールドの値を出力
        System.out.println("carの塗装色:" + car.getColor());
        System.out.println("carの現在の速度:" + car.getSpeed());

        // firetruckクラスのインスタンスを生成
        firetruck firetruck = new firetruck();

        // firetruckクラスのメソッドを実行
        firetruck.paint("赤");
        firetruck.accelerator();
        firetruck.accelerator();

    }
}
