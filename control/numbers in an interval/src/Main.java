import java.io.*;
import java.util.*;

public class Main {


    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String input;
        input = in.nextLine();
        String a = input.split("\\s")[0];
        String b = input.split("\\s")[1];
        String nums = "";

        for (int i = Integer.parseInt(a); i <= Integer.parseInt(b); i++) {
            if (i == Integer.parseInt(b)) {
                nums += i;
            } else {
                nums += String.format("%s,", i);
            }
        }

        System.out.println(nums);
    }


}