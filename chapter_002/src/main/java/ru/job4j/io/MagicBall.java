package ru.job4j.io;

import java.util.Scanner;
import java.util.Random;

public class MagicBall {
    public static void main (String[] args) {
        String out = "Может быть";
        Scanner in = new Scanner(System.in);
        System.out.println("Я великий Оракул. Что ты хочешь узнать? ");
        String q = in.nextLine();
        int answer = new Random().nextInt(3);
        if (answer == 0) out = "Да";
        if (answer == 1) out = "Нет";
        System.out.println(q + " - " + out);
    }
}
