package bloom;
import java.util.*;

/**
 *
 * @author lu
 */
public class StemsCounter {
    public static Map<String, Integer> Count(ArrayList<String> input) {
        Map<String, Integer> _output = new HashMap<String, Integer>();
        for (String item: input) {
            if (_output.get(item) == null) {
                _output.put(item, 1);
            } else {
                _output.put(item, _output.get(item) + 1);
            }
        }
        return _output;
    }
}
