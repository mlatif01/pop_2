import java.io.*;
import java.util.*;

public class Main {


    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String n = in.next();
        int count = 0;

        for (int i = 0; i < n.length(); i++) {
            if (Character.isDigit(n.charAt(i))) {
                count += 1;
            }
        }

        System.out.println(String.format("The number of digits of %s is %s.", n, count));

    }


}