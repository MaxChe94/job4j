package ru.job4j.converter;

public class Converter {

    public static int rubleToEuro(int value) {
        return value / 70;
    }

    public static int rubleToDollar(int value) {
        return value / 60;
    }

    public static int euroToRuble(int value) {
        return value * 70;
    }

    public static int dollarToRuble(int value) {
        return value * 60;
    }

    public static void main(String[] args) {
        /*System.out.println("140 ruble are "+rubleToEuro(140)+" euro");
        System.out.println("180 ruble are "+rubleToDollar(180)+" dollar");
        System.out.println("4 euro are "+euroToRuble(4)+" ruble");
        System.out.println("5 dollar are "+dollarToRuble(5)+" ruble");*/

        int in = 140;
        int expected = 2;
        int out = rubleToEuro(140);
        boolean passed = expected == out;
        System.out.println("140 rubles are 2 euro. Test result : " + passed);

        in = 210;
        expected = 3;
        out = rubleToDollar(in);
        passed = expected == out;
        System.out.println("210 rubles are 3 dollar. Test result : " + passed);

        in = 4;
        expected = 240;
        out = dollarToRuble(in);
        passed = expected == out;
        System.out.println("4 dollar are 240 ruble. Test result : " + passed);

        in = 5;
        expected = 350;
        out = euroToRuble(in);
        passed = expected == out;
        System.out.println("5 euro are 350 ruble. Test result : " + passed);
    }

}
