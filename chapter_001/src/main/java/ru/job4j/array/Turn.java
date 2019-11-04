package ru.job4j.array;

public class Turn {
    public int[] back(int[] array) {
        int j=0;
        for (int i=0; i<(array.length/2);i++) {
            j=array.length-1-i;
            array[i]+=array[j];
            array[j]=array[i]-array[j];
            array[i]=array[i]-array[j];
        }
        return array;
    }
}