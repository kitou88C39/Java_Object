package testproject;

public class System {

    @Component
    public class ComponentPattern {
        public String getText() {
            return "This is Component";
        }
    }

    @Configuration
    public class ConfigurationPattern {
        @Bean
        public BeanClass getBeanClass() {
            return new "This is Configuration";
        }
    }

    class BeanClass {
        public String getText() {
            return "This is Bean";
        }
    }

}
