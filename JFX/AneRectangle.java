package application;

import javafx.animation.RotateTransition;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.transform.Rotate;
import javafx.stage.Stage;
import javafx.util.Duration;

public class AneRectangle extends Application {
    public void start(Stage stage) throws Exception {
        Rectangle rect = new Rectangle(200, 100, 200, 200);
        rect.setFill(Color.LIMEGREEN);
        rect.setStroke(Color.HOTPINK);
        rect.setStrokeWidth(5);

        RotateTransition rotate = new RotateTransition();
        rotate.setAxis(Rotate.Z_AXIS);
        rotate.setByAngle(360);
        rotate.setCycleCount(500);
        rotate.setDuration(Duration.millis(1000));
        rotate.setAutoReverse(true);
        rotate.setNode(rect);
        rotate.play();

        Group root = new Group();
        root.getChildren().add(rect);
        Scene scene = new Scene(root, 600, 400, Color.BLACK);
        stage.setScene(scene);
        stage.setTitle("Rotate Transition Example");
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
