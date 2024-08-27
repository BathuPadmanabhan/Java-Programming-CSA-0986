package application;

import javafx.animation.TranslateTransition;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import javafx.util.Duration;

public class AnimationCircleFirstSample extends Application {
    public void start(Stage stage) throws Exception {
        Circle circle = new Circle(50, 100, 50);
        circle.setFill(Color.LIMEGREEN);
        circle.setStroke(Color.HOTPINK);
        circle.setStrokeWidth(5);

        TranslateTransition translate = new TranslateTransition();
        translate.setByX(400);
        translate.setCycleCount(500);
        translate.setDuration(Duration.millis(1000));
        translate.setAutoReverse(true);
        translate.setNode(circle);
        translate.play();

        Group root = new Group();
        root.getChildren().add(circle);
        Scene scene = new Scene(root, 500, 200, Color.BLACK);
        stage.setScene(scene);
        stage.setTitle("Translate Transition Example");
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
