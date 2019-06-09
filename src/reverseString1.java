import java.util.*;
import java.util.streams.*;

public class reverseString1 {
    public static String reverseString(String str){
    
        if (str == null) {
            return null;
        }
        
        if (str.length() <= 1) {
            return str;
        }
        
        String inputString = str;
        String outputString = "";
        
        // add the character from the input string to the START of the output string, i.e. reversing the string
        for (char ch : str.toCharArray()) {
            outputString = ch + outputString;
        }
        
        
        
        return outputString;
    }
}