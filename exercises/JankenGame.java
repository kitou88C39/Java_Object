package exercises;

public class JankenGame {

    /**
     * じゃけんの手を表す定数
     */
    private static final String ROCK = "goo"; // グー
    private static final String SCISSORS = "choki"; // チョキ
    private static final String PAPER = "paa"; // パー

    /**
     * 勝敗を判定するメソッド
     * 
     * @param mokoHand  Mokoが出した手
     * @param pochiHand Pochiが出した手
     * @return 勝敗結果を示す文字列
     */
    public static String determineWinner(String mokoHand, String pochiHand) {

        // 1. あいこの判定
        if (mokoHand.equals(pochiHand)) {
            return "A draw"; // あいこ
        }

        // 2. Mokoの勝利条件の判定
        // MokoがグーでPochiがチョキ
        if (mokoHand.equals(ROCK) && pochiHand.equals(SCISSORS)) {
            return "Moko victory";
        }
        // MokoがチョキでPochiがパー
        if (mokoHand.equals(SCISSORS) && pochiHand.equals(PAPER)) {
            return "Moko victory";
        }
        // MokoがパーでPochiがグー
        if (mokoHand.equals(PAPER) && pochiHand.equals(ROCK)) {
            return "Moko victory";
        }

        // 3. 上記以外の全てのケースはPochiの勝利
        // (例: Moko: goo, Pochi: paa / Moko: paa, Pochi: choki など)
        return "Pochi victory";
    }

    /**
     * メインメソッド：テストケースを実行
     */
    public static void main(String[] args) {

        // テストケース1: あいこ
        runGame("goo", "goo");

        // テストケース2: Pochiの勝利 (paa vs choki)
        runGame("paa", "choki");

        // テストケース3: Mokoの勝利 (choki vs paa)
        runGame("choki", "paa");

        // 追加テストケース: Mokoの勝利 (goo vs choki)
        runGame("goo", "choki");

        // 追加テストケース: Pochiの勝利 (goo vs paa)
        runGame("goo", "paa");
    }

    /**
     * ゲーム結果を出力するヘルパーメソッド
     */
    public static void runGame(String mokoHand, String pochiHand) {
        String result = determineWinner(mokoHand, pochiHand);

        System.out.println("Janken Moko Pochi");
        System.out.println("Moko: " + mokoHand);
        System.out.println("Pochi: " + pochiHand);
        System.out.println("Result: " + result);
        System.out.println("---");
    }
}