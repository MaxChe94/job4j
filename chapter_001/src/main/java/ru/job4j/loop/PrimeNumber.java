package ru.job4j.loop;

public class PrimeNumber {
    public int calc(int finish){
        boolean res = false;
        int out = 1;
        for (int i=2;i<finish;i++){
            for (int j=2;j<i;j++){
                res = (i%j==0) ? true : false;
                if (res) break;
            }
            if (!res) out = i;
        }
        return out;
    }
}
