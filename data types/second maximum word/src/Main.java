import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<String, Integer>();
        Scanner in = new Scanner(System.in);
        String userInput;

        while (true) {
            userInput = in.next();
            // Type 'exit()' to quit input scanner
            if ("exit()".equals(userInput)) {
                break;
            } else {
                if (!map.containsKey(userInput)) {
                    map.put(userInput, 1);
                } else {
                    map.remove(userInput);
                }
            }
        }

        List<String> sorted = new ArrayList<>(map.keySet());
        Collections.sort(sorted);
        System.out.println(sorted);
        System.out.println(sorted.get(1));
    }


}