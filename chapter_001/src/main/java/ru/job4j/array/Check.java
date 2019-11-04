package ru.job4j.array;

public class Check {
        public boolean mono(boolean[] data) {
            boolean result = false;
            for (int i=0;i<data.length;i++){
                result = (data[0] == data[i]);
                if (!result) break;
                }
            return result;
        }
}
