package application;

import java.io.File;
import javafx.application.Application;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.stage.Stage;

public class JavaFXMediaExample extends Application {
    public void start(Stage stage) throws Exception {
        String filePath = "/home/javatpoint/Downloads/test.mp3";
        Media media = new Media(new File(filePath).toURI().toString());
        MediaPlayer player = new MediaPlayer(media);
        player.setAutoPlay(true);
        stage.setTitle("Playing Audio");
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
