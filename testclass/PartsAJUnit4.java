package testclass;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.Test;

public class PartsAJUnit4 {

    PartsA partsA = new PartsA();

    @Test
    public void testGetText() {

        // テスト対象メソッドの呼び出し
        String returnValue = partsA.getText();
        // 戻り値検証
        assertEquals("Hello artsA", returnValue);
    }
}
