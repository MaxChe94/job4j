package ru.job4j.loop;

public class CheckPrimeNumber {
    public boolean check(int num){
        boolean res = false;
        for (int i=2;i<num;i++){
            if (res=(num%i != 0)) continue;
            res=false;
            break;
        }
        return res;
    }
}
