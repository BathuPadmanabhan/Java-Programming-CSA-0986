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
import javafx.stage.Stage;
import javafx.animation.RotateTransition;
import javafx.util.Duration;
import javafx.scene.transform.Rotate;

public class VideoAppSimple extends Application {
    public void start(Stage stage) throws Exception {
        String filePath = "C:/Users/shrey/Downloads/Raayan 2024 720p HD.mp4";
        Media media = new Media(new File(filePath).toURI().toString());
        MediaPlayer player = new MediaPlayer(media);
        MediaView mediaView = new MediaView(player);

        mediaView.setX(0);
        mediaView.setY(0);
        mediaView.setFitWidth(600);
        mediaView.setFitHeight(400);

        Button playBtn = new Button("Play");
        Button pauseBtn = new Button("Pause");

        playBtn.setOnAction(e -> player.play());
        pauseBtn.setOnAction(e -> player.pause());

        HBox controls = new HBox(10, playBtn, pauseBtn);
        controls.setLayoutX(685);
        controls.setLayoutY(360);

        player.setAutoPlay(false);
        RotateTransition rotate = new RotateTransition();
        rotate.setAxis(Rotate.Y_AXIS);
        rotate.setByAngle(360);
        rotate.setCycleCount(500);
        rotate.setDuration(Duration.millis(1000));
        rotate.setAutoReverse(true);
        rotate.setNode(mediaView);
        rotate.play();

        Group root = new Group();
        root.getChildren().addAll(mediaView, controls);

        Scene scene = new Scene(root, 1000, 500, Color.WHITE);
        stage.setScene(scene);
        stage.setTitle("Video Player Simple");
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
