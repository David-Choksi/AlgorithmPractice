import java.util.*;
import java.util.streams.*;

public class palindromeVariation1 {
    public static boolean isStringPalindrome(String str){
        if (str == null || str.length() <= 1) {
            return true;
        }
        
        // Make a new string with StringBuilder, and simply use the reverse() method. 
        // Easiest way. 
        
         if (new StringBuilder(str).reverse().toString().equals(str)) {
            return true;
        } 
        
        /*
        int left = 0;
        int right = str.length() - 1; 
        
        while (left < right) {
           if (str.charAt(left) != str.charAt(right)) {
               return false;
           }
           
           left++;
           right--;
        }
        */
        
        // return true;
        
        return false;
    
    }
}