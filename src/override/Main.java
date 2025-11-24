package src.override;

class Main {
    public static void main(String[] args) {

        // ①インスタンスを生成
        toyPoodle toyPoodle = new toyPoodle("MOCO", "ストレッチ");
        goldenRetriverer goldenRetriverer = new goldenRetriverer("POCHI", "大食い");

        // ②toStringメソッドの動作確認
        System.out.println("toStringメソッドの動作確認------");
        System.out.println(moco);

        // ③toStringメソッドの起動
        System.out.println();
        System.out.println("toStringメソッドの動作確認------");
        System.out.println(pochi);
    }
}
