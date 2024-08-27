package application;

import javafx.animation.FadeTransition;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import javafx.util.Duration;

public class AnimationCircleFade extends Application {
    public void start(Stage stage) throws Exception {
        Circle circle = new Circle(250, 150, 80);
        circle.setFill(Color.LIMEGREEN);
        circle.setStroke(Color.HOTPINK);
        circle.setStrokeWidth(5);

        FadeTransition fade = new FadeTransition();
        fade.setFromValue(1.0);
        fade.setToValue(0.1);
        fade.setCycleCount(500);
        fade.setDuration(Duration.millis(1000));
        fade.setAutoReverse(true);
        fade.setNode(circle);
        fade.play();

        Group root = new Group();
        root.getChildren().add(circle);
        Scene scene = new Scene(root, 500, 400, Color.BLACK);
        stage.setScene(scene);
        stage.setTitle("Fade Transition Example");
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
