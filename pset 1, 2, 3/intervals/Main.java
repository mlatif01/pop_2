import java.io.*;
import java.util.*;

public class Main {


    public static void main( String[] args )
    {

        Scanner in = new Scanner( System.in );
        int a1, b1, a2, b2;

        a1 = in.nextInt();
        b1 = in.nextInt();
        a2 = in.nextInt();
        b2 = in.nextInt();

        if (a1 <= b2 && a2 <= b1) {
            System.out.println(String.format("[%d,%d]", Math.max(a1, a2), Math.min(b1, b2)));
        } else {
            System.out.println("[]");
        }

    }


}
