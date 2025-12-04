package testproject;

import org.springframework.stereotype.Component;

/**
 *
 * @Component 内部メモリへ格納指示
 */
@Component
public class PartA {

    public String getText() {
        return "This is PartA";
    }
}
