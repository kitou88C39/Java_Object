package src.static;

class Dog {
    //定数
    public static final SCIENTIFIC_NAME = "Canis familiaris"; //学部名: カニスファミリアーリス

    //フィールド
    private static int dogNumber = 0;
    private static String breed;
    private String name;
    
    //コンストラクタ
    public Dog(String breed, String name) {
        this.dogNumber++;
        this.breed = breed;
        this.name = name;
    }

    //メソッド
    //getStatusメソッド
    public String getStatus() {
        return "犬の全頭数:" + this.dogNumber + "/名前:" + this.name + "/犬種:" + this.breed;
    }
    
    //getter(dogNumber)
    public static int getDogNumber() {
        return dogNumber;
    }
}
