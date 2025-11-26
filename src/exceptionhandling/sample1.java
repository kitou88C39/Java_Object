package src.exceptionhandling;

public class sample1 {
    public static void main(String[] args) {

        try{
        int x = Integer.parseInt(args[0]);
        int y = Integer.parseInt(args[1]);

        System.out.println(x / y);
        
    }catch(ArrayIndexOutOfBoundsException e){
        System.out.println("[ゼロ割]"+ e + "が発生しました");
    }catch(ArithmeticException e){
        System.out.println("[インデックス範囲外指定]"+ e + "が発生しました");
    }catch(NumberFormatException e){
        System.out.println("[入力値不正(数字でない)]"+ e + "が発生しました");
    }
        System.out.println("最後まで処理しました");
    }
}
