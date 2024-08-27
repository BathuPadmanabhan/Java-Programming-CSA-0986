package application;

import java.io.File;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Audio extends Application {
    public void start(Stage stage) throws Exception {
        String filePath = "C:\\Users\\HP\\Videos\\Angry Birds HD.mp4";
        Media media = new Media(new File(filePath).toURI().toString());
        MediaPlayer player = new MediaPlayer(media);
        MediaView view = new MediaView(player);
        view.setX(25);
        view.setY(25);
        view.setFitWidth(575);
        view.setFitHeight(600);
        player.setAutoPlay(true);
        Group root = new Group();
        root.getChildren().add(view);
        Scene scene = new Scene(root, 1000, 500, Color.BLACK);
        stage.setScene(scene);
        stage.setTitle("SIMATS");
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
