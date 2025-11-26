package src.abstract;

public class Truck extends AbstractTruck {

    // フィールド
    private String color;
    private int speed;

    // コンストラクタ
    public Truck() {
        // 暗黙的に super() が呼び出される
        this.color = "未登録";
        this.speed = 0;
    }

    // メソッド
    // paintメソッド(色を塗る)※セットできる塗装色『白』『黒』『赤』
    public void paint(String color){
        if(color.equals("白") || color.equals("黒") || color.equals("赤")){
        this.color = color;
        }
    }
}