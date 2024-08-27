package application;

import javafx.animation.StrokeTransition;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import javafx.util.Duration;

public class AnimationCirStroke extends Application {
    public void start(Stage stage) throws Exception {
        Circle circle = new Circle(250, 150, 80);
        circle.setFill(Color.LIMEGREEN);
        circle.setStroke(Color.HOTPINK);
        circle.setStrokeWidth(10);

        StrokeTransition stroke = new StrokeTransition();
        stroke.setFromValue(Color.BLUE);
        stroke.setToValue(Color.RED);
        stroke.setCycleCount(500);
        stroke.setDuration(Duration.millis(1000));
        stroke.setAutoReverse(true);
        stroke.setShape(circle);
        stroke.play();

        Group root = new Group();
        root.getChildren().add(circle);
        Scene scene = new Scene(root, 500, 400, Color.BLACK);
        stage.setScene(scene);
        stage.setTitle("Stroke Transition Example");
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
