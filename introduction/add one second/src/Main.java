import java.io.*;
import java.util.*;

// Skeleton code for a program that expects 3 ints as input, 
// and then prints out what the input was

public class Main {


    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int h, m, s;

        h = in.nextInt();
        m = in.nextInt();
        s = in.nextInt();

        if (s == 59) {
            m += 1;
        }
        if (m == 60) {
            h += 1;
            m = 0;
        }
        s += 1;
        if (s == 60) {
            s = 0;
        }
        if (h == 24) {
            h = 0;
        }
        System.out.printf("%02d:%02d:%02d", h, m, s);

    }


}