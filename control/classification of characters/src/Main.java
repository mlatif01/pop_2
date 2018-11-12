import java.io.*;
import java.util.*;

public class Main {


    public static void main( String[] args )
    {

        Scanner in = new Scanner( System.in );
        String input = in.next();
        Character letter = input.charAt(0);
        String vowels = "aeiouAEIOU";

        if (Character.isLowerCase(letter)) {
            System.out.println("lowercase");
        } else {
            System.out.println("uppercase");
        }
        if (vowels.contains(Character.toString(letter))) {
            System.out.println("vowel");
        } else {
            System.out.println("consonant");
        }


    }


}