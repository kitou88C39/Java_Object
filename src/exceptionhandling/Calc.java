package src.exceptionhandling;

public class Calc {
    void calc(int x, int y) {

        try {
            System.out.println(x / y);
        } catch (ArithmeticException e) {
            System.out.println("[ERROR]例外を検知しました");
            e.printStackTrace();
        } finally {
            System.out.println("finally");
        }
    }
}
