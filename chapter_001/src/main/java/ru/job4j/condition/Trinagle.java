package ru.job4j.condition;

public class Trinagle {
    public static boolean exist(int ab, int ac, int bc){
        return ((ab+ac)>bc) && ((ab+bc)>ac) && ((ac+bc)>ab);
    }
}
