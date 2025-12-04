package testproject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * メインコントローラクラス
 * 外部からのHTTPリクエストを処理するエンドポイントを定義します。
 * 
 * @RestController アノテーションにより、DIコンテナに管理されるコンポーネントとなり、
 *                 かつ、メソッドの戻り値がHTTPレスポンスボディとして扱われます。
 */
@RestController
public class MainController {

    // 依存性注入 (DI)
    // Springコンテナによって、PartsAインターフェースを実装した
    // 適切なBean (PartsAImpl) が自動的にこのフィールドに注入されます。
    @Autowired
    private PartsA partsA;

    /**
     * ルートパス (/) へのGETリクエストを処理するメソッド。
     * 
     * @GetMapping アノテーションは、このメソッドがHTTP GETリクエストに応答することを定義します。
     * @return PartsAコンポーネントから取得した文字列
     */
    @GetMapping("/")
    public String mainMethod() {
        // DIされた部品 (PartsA) のメソッドを呼び出す
        String text = partsA.getText();
        return text;
    }
}