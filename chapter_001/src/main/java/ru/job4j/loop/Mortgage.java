package ru.job4j.loop;

public class Mortgage {
    public int year(int amount, int salary, double percent) {
        percent /= 100;
        double debt = amount + amount * percent;
        int year = 0;
        while (debt > 0) {
            debt -= salary;
            year++;
            debt *= (1 + percent);
        }
        return year;
    }
}
