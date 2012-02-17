package bloom.model;

import bloom.nlp.Categorizer;
import bloom.nlp.NLPTools;
import java.util.ArrayList;

public class Interview {
    private String interview = "";
    private ArrayList<Verb> interviewVerbs = new ArrayList<Verb>();

    public String getText() {
        return interview;
    }
    
    public void setText(final String interview) {
        this.interview = interview;
    }
    
    public void detectVerbs() {
        String[] verbs = NLPTools.detectVerbs(interview);
        for (String verb:verbs) {
            interviewVerbs.add(new Verb(verb.toLowerCase()));
        }
    }
    
    public void stemVerbs() {
        for (Verb verb:interviewVerbs) {
            verb.setVerbStem(NLPTools.stemVerb(verb.getVerb()));
        }
    }
    
    public void bloomCategorize() {
        for (Verb verb:interviewVerbs) {
            verb.setBloomCategory(Categorizer.bloomCategorize(verb.getVerbStem()));
        }
    }
    
    public void marzanoCategorize() {
        
    }
    
    public ArrayList<Verb> getVerbs() {
        return interviewVerbs;
    }
}