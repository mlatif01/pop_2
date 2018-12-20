import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        Set<String> words_set = new TreeSet<>();
        Scanner in = new Scanner(System.in);

        while (in.hasNext()) {
            words_set.add(in.next());
        }

        ArrayList words_arr = new ArrayList(words_set);
        System.out.println(words_arr.get(words_arr.size()-2));

    }


}