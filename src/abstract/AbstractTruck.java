package src.abstract;

abstract public class AbstractTruck {
    //抽象メソッド
    //acceleratorメソッド(現在の速度を上げる)
    public abstract void accelerator();
    //brakeメソッド(現在の速度を下げる)
    public abstract void brake();
    //paintメソッド(色を塗る)
    abstract void paint(String color);
    
}
