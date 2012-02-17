package bloom;

import java.util.ResourceBundle;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MainApp extends Application {
    
    public static void main(String[] args) {
        Application.launch(MainApp.class, args);
    }
    
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("view/Index.fxml"),
                ResourceBundle.getBundle("bloom.lang.es"));
        Scene scene = new Scene(root, 640, 480);
        scene.getStylesheets().add("bloom/view/css/Index.css");
        stage.setScene(scene);
        stage.show();
    }
}
