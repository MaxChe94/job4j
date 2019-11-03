package ru.job4j.loop;

public class Fitness {
    public int calc(int ivan, int nik){
        int i=0;
        while (ivan<nik){
            ivan*=3;
            nik*=2;
            i++;
        }
        return i;
    }
}
