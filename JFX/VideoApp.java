package application;

import java.io.File;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.animation.RotateTransition;
import javafx.util.Duration;
import javafx.scene.transform.Rotate;

public class VideoApp extends Application {
    public void start(Stage stage) throws Exception {
        String filePath = "C:/Users/shrey/Downloads/Raayan 2024 720p HD.mp4";
        Media media = new Media(new File(filePath).toURI().toString());
        MediaPlayer player = new MediaPlayer(media);
        MediaView mediaView = new MediaView(player);

        Rectangle rect = new Rectangle(450, 25, 500, 280);
        rect.setFill(Color.RED);
        rect.setStroke(Color.BLACK);
        rect.setStrokeWidth(5);

        mediaView.setX(rect.getX());
        mediaView.setY(rect.getY());
        mediaView.setFitWidth(rect.getWidth());
        mediaView.setFitHeight(rect.getHeight());

        Button playBtn = new Button("Play");
        Button pauseBtn = new Button("Pause");

        playBtn.setOnAction(e -> player.play());
        pauseBtn.setOnAction(e -> player.pause());

        HBox controls = new HBox(10, playBtn, pauseBtn);
        controls.setLayoutX(685);
        controls.setLayoutY(360);

        player.setAutoPlay(false);
        RotateTransition rotate = new RotateTransition();
        rotate.setAxis(Rotate.Z_AXIS);
        rotate.setByAngle(360);
        rotate.setCycleCount(500);
        rotate.setDuration(Duration.millis(1000));
        rotate.setAutoReverse(true);
        rotate.setNode(mediaView);
        rotate.play();

        Group root = new Group();
        root.getChildren().addAll(rect, mediaView, controls);

        Scene scene = new Scene(root, 1000, 500, Color.WHITE);
        stage.setScene(scene);
        stage.setTitle("Video Player");
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
