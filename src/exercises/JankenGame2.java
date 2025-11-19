package src.exercises;

public class JankenGame2 {

    // じゃんけん結果判定メソッド
    public static String judge(String moko, String pochi) {

        if (moko.equals(pochi)) {
            return "A draw";
        }

        // 勝ちパターン
        if ((moko.equals("goo") && pochi.equals("choki")) ||
                (moko.equals("choki") && pochi.equals("paa")) ||
                (moko.equals("paa") && pochi.equals("goo"))) {
            return "Moko victory";
        } else {
            return "Pochi victory";
        }
    }

    public static void main(String[] args) {

        // 1回目
        String moko1 = "goo";
        String pochi1 = "goo";
        System.out.println("Janken  Moko  Pochi");
        System.out.println("Moko: " + moko1);
        System.out.println("Pochi: " + pochi1);
        System.out.println("Result: " + judge(moko1, pochi1));
        System.out.println();

        // 2回目
        String moko2 = "paa";
        String pochi2 = "choki";
        System.out.println("Janken  Moko  Pochi");
        System.out.println("Moko: " + moko2);
        System.out.println("Pochi: " + pochi2);
        System.out.println("Result: " + judge(moko2, pochi2));
        System.out.println();

        // 3回目
        String moko3 = "choki";
        String pochi3 = "paa";
        System.out.println("Janken  Moko  Pochi");
        System.out.println("Moko: " + moko3);
        System.out.println("Pochi: " + pochi3);
        System.out.println("Result: " + judge(moko3, pochi3));
    }
}