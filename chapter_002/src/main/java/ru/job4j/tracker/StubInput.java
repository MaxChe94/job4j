package ru.job4j.tracker;

import java.util.Scanner;

public class StubInput implements Input {
    private Scanner scanner = new Scanner(System.in);

    public String askStr (String question) {
        System.out.println(question);
        return scanner.nextLine();
    }

    public int askInt (String question) {
        System.out.println(question);
        return Integer.valueOf(scanner.nextLine());
    }
}
