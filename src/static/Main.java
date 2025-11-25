public class Main {
    public static void main(String[] args) {

        // ①Dogクラスのstaticメンバにアクセスできることを確認
        System.out.println("①Dogクラスのstaticメンバにアクセスできることを確認");
        System.out.println(Dog.SCIENTIFIC_NAME);
        System.out.println(Dog.getDogNumber());

        // ②Dogよりインスタンス化&フィールドの確認
        System.out.println("②Dogよりインスタンス化&フィールドの確認");

        System.out.println("1体目");
        Dog moco = new Dog("ToyPoodle", "MOCO");
        System.out.println(moco.getStatus());

        System.out.println("2体目");
        Dog choco = new Dog("WelshCorgi", "CHOCO");
        System.out.println(moco.getStatus());
        System.out.println(choco.getStatus());

        System.out.println("3体目");
        Dog pochi = new Dog("GoldenRetriever", "POCHI");
        System.out.println(moco.getStatus());
        System.out.println(choco.getStatus());
        System.out.println(pochi.getStatus());

        // ③各オブジェクトからstaticメンバへのアクセス確認
        System.out.println("③各オブジェクトからstaticメンバへのアクセス確認");
        System.out.println("<クラスオブジェクトからアクセス>");
        System.out.println(Dog.SCIENTIFIC_NAME);
        System.out.println(Dog.getDogNumber());

    }

}
