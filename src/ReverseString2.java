public class ReverseString2 {

    //writes a method that take in a String and returns the reversed version of the string.

    public static String reverseString(String str){

        //if string is null or one character
        if (str == null || str.length() <= 1){
            return str;
        }

        String inputString = str;
        String outputString = "";


        for (int i = inputString.length() - 1; i >= 0; i--){
            outputString += inputString.charAt(i);
        }

        return outputString;
    }

    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "Memes";
        String str3 = "SuperDuper";
        String str4 = "HelloIAmHelloKitty";

        System.out.println(reverseString(str1));
        System.out.println(reverseString(str2));
        System.out.println(reverseString(str3));
        System.out.println(reverseString(str4));
    }
}
