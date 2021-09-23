import java.util.Scanner;

public class CodeBreaker {
    public static void main(String[] args) {

        String word = "ben";
        String encoded = numberCypherEncoder("ben");
        System.out.println(encoded);
        String encoded2 = numberCypherEncoder("hello");
        System.out.println(encoded2);

        int[] result = new int[word.length()];

        String decoded = numberCypherDecoder(word);
        System.out.println(decoded);
    }

    //Encoder
    public static String numberCypherEncoder(String word ) {
        String alphabet = "abcdefghijklmnopqrstuvwxyz";

        String encodedString = "";

        for (int i = 0; i < word.length(); i++) {
            char stringToIndex = word.charAt(i);
            //System.out.println(stringToIndex);

            int charAtIndex = alphabet.indexOf(stringToIndex + 1);
            //System.out.println(charAtIndex);
            encodedString = encodedString + charAtIndex +";" ;
        }

        return encodedString;
    }

    //decoder
    public static String numberCypherDecoder(String word) {
        String alphabet2 = "abcdefghijklmnopqrstuvwxyz";

        String decodedString = "";

        for (int i = 0; i < word.length(); i++) {
            int indexToString = word.indexOf(i);

            int indexToChar = alphabet2.indexOf(indexToString - 1);

            decodedString += indexToChar;

        }
        return decodedString;
    }

}
