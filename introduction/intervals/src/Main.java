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

        List<Integer> lis1 = Arrays.asList(a1,b1);
        List<Integer> lis2 = Arrays.asList(a2,b2);

        System.out.println(lis1);
        System.out.println(lis2);


    }


}
