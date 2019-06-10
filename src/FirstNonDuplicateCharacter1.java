import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Set;

public class FirstNonDuplicateCharacter1 {

    public static Character firstNonRepeatedCharacter(String str){

        LinkedHashMap<Character, Integer> duplicate = new LinkedHashMap();
        Character cr;

        for (int i = 0; i < str.length(); i++){

            if (duplicate.containsKey(str.charAt(i))){
                Integer value = duplicate.get(str.charAt(i));
                value = value.intValue() + 1;
                duplicate.replace(str.charAt(i), value);
            }else {
                duplicate.put(str.charAt(i), 1);
            }
        }

        for (Character c: duplicate.keySet()){
            if (duplicate.get(c) == 1){
                return c;
            }
        }
        return null;
    }

    public static void main(String[] args) {

        String str1 = "abcdcd";
        String str2 = "aabcdc";
        String str3 = "aaaa";
        String str4 = "B";

        System.out.println(firstNonRepeatedCharacter(str1));
        System.out.println(firstNonRepeatedCharacter(str2));
        System.out.println(firstNonRepeatedCharacter(str3));
        System.out.println(firstNonRepeatedCharacter(str4));

        int[] arr = {2, 5, 5, 8, 2, 6, 3 ,4 ,6, 9, 0};

    }
}
