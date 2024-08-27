package application;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.PerspectiveCamera;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Box;
import javafx.stage.Stage;

public class Box3DApp extends Application {

    public void start(Stage stage) throws Exception {
        Box box = new Box();
        box.setHeight(100);
        box.setWidth(100);
        box.setDepth(400);
        box.setTranslateX(200);
        box.setTranslateY(200);
        box.setTranslateZ(400);

        PerspectiveCamera camera = new PerspectiveCamera();
        camera.setTranslateX(100);
        camera.setTranslateY(100);
        camera.setTranslateZ(50);

        Group root = new Group();
        root.getChildren().add(box);

        Scene scene = new Scene(root, 450, 350, Color.LIMEGREEN);
        scene.setCamera(camera);

        stage.setScene(scene);
        stage.setTitle("3D Box Example");
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
