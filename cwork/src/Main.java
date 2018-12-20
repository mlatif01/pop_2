import java.io.*;
import java.util.*;
import fraction.FractionImpl;

public class Main {


    public static void main( String[] args )
    {

        FractionImpl fracA = new FractionImpl(50, 100);
        FractionImpl fracB = new FractionImpl(25, 100);
//        System.out.println(fracA.toString());
//        System.out.println(fracA.add(fracB));
//        System.out.println(fracA.subtract(fracB));
//        System.out.println(fracA.multiply(fracB));
//        System.out.println(fracA.divide(fracB));
//        System.out.println(fracA.abs());
//        System.out.println(fracA.equals(fracB));
//        System.out.println(fracA.inverse());
        System.out.println(fracA.compareTo(fracB));





    }


}