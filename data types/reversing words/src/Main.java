import java.io.*;
import java.util.*;

public class Main {


    public static void main(String[] args) {

        List<String> words = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        String userInput;
        String reversed = "";

        while (true) {
            userInput = in.next();
            // Type 'x' to quit input scanner
            if ("x".equals(userInput)) {
                break;
            } else {
                words.add(userInput);
            }
        }

        for (int i = 0; i < words.size(); i++) {
            for (int j = words.get(i).length() - 1; j >= 0; j--) {
                reversed = reversed + words.get(i).charAt(j);
            }
            System.out.println(reversed);
            reversed = "";
        }

    }


}