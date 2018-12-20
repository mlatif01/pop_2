import java.io.*;
import java.util.*;

public class Main {


    public static void main( String[] args )
    {

        Scanner in = new Scanner( System.in );
        int n = in.nextInt();
        int h = n / 3600;
        int m = (n % 3600)/60;
        int s = (n % 3600)%60;
        System.out.println(String.format("%s %s %s", h, m, s));

    }


}
