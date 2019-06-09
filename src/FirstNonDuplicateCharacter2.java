import java.util.*;

public class FirstNonDuplicateCharacter2 {
    public static Character firstNonRepeatedCharacter(String str) {

        // Using a LinkedHashMap because it works like a HashMap, except keeps the order according to character inserted. 
        
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
        
        // If using just a normal Hashtable, then iterate through the input String, 
        // and search Hashmap for each character of the input string. Return first one that's == 1. 
/*
        for (i = 0; i < length; i++) {
            c = str.charAt(i);
            if (characterhashtable.get(c) == 1)
                return c;
        }    

*/
        return null;

    }
}