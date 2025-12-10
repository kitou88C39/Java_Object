package testclass;

import java.beans.Transient;

public class PartsATest {

    // テストクラス
    PartsA partsA = new PartsA();

    @Test
    public void testGetText() {

        // テスト対象メソッドの呼び出し
        String returnValue = targetClass.getText();
        // 戻り値検証
        assertEquals("Hello artsA", returnValue);

        return partsA.getText();
    }
}
