package testclass;

@RestController
public class SampleController {

    @Value("${test-project.value1}")
    private String propertyValue;

    @GetMapping("/sample")
    public String mainMethod() {
        return propertyValue;
    }
}
