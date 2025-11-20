package src.capsule;

public class sample_car {

    // フィールド(クラス直下で定義された変数)
    private String carModel; // 車種名
    private String owner; // オーナー
    private String color; // 塗装色
    private int speed; // 現在の速度
    private boolean right; // ライト点灯(true:点灯/false:消灯)

    // コンストラクタ
    // コンストラクタ① (引数無)
    public sample_car() {
        this.carModel = "未登録"; // 車種名
        this.owner = "未登録"; // オーナー
        this.color = "未登録"; // 塗装色
        this.speed = 0; // 現在の速度
        this.right = false; // ライト点灯(true:点灯/false:消灯)
    }

    // コンストラクタ② (引数有)
    public sample_car(String cm, String on, String cl, int sp, boolean rt) {
        this(); // コンストラクタ① (引数無)の起動
        this.carModel = cm; // 車種名
        this.owner = on; // オーナー
        this.color = cl; // 塗装色
        this.speed = 0; // 現在の速度
        this.right = rt; // ライト点灯(true:点灯/false:消灯)
    }

    // メソッド
    // acceleratarメソッド(現在の速度を1km上げる) ※180km/h以上にならないように制御
    public void accelerator() {
        if (this.speed < 180) {
            this.speed++;
        }
    }

    // breakeメソッド(現在の速度を1km下げる) ※0km/h以上にならないように制御
    public void brake() {
        if (this.speed > 0) {
            this.speed--;
        }
    }

    // rightOnメソッド(ライトを点灯する)
    public void rightOn() {
        this.right = true;
    }

    // rightOffメソッド(ライトを消灯する)
    public void rightOff() {
        this.right = false;
    }

    // klaxonメソッド(クラクションを鳴らす)
    public void klaxon() {
        System.out.println(this.owner + "の車:クラクションを鳴らす");
    }

    // paintメソッド（色を塗る）※セットできる塗装色は『白』『黒』『赤』
    public void paint(String cl) {
        if (checkColor(cl)) {
            this.color = cl;
        }
    }

    // 塗装色が正式なカラーバリエーション(『白』『黒』『赤』)かをチェックする
    private boolean checkColor(String cl) {
        boolean checkResult = false; // チェック結果(初期化:false)

        // 正式なカラーバリエーション(『白』『黒』『赤』)と一致していればcheckResultにtrueを設定
        if (cl.equals("白") || cl.equals("黒") || cl.equals("赤")) {
            checkResult = true;
        }
        return checkResult;
    }

    // getter / setter
    // carModelの getter / setter
    public String getCarModel() {
        return this.carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    // ownerの getter / setter
    public String getOwner() {
        return this.owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    // colorの getter / setter
    public String getColor() {
        return this.color;
    }

    // speedの getter / setter
    public String getSpeed() {
        return this.speed;
    }

    // rightの getter / setter
    public String getRight() {
        return this.right;
    }
}
