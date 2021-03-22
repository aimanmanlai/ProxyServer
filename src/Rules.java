import java.util.ArrayList;
import java.util.List;

public class Rules {
    protected ArrayList<String> rules = new ArrayList<String>();
    public Rules() {

    }
    public void addfilter(String new_rules) {
        rules.add(new_rules);

    }
    public ArrayList<String> get_rules() {
        return rules;
    }
}