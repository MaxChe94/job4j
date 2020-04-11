package ru.job4j.tracker;

import java.util.Scanner;

public class ConsoleInput implements Input {
    private Scanner scanner = new Scanner(System.in);

    @Override
    public String askStr (String question) {
        System.out.println(question);
        return scanner.nextLine();
    }

    @Override
    public int askInt (String question) {
        System.out.println(question);
        return Integer.valueOf(scanner.nextLine());
    }

    @Override
    public int askInt (String question, int max) {
        int select = askInt(question);
        if (select <= 0 & select > max) {
            throw new IllegalStateException(String.format("Out of about %s > [0, %s]", select, max));
        }
        return select;
    }
}
