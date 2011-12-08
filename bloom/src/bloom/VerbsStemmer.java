package bloom;

import java.util.*;
import org.tartarus.snowball.SnowballStemmer;
import org.tartarus.snowball.ext.spanishStemmer;


/**
 *
 * @author lu
 */
public class VerbsStemmer {
    public static ArrayList<String> Stem(ArrayList<String> input) {
        ArrayList<String> _output = new ArrayList<String>();
        SnowballStemmer _stemmer = (SnowballStemmer) new spanishStemmer();
        for (int i = 0; i < input.size(); i++) {
            _stemmer.setCurrent(input.get(i).toLowerCase());
            _stemmer.stem();
            _output.add(_stemmer.getCurrent());
        }
        return _output;
    }
    public static String Stem(String input) {
        String _output = "";
        SnowballStemmer _stemmer = (SnowballStemmer) new spanishStemmer();
        _stemmer.setCurrent(input.toLowerCase());
        _stemmer.stem();
        _output = _stemmer.getCurrent();
        return _output;
    }
}
