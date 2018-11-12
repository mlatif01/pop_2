import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        List<String> words = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        String userInput;

        while (true) {
            userInput = in.next();
            // Type 'exit()' to quit input scanner
            if ("exit()".equals(userInput)) {
                break;
            } else {
                if (!words.contains(userInput)) {
                    words.add(userInput);
                }
            }
        }

        Collections.sort(words);
        System.out.println(words);
        System.out.println(words.get(words.size()-2));

        }

    }