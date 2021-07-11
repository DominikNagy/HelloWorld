import io.javalin.Javalin;
import test.Yo;


public class HelloWorld {
    public static void main(String[] args) {
        Javalin app = Javalin.create().start(7000);
        app.get("/", ctx -> ctx.result("Hello World4"));

        System.out.println(Yo.getYo());
    }
}
