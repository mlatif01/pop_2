import java.io.*;
import java.util.*;

public class Main {


    public static void main( String[] args )
    {

        Scanner in = new Scanner( System.in );

        int t = in.nextInt();
        if (t > 30) {
            System.out.println("it's hot");
            if (t >= 100) {
                System.out.println("water would boil");
            }
        }
        else if (t >= 10) {
            System.out.println("it's ok");
        }
        else {
            System.out.println("it's cold");
            if (t <= 0) {
                System.out.println("water would freeze");
            }
        }

    }


}