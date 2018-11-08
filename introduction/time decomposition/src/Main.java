import java.io.*;
import java.util.*;

public class Main {


    public static void main( String[] args )
    {
        // 3600 s in an hour. 60 secs in a min.
        Scanner in = new Scanner( System.in );
        int n = in.nextInt();
        int h = 0;
        int m = 0;
        while (n > 59) {
            while (n > 3600) {
                h += 1;
                n -= 3600;
            }
            while (n > 60) {
                m += 1;
                n -= 60;
            }
        }
        System.out.println(String.format("%s %s %s", h, m, n));
    }


}
