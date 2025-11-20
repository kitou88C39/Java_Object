package src.capsule;

public class sample_drive {
    public static void main(String[] args) {

        // 車を場に登場させる(sample_carクラスのインスタンス化)

        sample_car chocoCar = new sample_car();
        sample_car mocoCar = new sample_car();
        sample_car pchiCar = new sample_car();

        // 各インスタンスのフィールドの状態を確認(インスタンス化直後)
        System.out.println("各インスタンスのフィールドの状態を確認(インスタンス化直後)");

        System.out.println("<mocoCar>");
        System.out.println("mocoCar.carModel:" + mocoCar.carModel);
        System.out.println("mocoCar.owner:" + mocoCar.owner);
        System.out.println("mocoCar.color:" + mocoCar.color);
        System.out.println("mocoCar.speed:" + mocoCar.speed);
        System.out.println("mocoCar.right:" + mocoCar.right);
        System.out.println("<mocoCar>");
        System.out.println("mocoCar.carModel:" + mocoCar.carModel);
        System.out.println("mocoCar.owner:" + mocoCar.owner);
        System.out.println("mocoCar.color:" + mocoCar.color);
        System.out.println("mocoCar.speed:" + mocoCar.speed);
        System.out.println("mocoCar.right:" + mocoCar.right);

        // 車の情報(初期)の確認（chocoCarインスタンスのフィールドの確認(speedのみ)）
        System.out.println("車の情報(初期)の確認(chocoCarインスタンスのフィールドの確認(speedのみ))");

        System.out.println("<chocoCar>");
        System.err.println("chocoCar.speed:" + chocoCar.speed);

        // acceleratorメソッドの起動&確認
        System.out.println("acceleratorメソッドの起動&確認");

        mocoCar.accelerator();

        System.out.println("<mocoCar>");
        System.out.println("mocoCar.carModel:" + mocoCar.carModel);
        System.out.println("mocoCar.owner:" + mocoCar.owner);
        System.out.println("mocoCar.color:" + mocoCar.color);
        System.out.println("mocoCar.speed:" + mocoCar.speed);
        System.out.println("mocoCar.right:" + mocoCar.right);

        System.out.println("<chocoCar>");
        System.err.println("chocoCar.speed:" + chocoCar.speed);

    }

}
