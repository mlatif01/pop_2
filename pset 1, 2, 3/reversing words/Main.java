import java.io.*;
import java.util.*;

public class Main {


    public static void main(String[] args) {

        List<String> words = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        String userInput;
        String reversed = "";

        while (in.hasNext()) {
            userInput = in.next();
            words.add(userInput);
        }

        for (String word : words) {
            for (int j = word.length() - 1; j >= 0; j--) {
                reversed = reversed + word.charAt(j);
            }
            System.out.println(reversed);
            reversed = "";
        }

    }


}