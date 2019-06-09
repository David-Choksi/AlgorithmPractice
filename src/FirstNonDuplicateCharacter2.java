import java.util.*;
import java.util.streams.*;

public class firstNonRepeatedCharacter2 {
    public static Character firstNonRepeatedCharacter(String str) {
        LinkedHashMap<Character, Integer> duplicateStorage = new LinkedHashMap<Character, Integer>();
        
        for (char ch : str.toCharArray()) {
            if (duplicateStorage.get(ch) == null) {
                duplicateStorage.put(ch, 1);
            }
            
            else {
                duplicateStorage.put(ch, duplicateStorage.get(ch) + 1);
            }
        }
        
        for (char ch : duplicateStorage.keySet()) {
            if (duplicateStorage.get(ch) == 1) {
                return ch;
            }
        }
        
        return null;

    }
}