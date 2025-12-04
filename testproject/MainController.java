package testproject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @RestController 内部メモリへ格納指示
 */
@RestController
public class MainController {

    // 依存性注入 (DI)
    // PartsAをメインクラスに注入指示
    @Autowired
    private PartsA partsA;

    /**
     * ルートパス (/) へのGETリクエストを処理するメソッド。
     *
     * @GetMapping アノテーションは、このメソッドがHTTP GETリクエストに応答することを定義する
     */
    @GetMapping("/")
    public String mainMethod() {
        // DIされた部品 (PartsA) のメソッドを呼び出す
        String text = partsA.getText();
        return text;
    }
}