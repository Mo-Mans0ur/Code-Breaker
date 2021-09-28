import java.util.Arrays;
import java.util.Scanner;

public class CodeBreaker {
    public static String abc = "abcdefghijklmnopqrstuvwxyz ";

    public static void main(String[] args) {

       //encode
        String encoded = numberCypherEncoder("ben");
        System.out.println(encoded);
        String encoded2 = numberCypherEncoder("hello");
        System.out.println(encoded2);



        //decode

        int[] ben = {2, 5, 14};


        System.out.println(numberCypherDecoder(ben));


        //CeacarsEncoder
        System.out.println(ceacarsEncoder("venivedivici"));


    }

    //Encoder
    public static String numberCypherEncoder(String word) {

        String encodedString = "";

        for (int i = 0; i < word.length(); i++) {
            char stringToIndex = word.charAt(i);

            int charAtIndex = abc.indexOf(stringToIndex + 1);

            encodedString = encodedString + charAtIndex + ";" ;
        }

        return encodedString;
    }

    //decoder
    public static String numberCypherDecoder(int[] indexes) {

        String decodedString = "";

        for (int i = 0; i < indexes.length; i++) {
            int temp = indexes[i]-1;
            System.out.print(abc.charAt(temp));


        }
        return decodedString;
    }

    public static char ceasarsCharEncoder(char encodedChar) {
        int returnPosition = abc.indexOf(encodedChar + 3);

        return abc.charAt(returnPosition);
    }

    public static String ceacarsEncoder(String nonCodedString) {

        String encodedSentence = "";

        for (int i = 0; i < nonCodedString.length(); i++) {

            encodedSentence += ceasarsCharEncoder(nonCodedString.charAt(i));
        }

        return encodedSentence;
    }

}
