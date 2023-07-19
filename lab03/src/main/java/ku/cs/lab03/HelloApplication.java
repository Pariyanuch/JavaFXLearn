package ku.cs.lab03;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import ku.cs.services.FXRouter;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXRouter.bind(this, stage, "List", 600, 400);
        configRoute();
        FXRouter.goTo("hello");
    }
    public static void configRoute() {
        String viewPath = "ku/cs/views/";
        FXRouter.when("student-list", viewPath + "student-list.fxml");
        FXRouter.when("hello", viewPath + "hello-view.fxml");
    }
    public static void main(String[] args) {
        launch();
    }
}