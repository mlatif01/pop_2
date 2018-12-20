import java.io.*;
import java.util.*;

public class Main {


    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int x = 0;
        String s = "*";
        String sp = " ";
        String rep_sp;
        String rep_s;

        for (int i = 1; i <= n; i++) {
            rep_s = new String(new char[i+x]).replace("\0", s);
            rep_sp = new String(new char[n-i]).replace("\0", sp);
            System.out.print(rep_sp);
            System.out.println(rep_s);
            x ++;
        }

        for (int j = n-1, y = x; j > 0; j--, y--) {
            rep_s = new String(new char[j+(y-2)]).replace("\0", s);
            rep_sp = new String(new char[n-j]).replace("\0", sp);
            System.out.print(rep_sp);
            System.out.println(rep_s);
        }

    }


}