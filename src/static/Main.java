public class Main {
    public static void main(String[] args) {

        // ①Dogクラスのstaticメンバにアクセスできることを確認
        System.out.println("①Dogクラスのstaticメンバにアクセスできることを確認");
        System.out.println(Dog.SCIENTIFIC_NAME);
        System.out.println(Dog.getDogNumber());
    }

}
