package src.exceptionhandling;

public class Main {
    public static void main(String[] args) {
        System.out.println("[INFO]処理開始");

        try {
            int x = Integer.parseInt(args[0]);
            int y = Integer.parseInt(args[1]);

            Calc calcInstance = new Calc();

            calcInstance.calc(x, y);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("[ERROR]例外を検知しました");
            e.printStackTrace();
        } catch (NumberFormatException e) {
            System.out.println("[ERROR]例外を検知しました");
            e.printStackTrace();
        } finally {
            System.out.println("finally");
        }

        System.out.println("[INFO]正常終了");
    }
}