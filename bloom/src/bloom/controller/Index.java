package bloom.controller;

import bloom.Bloom;
import bloom.model.Interview;
import bloom.model.Verb;
import java.util.ArrayList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;

public class Index {
    private Interview _interview = Bloom.getInterview();
    @FXML private TextArea inputText;
    @FXML private TextArea outputText;
    
    @FXML private void tagText(ActionEvent event) {
        _interview = new Interview();
        _interview.setText(inputText.getText());
        _interview.detectVerbs();
        _interview.stemVerbs();
        _interview.bloomCategorize();
        
        ArrayList<Verb> verbs = _interview.getVerbs();
        String _output = "";
        for (Verb verb:verbs) {
            _output += verb.getBloomCategory() + ", ";
        }
        outputText.setText(_output);
    }
}
