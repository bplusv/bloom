package bloom.nlp;


import java.io.DataInputStream;
import java.io.IOException;
import java.util.ArrayList;
import opennlp.maxent.io.BinaryGISModelReader;
import opennlp.tools.postag.DefaultPOSContextGenerator;
import opennlp.tools.postag.POSTaggerME;
import opennlp.tools.sentdetect.SentenceDetectorME;
import opennlp.tools.tokenize.TokenizerME;
import org.tartarus.snowball.SnowballStemmer;
import org.tartarus.snowball.ext.spanishStemmer;

public class NLPTools {
    public static String[] detectVerbs(final String input) {
        String[] sentences;
        String[] sentenceTokens;
        String[] taggedSentenceTokens;

        SentenceDetectorME sentenceDetector;
        TokenizerME tokenizer;
        POSTaggerME posTagger;
    
        ArrayList<String> output = new ArrayList<>();
        try {
            
            DataInputStream senteceDetectorModel = new DataInputStream(NLPTools.class.getResourceAsStream("/bloom/nlp/model/SpanishSent.bin"));
            sentenceDetector = new SentenceDetectorME(new BinaryGISModelReader(senteceDetectorModel).getModel());
            
            DataInputStream tokenizerModel = new DataInputStream(NLPTools.class.getResourceAsStream("/bloom/nlp/model/SpanishTok.bin"));
            tokenizer = new TokenizerME(new BinaryGISModelReader(tokenizerModel).getModel());
            
            DataInputStream posTaggerModel = new DataInputStream(NLPTools.class.getResourceAsStream("/bloom/nlp/model/SpanishPOS.bin"));
            posTagger = new POSTaggerME(new BinaryGISModelReader(posTaggerModel).getModel(), new DefaultPOSContextGenerator(null));
            
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