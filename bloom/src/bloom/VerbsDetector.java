package bloom;
import java.io.*;
import java.util.*;
import opennlp.tools.lang.spanish.*;
/**
 *
 * @author lu
 */
public class VerbsDetector {
    public static ArrayList<String> Detect(String input) {
        ArrayList<String> _output = new ArrayList<String>();
        String[] _sentences;
        String[] _sentenceTokens;
        String[] _taggedSentenceTokens;
        
        SentenceDetector _sentenceDetector = null;
        Tokenizer _tokenizer = null;
        PosTagger _posTagger = null;
        
        try {
            _sentenceDetector = new SentenceDetector("D:/Documents/repos/Mercurial/bloom/bloom/lib/models/sentdetect/SpanishSent.bin.gz");
            _tokenizer = new Tokenizer("D:/Documents/repos/Mercurial/bloom/bloom/lib/models/tokenize/SpanishTok.bin.gz");
            _posTagger = new PosTagger("D:/Documents/repos/Mercurial/bloom/bloom/lib/models/postag/SpanishPOS.bin.gz");
            _sentences = _sentenceDetector.sentDetect(input);
            for (int i = 0; i < _sentences.length; i++) {
                _sentenceTokens = _tokenizer.tokenize(_sentences[i]);
                _taggedSentenceTokens = _posTagger.tag(_sentenceTokens);
                for (int j = 0; j < _sentenceTokens.length; j++) {
                    if (_taggedSentenceTokens[j].substring(0, 1).equals("V")) {
                        _output.add(_sentenceTokens[j]);
                    }
                }
            }
        }
        catch(IOException ioe) { }            
        return _output;
    }
}
