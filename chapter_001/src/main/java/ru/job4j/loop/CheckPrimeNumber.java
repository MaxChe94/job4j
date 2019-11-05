package ru.job4j.loop;

public class CheckPrimeNumber {
    public boolean check(int num) {
        boolean res = true;
        if (num < 2) {
            res = false;
        } else {
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    res = false;
                    break;
                }
            }
        }
        return res;
    }
}
