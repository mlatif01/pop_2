import java.io.*;
import java.util.*;

public class Main {


    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();

        for (int i = a; i <= b; i++) {
            if (i == b) {
                System.out.print(i);
            }
            else {
                System.out.print(i+",");
            }
        }

        System.out.println();
    }


}