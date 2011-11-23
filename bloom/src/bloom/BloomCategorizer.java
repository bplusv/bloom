package bloom;
import java.util.*;
/**
 *
 * @author lu
 */
public class BloomCategorizer {
    private static String getTaxonomy(int input) {
        String _output = "";
        switch (input) {
            case 0:
                _output = "knowledge";
            break;
                case 1:
                _output = "comprehension";
            break;
                case 2:
                _output = "application";
            break;
                    case 3:
                _output = "analysis";
            break;
                case 4:
                _output = "synthesis";
            break;
                case 5:
                _output = "evaluation";
            break;
                default:
                _output = "other";
            break;
            
        }
        return _output;
    }
    public static Map<String, Integer> Categorize(Map<String, Integer> input) {
        Map<String, Integer> _output = new HashMap<String, Integer>();
        _output.put("knowledge", 0);
        _output.put("comprehension", 0);
        _output.put("application", 0);
        _output.put("analysis", 0);
        _output.put("synthesis", 0);
        _output.put("evaluation", 0);
        _output.put("other", 0);
        
        
        ArrayList<String>[] _bloomTaxonomy = (ArrayList<String>[])new ArrayList[6];
        _bloomTaxonomy[0] = new ArrayList<String>(); // knowledge
        _bloomTaxonomy[0].add("acertar");
        _bloomTaxonomy[0].add("aparear");
        _bloomTaxonomy[0].add("apuntar");
        _bloomTaxonomy[0].add("citar");
        _bloomTaxonomy[0].add("clasificar");
        _bloomTaxonomy[0].add("combinar");
        _bloomTaxonomy[0].add("definir");
        _bloomTaxonomy[0].add("describir");
        _bloomTaxonomy[0].add("enlistar");
        
        _bloomTaxonomy[1] = new ArrayList<String>(); // comprehension
        _bloomTaxonomy[1].add("asociar");
        _bloomTaxonomy[1].add("citar");
        _bloomTaxonomy[1].add("comparar");
        _bloomTaxonomy[1].add("comprender");
        _bloomTaxonomy[1].add("concluir");
        _bloomTaxonomy[1].add("contrastar");
        _bloomTaxonomy[1].add("convertir");
        _bloomTaxonomy[1].add("cotejar");
        
        _bloomTaxonomy[2] = new ArrayList<String>(); // application
        _bloomTaxonomy[3] = new ArrayList<String>(); // analysis
        _bloomTaxonomy[4] = new ArrayList<String>(); // synthesis
        _bloomTaxonomy[5] = new ArrayList<String>(); // evaluation
        
        Boolean found = false;
        
        for (String stem: input.keySet()) {
            found = false;
            for (int i = 0; i < _bloomTaxonomy.length; i++) {
                for (int j = 0; j < _bloomTaxonomy[i].size() && !found; j++) {
                    if (stem.equalsIgnoreCase(VerbsStemmer.Stem(_bloomTaxonomy[i].get(j)))) {
                        _output.put(getTaxonomy(i), _output.get(getTaxonomy(i)) + input.get(stem));
                        found = true;
                    }
                }
            }
            if (!found) {
                _output.put("other", _output.get("other") + input.get(stem));
            }
        }
        return _output;
    }
}
