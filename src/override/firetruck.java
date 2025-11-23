package src.override;

public class firetruck extends car {

    // フィールド
    // ※なし

    // コンストラクタ
    // ※なし

    // メソッド
    // paintメソッド(色を塗る)※セットできる塗装色『赤』のみ
    public void paint(String color) {
        if (color.equals("赤")) {
            super.color = color;
        }
    }

    // acceleratorメソッド(現在の速度を1km/h上げる)※80km/h以上にならないように制御
    public void accelerator() {
        if (super.getSpeed() < 80) {
            super.setSpeed(super.getSpeed() + 1);
        }
    }
}
