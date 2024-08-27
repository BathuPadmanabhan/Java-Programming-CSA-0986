package application;

import javafx.animation.FillTransition;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import javafx.util.Duration;

public class AnimeCircleFill extends Application {
    public void start(Stage stage) throws Exception {
        Circle circle = new Circle(250, 150, 80);
        circle.setFill(Color.LIMEGREEN);
        circle.setStroke(Color.HOTPINK);
        circle.setStrokeWidth(10);

        FillTransition fill = new FillTransition();
        fill.setFromValue(Color.BLUE);
        fill.setToValue(Color.RED);
        fill.setCycleCount(500);
        fill.setDuration(Duration.millis(1000));
        fill.setAutoReverse(true);
        fill.setShape(circle);
        fill.play();

        Group root = new Group();
        root.getChildren().add(circle);
        Scene scene = new Scene(root, 500, 400, Color.BLACK);
        stage.setScene(scene);
        stage.setTitle("Fill Transition Example");
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
