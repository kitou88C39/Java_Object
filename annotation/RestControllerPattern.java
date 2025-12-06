public class RestControllerPattern {

    @RestController
    public class RestControllerPattern {
        @Autowired
        private ComponentPattern component;

        @GetMapping("/RestController")
        public String mainMethod() {
            return component.getText();
        }
    }

}
