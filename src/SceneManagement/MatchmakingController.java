package SceneManagement;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.io.IOException;

public class MatchmakingController extends SceneController{
    // Properties

    // Constructor
    public MatchmakingController(Stage stage) throws IOException
    {
        root = FXMLLoader.load(getClass().getResource("/UI/Matchmaking.fxml"));
        scene = new Scene(root, Color.BLACK);
        initialize(stage);
    }

    // Methods
    /**
     * This initialize method initializes every component of the scene and the logic to either login online or register
     * new account.
     * @param stage is the primary stage that will take the controller's scene.
     * @throws IOException is the file-not-found exception.
     */
    @Override
    public void initialize(Stage stage) throws IOException {
        scene.getStylesheets().clear();
        scene.getStylesheets().add(getClass().getResource("/UI/Matchmaking.css").toExternalForm());
        scene.setRoot(root);
        stage.setScene(scene);
    }
}
