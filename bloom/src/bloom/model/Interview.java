package bloom.model;

import bloom.tools.Categorizer;
import bloom.tools.NLPTools;
import java.util.ArrayList;

public class Interview {
    private String _interview = "";
    private ArrayList<Verb> _interviewVerbs = new ArrayList<Verb>();
    
    public void setText(final String text) {
        _interview = text;
    }
    
    public String getText() {
        return _interview;
    }
    
    public void detectVerbs() {
        String[] verbs = NLPTools.detectVerbs(_interview);
        for (String verb:verbs) {
            _interviewVerbs.add(new Verb(verb.toLowerCase()));
        }
    }
    
    public void stemVerbs() {
        for (Verb verb:_interviewVerbs) {
            verb.setVerbStem(NLPTools.stemVerb(verb.getVerb()));
        }
    }
    
    public void bloomCategorize() {
        for (Verb verb:_interviewVerbs) {
            verb.setBloomCategory(Categorizer.bloomCategorize(verb.getverbStem()));
        }
    }
    
    public void marzanoCategorize() {
        
    }
    
    public ArrayList<Verb> getVerbs() {
        return _interviewVerbs;
    }
}