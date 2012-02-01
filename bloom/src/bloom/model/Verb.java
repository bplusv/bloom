package bloom.model;

public class Verb {
    private String _verb;
    private String _verbStem;
    private int _bloomCategory;
    private int _marzanoCategory;

    public Verb(String verb) {
        _verb = verb;
        _verbStem = "";
        _bloomCategory = 0;
        _marzanoCategory = 0;
    }
    
    public void setVerb(String verb) {
        _verb = verb;
    }
    
    public String getVerb() {
        return _verb;
    }

    public void setVerbStem(String verbStem) {
        _verbStem = verbStem;
    }
    
    public String getverbStem() {
        return _verbStem;
    }
    
    public void setBloomCategory(int bloomCategory) {
        _bloomCategory = bloomCategory;
    }

    public int getBloomCategory() {
        return _bloomCategory;
    }    
    
    public int getMarzanoCategory() {
        return _marzanoCategory;
    }

    public void setMarzanoCategory(int marzanoCategory) {
        _marzanoCategory = marzanoCategory;
    }  
}