package ru.job4j.condition;

public class Max {
    public static int max(int first, int second) {
        boolean condition = first > second;
        return condition ? first : second;
    }
    public static int max(int first, int second, int third) {
        return max(max(first, second), third);
    }
    public static int max(int first, int second, int third, int forth) {
        return max(max(first, second), max(third, forth));
    }
}
