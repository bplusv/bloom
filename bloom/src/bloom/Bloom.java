package bloom;

import bloom.model.Interview;
import java.util.ResourceBundle;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Bloom extends Application {
    private static Interview _interview = new Interview();
    
    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("bloom");
        
        Parent root = FXMLLoader.load(getClass().getResource("./View/Index.fxml"),
                ResourceBundle.getBundle("bloom.lang.es_lang"));
        Scene scene = new Scene(root, 640, 480);
        scene.getStylesheets().add("bloom/view/css/Index.css");
        stage.setScene(scene);
        stage.show();
    }
    
    public static Interview getInterview() {
        return _interview;
    }
    
    public static void setInterview(final Interview interview) {
        _interview = interview;
    }
    
    public static void main(String[] args) {
        launch(args);
    }
}