import io.javalin.Javalin;

public class Main {
    public static void main(String[] args) {
        Javalin.create(config -> {
            config.requestLogger((ctx, ms) -> {
            });
        });
        Javalin app = Javalin.create().start(7000);
        app.get("/", ctx -> ctx.result("Hello World"));

    }
}
