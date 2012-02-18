package bloom.controller;

import bloom.model.Interview;
import bloom.model.Verb;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.control.TextArea;

public class Index {
    @FXML private TextArea inputText;
    @FXML private ListView bloomList;
    @FXML private ListView verbStemList;
    @FXML private ListView verbList;
    
    private ObservableList<Integer> bloomItems;
    private ObservableList<String> verbStemItems;
    private ObservableList<String> verbItems;
    
    public Index() {
        bloomItems = FXCollections.observableArrayList();
        verbStemItems = FXCollections.observableArrayList();
        verbItems = FXCollections.observableArrayList();
    }
    
    @FXML private void tagText(ActionEvent event) {
        Interview interview = new Interview();
        interview.setText(inputText.getText());
        interview.detectVerbs();
        interview.stemVerbs();
        interview.bloomCategorize();
        bloomItems.clear();
        verbStemItems.clear();
        verbItems.clear();
        for (Verb verb:interview.getVerbs()) {
            bloomItems.add(verb.getBloomCategory());
            verbStemItems.add(verb.getVerbStem());
            verbItems.add(verb.getVerb());
        }
        bloomList.setItems(bloomItems);
        verbStemList.setItems(verbStemItems);
        verbList.setItems(verbItems);
    }
}