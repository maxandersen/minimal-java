package corp.acme.app;

public class App
{

    public static void main(String[] args) {
        System.out.println(new App().getMessage());
    }

    private final String getMessage() {
        return "Hello World!";
    }

}
