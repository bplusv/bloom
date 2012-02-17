package bloom.model;

public class Verb {
    private String verb;
    private String verbStem;
    private int bloomCategory;
    private int marzanoCategory;

    public Verb(String verb) {
        this.verb = verb;
        verbStem = "";
        bloomCategory = 0;
        marzanoCategory = 0;
    }

    public String getVerb() {
        return verb;
    }

    public void setVerb(String verb) {
        this.verb = verb;
    }
    
    public String getVerbStem() {
        return verbStem;
    }
    public void setVerbStem(String verbStem) {
        this.verbStem = verbStem;
    }
    
    public int getBloomCategory() {
        return bloomCategory;
    }  
    
    public void setBloomCategory(int bloomCategory) {
        this.bloomCategory = bloomCategory;
    }

    public int getMarzanoCategory() {
        return marzanoCategory;
    }

    public void setMarzanoCategory(int marzanoCategory) {
        this.marzanoCategory = marzanoCategory;
    }  
}