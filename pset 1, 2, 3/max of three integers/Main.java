import java.io.*;
import java.util.*;

public class Main {


    public static void main( String[] args )
    {

        Scanner in = new Scanner( System.in );
        int a, b, c;

        a = in.nextInt();
        b = in.nextInt();
        c = in.nextInt();
        int max1 = Math.max(a, b);
        int max2 = Math.max(max1, c);
        System.out.println(max2);

    }


}