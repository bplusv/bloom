package bloom.model;

import bloom.tools.NLPTools;

public class Interview {
    private String _interview;
    private String[] _interviewVerbs;
    
    public void setText(final String text) {
        _interview = text;
    }
    
    public String getText() {
        return _interview;
    }
    
    public void detectVerbs() {
        _interviewVerbs = NLPTools.detectVerbs(_interview);
    }
    
    public String[] getVerbs() {
        return _interviewVerbs;
    }
}