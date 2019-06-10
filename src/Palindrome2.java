public class Palindrome2 {


    public static boolean isStringPalindrome(String str){

        if (str == null || str.length() <= 1) {
            return true;
        }

        //This is the more manual way by using pointers.

        int left = 0;
        int right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;

        //This is a one-liner by using StringBuilder API

       /* if (new StringBuilder(str).reverse().toString().equals(str)) {
            return true;
        }

        return false; */

    }

    public static void main(String[] args) {
        String str1 = "madam";
        String str2 = "aabb";
        String str3 = "race car";
        String str4 = "";
        String str5 = null;

        System.out.println(isStringPalindrome(str1));
        System.out.println(isStringPalindrome(str2));
        System.out.println(isStringPalindrome(str3));
        System.out.println(isStringPalindrome(str4));
        System.out.println(isStringPalindrome(str5));
    }
}
