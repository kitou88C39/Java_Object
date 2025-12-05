package testproject;

public class Application {

    @controller
    public class ContorllerPattern {
        @Autowired
        private ComponentPattern component;

        @GetMapping("/Controller")
        public String mainMethod() {
            return component.getText;
        }
    }

}
