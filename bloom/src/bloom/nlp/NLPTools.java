package bloom.nlp;

import java.io.IOException;
import java.util.ArrayList;
import opennlp.tools.lang.spanish.PosTagger;
import opennlp.tools.lang.spanish.SentenceDetector;
import opennlp.tools.lang.spanish.Tokenizer;
import org.tartarus.snowball.SnowballStemmer;
import org.tartarus.snowball.ext.spanishStemmer;

public class NLPTools {
    public static String[] detectVerbs(final String input) {
        String[] sentences;
        String[] sentenceTokens;
        String[] taggedSentenceTokens;

        SentenceDetector sentenceDetector;
        Tokenizer tokenizer;
        PosTagger posTagger;
    
        ArrayList<String> output = new ArrayList<>();
        try {
            sentenceDetector = new SentenceDetector("lib/model/SpanishSent.bin.gz");
            tokenizer = new Tokenizer("lib/model/SpanishTok.bin.gz");
            posTagger = new PosTagger("lib/model/SpanishPOS.bin.gz");
            
            sentences = sentenceDetector.sentDetect(input);
            for (int i = 0; i < sentences.length; i++) {
                sentenceTokens = tokenizer.tokenize(sentences[i]);
                taggedSentenceTokens = posTagger.tag(sentenceTokens);
                for (int j = 0; j < taggedSentenceTokens.length; j++) {
                    if (taggedSentenceTokens[j].startsWith("V")) {
                        output.add(sentenceTokens[j]);
                    }
                }
            }
        }
        catch(IOException ioe) {
            System.out.println(ioe.toString());
        }        
        return output.toArray(new String[output.size()]);
    }
    
    public static String stemVerb(String verb) {
        SnowballStemmer stemmer = (SnowballStemmer) new spanishStemmer();
        stemmer.setCurrent(verb);
        stemmer.stem();
        return stemmer.getCurrent();
    }
    
    public static String[] stemVerbs(String[] verbs) {
        SnowballStemmer stemmer = (SnowballStemmer) new spanishStemmer();
        ArrayList<String> output = new ArrayList<>();
        for (int i = 0; i < verbs.length; i++) {
            stemmer.setCurrent(verbs[i]);
            stemmer.stem();
            output.add(stemmer.getCurrent());
        }
        return output.toArray(new String[output.size()]);
    }
}