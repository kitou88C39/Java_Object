package annotation;

import testproject.System.ComponentPattern;

@Controller
public class ControllerPattern {
    @Autowired
    private ComponentPattern component;

    @RequestMapping(value = "/Controller", method = RequestMethod.Get)
    public String mainMethod1(Model model) {
        // ①DIされたcomponentから"Hello ComponentPattern"を取得
        String text = component.getText();
        // ②.modelに"message"を追加し、①で取得した"Hello ComponentPattern"を設定
        model.attribute("message", text);
        // ③.View名を返却
        return "Controller";

    }
}
