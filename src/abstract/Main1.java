public class Main1 {
    public static void main(String[] args) {

        // ①インスタンス化
        Truck truck = new Truck();
        System.out.println("インスタンス化成功");

        // エラー(抽象クラスのインスタンス化は不可)
        AbstractTruck abstract = new AbstractTruck();
        System.out.println("インスタンス化成功");
    }
}
