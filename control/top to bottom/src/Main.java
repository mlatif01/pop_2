import java.io.*;
import java.util.*;

public class Main {


    public static void main( String[] args )
    {

        Scanner in = new Scanner( System.in );

        String input;
        input = in.nextLine();
        int x = Integer.parseInt(input.split("\\s")[0]);
        int y = Integer.parseInt(input.split("\\s")[1]);

        for (int i = Math.max(x, y); i >= Math.min(x, y); i--) {
            System.out.println(i);
        }

    }


}