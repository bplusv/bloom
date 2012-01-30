package bloom.controller;

import bloom.Bloom;
import bloom.model.Interview;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;

public class Index {
    private Interview _interview = Bloom.getInterview();
    @FXML private TextArea inputText;
    @FXML private TextArea outputText;
    
    @FXML private void tagText(ActionEvent event) {
        _interview.setText(inputText.getText());
        _interview.detectVerbs();
        outputText.setText(""+_interview.getVerbs()[0]);
    }
}
