package testproject;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @Autowired
    private PartsA partsA;

    @GetMapping
    public String mainMethod() {

        String text = partsA.getText();
        return text;
    }

}
