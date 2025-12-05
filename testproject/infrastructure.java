package testproject;

public class infrastructure {

    @Repository
    public class RepositoryPattern {
        public String getText() {
            return "This is Repository";
        }
    }

}
