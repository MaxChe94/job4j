package ru.job4j.array;

public class EndsWith {
    public static boolean endsWith(char[] word, char[] post) {
        boolean result = false;
        int j = word.length-post.length;
         for (int i=j; i<word.length;i++){
            result = (word[i] == post[i-j]);
            if (!result) break;
        }
        return result;

    }
}