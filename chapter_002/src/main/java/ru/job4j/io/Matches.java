package ru.job4j.io;

import java.util.Scanner;

public class Matches {
    private int count;
    private int limit;

    public int getCount () {
        return count;
    }

    public Matches (int count, int limit){
        this.count = count;
        this.limit = limit;
    }

    private void getMatches (String gamerName, Scanner in) {
        System.out.println("На столе " + count + " спичек");
        System.out.println(gamerName + ", сколько спичек возьмёте?");
        int getCount = Integer.valueOf(in.nextLine());
        if (getCount > limit) {
            System.out.println("Нельзя взять столько спичек! Максимум " + limit);
        } else {
            count -= getCount;
        }
        if (count == 0) {
            System.out.println(gamerName + " победил!");
        } else {
            if (count < limit) limit = count;
        }
    }

    public static void main (String[] args) {
        Matches game = new Matches(11,3);
        Scanner scan = new Scanner(System.in);
        boolean isSecondGamer = false;
        String name;
        while (game.getCount() > 0) {
            name = (isSecondGamer)? "Игрок 2": "Игрок 1";
            game.getMatches(name, scan);
            isSecondGamer = !isSecondGamer;
        }


    }
}
