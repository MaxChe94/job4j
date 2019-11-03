package ru.job4j.calculator;

/**
 *Calculate (addition, subtraction, division, multiplication)
 *
 * @author Maxim Cherepenin (mchere94@gmail.com)
 */

public class Calculator {
    public static void add(double first, double second){
        double result = first+second;
        System.out.println(first+" + "+second+" = "+result);
    }

    public static void sub(double first, double second){
        double result = first-second;
        System.out.println(first+" - "+second+" = "+result);
    }

    public static void div(double first, double second){
        double result = first/second;
        System.out.println(first+" / "+second+" = "+result);
    }

    public static void mult(double first, double second){
        double result = first*second;
        System.out.println(first+" * "+second+" = "+result);
    }

    /**
     * Main - мето, служащий для запуска других методов данного класса,
     * реализующих математические операции над заданными числами.
     * @param args - args.
     */
    public static void main(String[] args) {
        add(1,2);
        sub(4,6);
        div(7,3);
        mult(3,7);
    }
}
