package bloom.controller;

import bloom.model.Interview;
import bloom.model.Verb;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;
import javafx.scene.control.TextArea;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;

public class Index extends BorderPane implements Initializable {
    @FXML private TextArea inputText;
    @FXML private ListView bloomList;
    @FXML private ListView verbStemList;
    @FXML private ListView verbList;
    
    private ObservableList<Integer> bloomItems;
    private ObservableList<String> verbStemItems;
    private ObservableList<String> verbItems;
    private Interview interview;
    
    private void updateVerbStemList(int bloomCategory) {
        verbStemItems.clear();
        for (Verb verb:interview.getVerbs()) {
            if (verb.getBloomCategory() == bloomCategory &&
                    !verbStemItems.contains(verb.getVerbStem())) {
                verbStemItems.add(verb.getVerbStem());
            }
        }
    }
    
    private void updateVerbList(int bloomCategory) {
        verbItems.clear();
        for (Verb verb:interview.getVerbs()) {
            if (verb.getBloomCategory() == bloomCategory) {
                verbItems.add(verb.getVerb());
            }
        }
    }
    
    private void updateVerbList(String verbStem) {
        verbItems.clear();
        for (Verb verb:interview.getVerbs()) {
            if (verb.getVerbStem().equals(verbStem)) {
                verbItems.add(verb.getVerb());
            }
        }
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        bloomItems = FXCollections.observableArrayList(5, 4, 3, 2, 1, 0, -1);
        verbStemItems = FXCollections.observableArrayList();
        verbItems = FXCollections.observableArrayList();
        bloomList.setItems(bloomItems);
        verbStemList.setItems(verbStemItems);
        verbList.setItems(verbItems);
        interview = new Interview();
        
        bloomList.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<Integer>() {
            @Override
            public void changed(ObservableValue<? extends Integer> ov, Integer old_val, Integer new_val) {
                updateVerbStemList(new_val);
            }
        });
        
        verbStemList.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> ov, String old_val, String new_val) {
                updateVerbList(new_val);
            }
        });
    }

    @FXML private void tagText(ActionEvent event) {
        interview = new Interview();
        interview.setText(inputText.getText());
        interview.detectVerbs();
        interview.stemVerbs();
        interview.bloomCategorize();
        
        verbStemItems.clear();
        verbItems.clear();
    }
}