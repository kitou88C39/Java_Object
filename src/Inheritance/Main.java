package src.Inheritance;

class Main {
    public static void main(String[] args) {
        ToyPoodle toyPoo1 = new ToyPoodle();
        ToyPoodle toyPoo2 = new ToyPoodle("キャンキャン");
        ToyPoodle moco = new ToyPoodle("MOCO", "ストレッチ", "わんわん");

        System.out.println("toyPoo1インスタンスの確認");
        System.out.println(toyPoo1.name);
        toyPoo1.bark();
        toyPoo1.doSkill();

        System.out.println("toyPoo2インスタンスの確認");
        System.out.println(toyPoo2.name);
        toyPoo2.bark();
        toyPood2.doSkill();
    }

}
