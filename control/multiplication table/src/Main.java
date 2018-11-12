import java.io.*;
import java.util.*;

public class Main {


    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n;
        int res;
        n = in.nextInt();

        for (int i = 1; i <= 10; i++) {
            res = n * i;
            System.out.println(String.format("%s*%s = %s", n, i, res));
        }

    }


}