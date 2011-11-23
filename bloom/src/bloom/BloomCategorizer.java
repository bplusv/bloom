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
    public static Map<Integer, Integer> Categorize(Map<String, Integer> input) {
        Map<Integer, Integer> _output = new HashMap<Integer, Integer>();
        _output.put(0, 0); // Knowledge
        _output.put(1, 0); // Comprehension
        _output.put(2, 0); // Application
        _output.put(3, 0); // Analysis
        _output.put(4, 0); // Synthesis
        _output.put(5, 0); // Evaluation
        _output.put(6, 0); // Other
        
        
        ArrayList<String>[] _bloomTaxonomy = (ArrayList<String>[])new ArrayList[6];
        _bloomTaxonomy[0] = new ArrayList<String>(); // knowledge
        _bloomTaxonomy[0].add("agregar");
        _bloomTaxonomy[0].add("acertar");
        _bloomTaxonomy[0].add("aclarar");
        _bloomTaxonomy[0].add("aparear");
        _bloomTaxonomy[0].add("apuntar");
        _bloomTaxonomy[0].add("aproximar");
        _bloomTaxonomy[0].add("articular");
        _bloomTaxonomy[0].add("asociar");
        _bloomTaxonomy[0].add("citar");
        _bloomTaxonomy[0].add("clasificar");
        _bloomTaxonomy[0].add("comparar");
        _bloomTaxonomy[0].add("combinar");
        _bloomTaxonomy[0].add("contrastar");
        _bloomTaxonomy[0].add("convertir");
        _bloomTaxonomy[0].add("conocer");
        _bloomTaxonomy[0].add("definir");
        _bloomTaxonomy[0].add("describir");
        _bloomTaxonomy[0].add("detallar");
        _bloomTaxonomy[0].add("decir");
        _bloomTaxonomy[0].add("describir");
        _bloomTaxonomy[0].add("diferenciar");
        _bloomTaxonomy[0].add("distinguir");
        _bloomTaxonomy[0].add("estimar");
        _bloomTaxonomy[0].add("etiquetar");
        _bloomTaxonomy[0].add("ejemplificar");
        _bloomTaxonomy[0].add("enlistar");
        _bloomTaxonomy[0].add("enumerar");
        _bloomTaxonomy[0].add("enunciar");
        _bloomTaxonomy[0].add("examinar");
        _bloomTaxonomy[0].add("explicar");
        _bloomTaxonomy[0].add("expresar");
        _bloomTaxonomy[0].add("extender");
        _bloomTaxonomy[0].add("escribir");
        _bloomTaxonomy[0].add("etiquetar");
        _bloomTaxonomy[0].add("formular");
        _bloomTaxonomy[0].add("grabar");
        _bloomTaxonomy[0].add("generalizar");
        _bloomTaxonomy[0].add("interpretar");
        _bloomTaxonomy[0].add("identificar");
        _bloomTaxonomy[0].add("indicar");
        _bloomTaxonomy[0].add("inscribir");
        _bloomTaxonomy[0].add("leer");
        _bloomTaxonomy[0].add("listar");
        _bloomTaxonomy[0].add("llamar");
        _bloomTaxonomy[0].add("localizar");
        _bloomTaxonomy[0].add("marcar");
        _bloomTaxonomy[0].add("mencionar");
        _bloomTaxonomy[0].add("memorizar");
        _bloomTaxonomy[0].add("nombrar");
        _bloomTaxonomy[0].add("numerar");
        _bloomTaxonomy[0].add("organizar");
        _bloomTaxonomy[0].add("observar");
        _bloomTaxonomy[0].add("recoger");
        _bloomTaxonomy[0].add("reconocer");
        _bloomTaxonomy[0].add("recordar");
        _bloomTaxonomy[0].add("recopilar");
        _bloomTaxonomy[0].add("registrar");
        _bloomTaxonomy[0].add("relacionar");
        _bloomTaxonomy[0].add("relatar");
        _bloomTaxonomy[0].add("repetir");
        _bloomTaxonomy[0].add("revisar");
        _bloomTaxonomy[0].add("reproducir");
        _bloomTaxonomy[0].add("rotular");
        _bloomTaxonomy[0].add("seleccionar");
        _bloomTaxonomy[0].add("señalar");
        _bloomTaxonomy[0].add("subrayar");
        _bloomTaxonomy[0].add("traducir");
        
        _bloomTaxonomy[1] = new ArrayList<String>(); // comprehension
        _bloomTaxonomy[1].add("asociar");
        _bloomTaxonomy[1].add("citar");
        _bloomTaxonomy[1].add("comparar");
        _bloomTaxonomy[1].add("comprender");
        _bloomTaxonomy[1].add("concluir");
        _bloomTaxonomy[1].add("contrastar");
        _bloomTaxonomy[1].add("convertir");
        _bloomTaxonomy[1].add("clasificar");
        _bloomTaxonomy[1].add("cotejar");
        _bloomTaxonomy[1].add("ejemplificar");
        _bloomTaxonomy[1].add("deducir");
        _bloomTaxonomy[1].add("defender");
        _bloomTaxonomy[1].add("describir");
        _bloomTaxonomy[1].add("diferenciar");
        _bloomTaxonomy[1].add("discutir");
        _bloomTaxonomy[1].add("distinguir");
        _bloomTaxonomy[1].add("ejemplificar");
        _bloomTaxonomy[1].add("estimar");
        _bloomTaxonomy[1].add("explicar");
        _bloomTaxonomy[1].add("exponer");
        _bloomTaxonomy[1].add("expresar");
        _bloomTaxonomy[1].add("extender");
        _bloomTaxonomy[1].add("generalizar");
        _bloomTaxonomy[1].add("identificar");
        _bloomTaxonomy[1].add("ilustrar");
        _bloomTaxonomy[1].add("indicar");
        _bloomTaxonomy[1].add("inferir");
        _bloomTaxonomy[1].add("informar");
        _bloomTaxonomy[1].add("interpretar");
        _bloomTaxonomy[1].add("interrelacionar");
        _bloomTaxonomy[1].add("localizar");
        _bloomTaxonomy[1].add("narrar");
        _bloomTaxonomy[1].add("ordenar");
        _bloomTaxonomy[1].add("parafrasear");
        _bloomTaxonomy[1].add("predecir");
        _bloomTaxonomy[1].add("pronosticar");
        _bloomTaxonomy[1].add("reconocer");
        _bloomTaxonomy[1].add("reafirmar");
        _bloomTaxonomy[1].add("reenumerar");
        _bloomTaxonomy[1].add("repasar");
        _bloomTaxonomy[1].add("reportar");
        _bloomTaxonomy[1].add("reescribir");
        _bloomTaxonomy[1].add("resumir");
        _bloomTaxonomy[1].add("revisar");
        _bloomTaxonomy[1].add("seleccionar");
        _bloomTaxonomy[1].add("simplificar");
        _bloomTaxonomy[1].add("tabular");
        _bloomTaxonomy[1].add("traducir");
        _bloomTaxonomy[1].add("transcribir");
        _bloomTaxonomy[1].add("transformar");
        _bloomTaxonomy[1].add("trasladar");
        _bloomTaxonomy[1].add("ubicar");
        
        _bloomTaxonomy[2] = new ArrayList<String>(); // application
        _bloomTaxonomy[2].add("adquirir");
        _bloomTaxonomy[2].add("aplicar");
        _bloomTaxonomy[2].add("asignar");
        _bloomTaxonomy[2].add("bocetar");
        _bloomTaxonomy[2].add("calcular");
        _bloomTaxonomy[2].add("cambiar");
        _bloomTaxonomy[2].add("calcular");
        _bloomTaxonomy[2].add("capturar");
        _bloomTaxonomy[2].add("catalogar");
        _bloomTaxonomy[2].add("cambiar");
        _bloomTaxonomy[2].add("completar");
        _bloomTaxonomy[2].add("clasificar");
        _bloomTaxonomy[2].add("comprobar");
        _bloomTaxonomy[2].add("computar");
        _bloomTaxonomy[2].add("construir");
        _bloomTaxonomy[2].add("contribuir");
        _bloomTaxonomy[2].add("controlar");
        _bloomTaxonomy[2].add("delinear");
        _bloomTaxonomy[2].add("demostrar");
        _bloomTaxonomy[2].add("describir");
        _bloomTaxonomy[2].add("descubrir");
        _bloomTaxonomy[2].add("determinar");
        _bloomTaxonomy[2].add("dibujar");
        _bloomTaxonomy[2].add("dramatizar");
        _bloomTaxonomy[2].add("elegir");
        _bloomTaxonomy[2].add("emplear");
        _bloomTaxonomy[2].add("esbozar");
        _bloomTaxonomy[2].add("escoger");
        _bloomTaxonomy[2].add("establecer");
        _bloomTaxonomy[2].add("esbosar");
        _bloomTaxonomy[2].add("examinar");
        _bloomTaxonomy[2].add("experimentar");
        _bloomTaxonomy[2].add("explorar");
        _bloomTaxonomy[2].add("expresar");
        _bloomTaxonomy[2].add("evitar");
        _bloomTaxonomy[2].add("factorizar");
        _bloomTaxonomy[2].add("generalizar");
        _bloomTaxonomy[2].add("graficar");
        _bloomTaxonomy[2].add("ilustrar");
        _bloomTaxonomy[2].add("incluir");
        _bloomTaxonomy[2].add("informar");
        _bloomTaxonomy[2].add("interpretar");
        _bloomTaxonomy[2].add("inventariar");
        _bloomTaxonomy[2].add("investigar");
        _bloomTaxonomy[2].add("manejar");
        _bloomTaxonomy[2].add("manipular");
        _bloomTaxonomy[2].add("modificar");
        _bloomTaxonomy[2].add("mostrar");
        _bloomTaxonomy[2].add("operar");
        _bloomTaxonomy[2].add("organizar");
        _bloomTaxonomy[2].add("personalizar");
        _bloomTaxonomy[2].add("plantear");
        _bloomTaxonomy[2].add("practicar");
        _bloomTaxonomy[2].add("preparar");
        _bloomTaxonomy[2].add("predecir");
        _bloomTaxonomy[2].add("probar");
        _bloomTaxonomy[2].add("procesar");
        _bloomTaxonomy[2].add("producir");
        _bloomTaxonomy[2].add("programar");
        _bloomTaxonomy[2].add("proporcionar");
        _bloomTaxonomy[2].add("prototipar");
        _bloomTaxonomy[2].add("proyectar");
        _bloomTaxonomy[2].add("proveer");
        _bloomTaxonomy[2].add("recoger");
        _bloomTaxonomy[2].add("recolectar");
        _bloomTaxonomy[2].add("relacionar");
        _bloomTaxonomy[2].add("relatar");
        _bloomTaxonomy[2].add("resolver");
        _bloomTaxonomy[2].add("solucionar");
        _bloomTaxonomy[2].add("subscribir");
        _bloomTaxonomy[2].add("simular");
        _bloomTaxonomy[2].add("transferir");
        _bloomTaxonomy[2].add("traducir");
        _bloomTaxonomy[2].add("trazar");
        _bloomTaxonomy[2].add("usar");
        _bloomTaxonomy[2].add("utilizar");
        
        
        _bloomTaxonomy[3] = new ArrayList<String>(); // analysis
        _bloomTaxonomy[3].add("administrar");
        _bloomTaxonomy[3].add("agrupar");
        _bloomTaxonomy[3].add("asegurar");
        _bloomTaxonomy[3].add("analizar");
        _bloomTaxonomy[3].add("auditar");
        _bloomTaxonomy[3].add("calcular");
        _bloomTaxonomy[3].add("categorizar");
        _bloomTaxonomy[3].add("clasificar");
        _bloomTaxonomy[3].add("combinar");
        _bloomTaxonomy[3].add("comparar");
        _bloomTaxonomy[3].add("comprobar");
        _bloomTaxonomy[3].add("construir");
        _bloomTaxonomy[3].add("confirmar");
        _bloomTaxonomy[3].add("contrastar");
        _bloomTaxonomy[3].add("consultar");
        _bloomTaxonomy[3].add("cuestionar");
        _bloomTaxonomy[3].add("criticar");
        _bloomTaxonomy[3].add("debatir");
        _bloomTaxonomy[3].add("descomponer");
        _bloomTaxonomy[3].add("detectar");
        _bloomTaxonomy[3].add("diagnosticar");
        _bloomTaxonomy[3].add("diagramar");
        _bloomTaxonomy[3].add("diferenciar");
        _bloomTaxonomy[3].add("discriminar");
        _bloomTaxonomy[3].add("distinguir");
        _bloomTaxonomy[3].add("diseccionar");
        _bloomTaxonomy[3].add("dividir");
        _bloomTaxonomy[3].add("documentar");
        _bloomTaxonomy[3].add("encuestar");
        _bloomTaxonomy[3].add("esquematizar");
        _bloomTaxonomy[3].add("estimar");
        _bloomTaxonomy[3].add("establecer");
        _bloomTaxonomy[3].add("examinar");
        _bloomTaxonomy[3].add("explicar");
        _bloomTaxonomy[3].add("explorar");
        _bloomTaxonomy[3].add("experimentar");
        _bloomTaxonomy[3].add("entrenar");
        _bloomTaxonomy[3].add("experimentar");
        _bloomTaxonomy[3].add("identificar");
        _bloomTaxonomy[3].add("ilustrar");
        _bloomTaxonomy[3].add("inferir");
        _bloomTaxonomy[3].add("inspeccionar");
        _bloomTaxonomy[3].add("limitar");
        _bloomTaxonomy[3].add("interrumpir");
        _bloomTaxonomy[3].add("investigar");
        _bloomTaxonomy[3].add("limitar");
        _bloomTaxonomy[3].add("maximizar");
        _bloomTaxonomy[3].add("minimizar");
        _bloomTaxonomy[3].add("optimizar");
        _bloomTaxonomy[3].add("ordenar");
        _bloomTaxonomy[3].add("pedir");
        _bloomTaxonomy[3].add("precisar");
        _bloomTaxonomy[3].add("priorizar");
        _bloomTaxonomy[3].add("probar");
        _bloomTaxonomy[3].add("priorizar");
        _bloomTaxonomy[3].add("relacionar");
        _bloomTaxonomy[3].add("resolver");
        _bloomTaxonomy[3].add("seleccionar");
        _bloomTaxonomy[3].add("separar");
        _bloomTaxonomy[3].add("solucionar");
        _bloomTaxonomy[3].add("subdividir");
        _bloomTaxonomy[3].add("transformar");
        _bloomTaxonomy[3].add("valorar");
        
        _bloomTaxonomy[4] = new ArrayList<String>(); // synthesis
        _bloomTaxonomy[4].add("acomodar");
        _bloomTaxonomy[4].add("adaptar");
        _bloomTaxonomy[4].add("animar");
        _bloomTaxonomy[4].add("anticipar");
        _bloomTaxonomy[4].add("apoyar");
        _bloomTaxonomy[4].add("aprestar");
        _bloomTaxonomy[4].add("arreglar");
        _bloomTaxonomy[4].add("categorizar");
        _bloomTaxonomy[4].add("codificar");
        _bloomTaxonomy[4].add("coleccionar");
        _bloomTaxonomy[4].add("combinar");
        _bloomTaxonomy[4].add("comparar");
        _bloomTaxonomy[4].add("compilar");
        _bloomTaxonomy[4].add("componer");
        _bloomTaxonomy[4].add("comunicar");
        _bloomTaxonomy[4].add("construir");
        _bloomTaxonomy[4].add("contrastar");
        _bloomTaxonomy[4].add("corresponder");
        _bloomTaxonomy[4].add("crear");
        _bloomTaxonomy[4].add("cultivar");
        _bloomTaxonomy[4].add("describir");
        _bloomTaxonomy[4].add("depurar");
        _bloomTaxonomy[4].add("desarrollar");
        _bloomTaxonomy[4].add("dirigir");
        _bloomTaxonomy[4].add("diseñar");
        _bloomTaxonomy[4].add("elaborar");
        _bloomTaxonomy[4].add("ensamblar");
        _bloomTaxonomy[4].add("erigir");
        _bloomTaxonomy[4].add("escribir");
        _bloomTaxonomy[4].add("estructurar");
        _bloomTaxonomy[4].add("explicar");
        _bloomTaxonomy[4].add("expresar");
        _bloomTaxonomy[4].add("facilitar");
        _bloomTaxonomy[4].add("formular");
        _bloomTaxonomy[4].add("generar");
        _bloomTaxonomy[4].add("idear");
        _bloomTaxonomy[4].add("incorporar");
        _bloomTaxonomy[4].add("iniciar");
        _bloomTaxonomy[4].add("integrar");
        _bloomTaxonomy[4].add("inventar");
        _bloomTaxonomy[4].add("manejar");
        _bloomTaxonomy[4].add("modelar");
        _bloomTaxonomy[4].add("modificar");
        _bloomTaxonomy[4].add("mejorar");
        _bloomTaxonomy[4].add("montar");
        _bloomTaxonomy[4].add("narrar");
        _bloomTaxonomy[4].add("ordenar");
        _bloomTaxonomy[4].add("organizar");
        _bloomTaxonomy[4].add("planear");
        _bloomTaxonomy[4].add("plantear");
        _bloomTaxonomy[4].add("preparar");
        _bloomTaxonomy[4].add("proponer");
        _bloomTaxonomy[4].add("proyectar");
        _bloomTaxonomy[4].add("recabar");
        _bloomTaxonomy[4].add("reconstruir");
        _bloomTaxonomy[4].add("recopilar");
        _bloomTaxonomy[4].add("redactar");
        _bloomTaxonomy[4].add("reforzar");
        _bloomTaxonomy[4].add("relacionar");
        _bloomTaxonomy[4].add("reorganizar");
        _bloomTaxonomy[4].add("revisar");
        _bloomTaxonomy[4].add("sustituir");
        _bloomTaxonomy[4].add("reunir");
        _bloomTaxonomy[4].add("sustituir");
        _bloomTaxonomy[4].add("validar");
        _bloomTaxonomy[4].add("criticar");
        _bloomTaxonomy[4].add("detectar");
        _bloomTaxonomy[4].add("experimentar");
        _bloomTaxonomy[4].add("juzgar");
        _bloomTaxonomy[4].add("monitorear");
        _bloomTaxonomy[4].add("probar");
        _bloomTaxonomy[4].add("revisar");
        _bloomTaxonomy[4].add("unir");
        
        
        _bloomTaxonomy[5] = new ArrayList<String>(); // evaluation
        _bloomTaxonomy[5].add("apoyar");
        _bloomTaxonomy[5].add("argumentar");
        _bloomTaxonomy[4].add("ayudar");
        _bloomTaxonomy[5].add("calcular");
        _bloomTaxonomy[5].add("comparar");
        _bloomTaxonomy[5].add("concluir");
        _bloomTaxonomy[5].add("constatar");
        _bloomTaxonomy[5].add("contrastar");
        _bloomTaxonomy[5].add("convencer");
        _bloomTaxonomy[5].add("corregir");
        _bloomTaxonomy[5].add("criticar");
        _bloomTaxonomy[5].add("decidir");
        _bloomTaxonomy[5].add("defender");
        _bloomTaxonomy[5].add("definir");
        _bloomTaxonomy[5].add("descubrir");
        _bloomTaxonomy[5].add("determinar");
        _bloomTaxonomy[5].add("discriminar");
        _bloomTaxonomy[5].add("distribuir");
        _bloomTaxonomy[5].add("enjuiciar");
        _bloomTaxonomy[5].add("escoger");
        _bloomTaxonomy[5].add("establecer");
        _bloomTaxonomy[5].add("estimar");
        _bloomTaxonomy[5].add("evaluar");
        _bloomTaxonomy[5].add("explicar");
        _bloomTaxonomy[5].add("interpretar");
        _bloomTaxonomy[5].add("justificar");
        _bloomTaxonomy[5].add("juzgar");
        _bloomTaxonomy[5].add("medir");
        _bloomTaxonomy[5].add("ponderar");
        _bloomTaxonomy[5].add("predecir");
        _bloomTaxonomy[5].add("probar");
        _bloomTaxonomy[5].add("promediar");
        _bloomTaxonomy[5].add("recomendar");
        _bloomTaxonomy[5].add("relacionar");
        _bloomTaxonomy[5].add("revisar");
        _bloomTaxonomy[5].add("seleccionar");
        _bloomTaxonomy[5].add("sustentar");
        _bloomTaxonomy[5].add("tasar");
        _bloomTaxonomy[5].add("validar");
        _bloomTaxonomy[5].add("valorar");
        _bloomTaxonomy[5].add("valorizar");
        _bloomTaxonomy[5].add("valuar");
        _bloomTaxonomy[5].add("verificar");
        _bloomTaxonomy[5].add("construir");
        _bloomTaxonomy[5].add("diseñar");
        _bloomTaxonomy[5].add("elaborar");
        _bloomTaxonomy[5].add("idear");
        _bloomTaxonomy[5].add("trazar");
        _bloomTaxonomy[5].add("planear");
        _bloomTaxonomy[5].add("producir");
        
        
        Boolean found = false;
        
        for (String stem: input.keySet()) {
            found = false;
            int i = 0;
            for (i = 1; i < _bloomTaxonomy.length; i++) {
                for (int j = 0; j < _bloomTaxonomy[i].size(); j++) {
                    if (stem.equalsIgnoreCase(VerbsStemmer.Stem(_bloomTaxonomy[i].get(j)))) {
                        _output.put(i, _output.get(i) + input.get(stem));
                        found = true;
                        break;
                    }
                }
            }
            if (!found) {
                _output.put(i, _output.get(i) + input.get(stem));
            }
        }
        return _output;
    }
}
