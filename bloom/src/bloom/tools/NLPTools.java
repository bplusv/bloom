package bloom.tools;

import java.io.IOException;
import java.util.ArrayList;
import opennlp.tools.lang.spanish.PosTagger;
import opennlp.tools.lang.spanish.SentenceDetector;
import opennlp.tools.lang.spanish.Tokenizer;
import org.tartarus.snowball.SnowballStemmer;
import org.tartarus.snowball.ext.spanishStemmer;

public class NLPTools {
    
    
    public static String[] detectVerbs(final String input) {
        String[] _sentences;
        String[] _sentenceTokens;
        String[] _taggedSentenceTokens;

        SentenceDetector _sentenceDetector;
        Tokenizer _tokenizer;
        PosTagger _posTagger;
    
        ArrayList<String> _output = new ArrayList<>();
        try {
            _sentenceDetector = new SentenceDetector("lib/models/sentdetect/SpanishSent.bin.gz");
            _tokenizer = new Tokenizer("lib/models/tokenize/SpanishTok.bin.gz");
            _posTagger = new PosTagger("lib/models/postag/SpanishPOS.bin.gz");
            
            _sentences = _sentenceDetector.sentDetect(input);
            for (int i = 0; i < _sentences.length; i++) {
                _sentenceTokens = _tokenizer.tokenize(_sentences[i]);
                _taggedSentenceTokens = _posTagger.tag(_sentenceTokens);
                for (int j = 0; j < _taggedSentenceTokens.length; j++) {
                    if (_taggedSentenceTokens[j].startsWith("V")) {
                        _output.add(_sentenceTokens[j]);
                    }
                }
            }
        }
        catch(IOException ioe) {
            System.out.println(ioe.toString());
        }
        
        SnowballStemmer _stemmer = (SnowballStemmer) new spanishStemmer();
        _stemmer.setCurrent(input);
        _stemmer.stem();
        //_output = _stemmer.getCurrent();
        
        return _output.toArray(new String[_output.size()]);
    }
}