package ru.job4j.array;

public class EndsWith {
    public static boolean endsWith(char[] word, char[] post) {
        boolean result = true;
        int j = word.length-post.length;
         for (int i=j; i<word.length;i++){
             if (word[i] != post[i-j]){
                 result=false;
                 break;
             }
        }
        return result;

    }
}