import java.util.HashMap;
import java.util.Map;

public class Parser {
    public Map DialogHolo = new HashMap<String, String>();

    public boolean SetKeyValue(String Key, String Value) {
        if (Key.isEmpty() && Value.isEmpty()) {
            return false;
        } else {
            DialogHolo.put(Key, Value);
        }
        return true;
    }

    public void ParseString(String Text, int NumOfPhrases) {
        String KeyValue[] = Text.split("|");
        for (int i = 0; i < NumOfPhrases; i += 2) {
            System.out.println(KeyValue[i]);
            System.out.println(KeyValue[i++]);
            SetKeyValue(KeyValue[i], KeyValue[i++]);
        }
    }
}
