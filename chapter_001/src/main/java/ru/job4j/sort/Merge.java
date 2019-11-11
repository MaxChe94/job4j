package ru.job4j.sort;

import java.util.Arrays;

public class Merge {

    public static void main (String[] args) {
        Merge process = new Merge();
        int[] rsl = process.merge(
                new int[]{1, 3, 5},
                new int[]{2, 4}
        );
        System.out.println(Arrays.toString(rsl));
    }

    public int[] merge (int[] left, int[] right) {
        int[] rsl = new int[left.length + right.length];
        int i = 0;
        int j = 0;
        int k = 0;
        boolean leftend = left.length < 1;
        boolean rightend = right.length < 1;
        while (!leftend || !rightend) {
            if ((!leftend) && (rightend || left[i] <= right[j])) {
                rsl[k] = left[i];
                i++;
                leftend = (i == left.length);
                k++;
            }
            if ((!rightend) && (leftend || left[i] >= right[j])) {
                rsl[k] = right[j];
                j++;
                rightend = (j == right.length);
                k++;
            }
        }
        return rsl;
    }
}
