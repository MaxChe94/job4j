package ru.job4j.loop;

public class Board {
    public static void paint(int width, int height){
        for (int row = 0; row<height; row++){
            for (int col = 0; col < width; col++){
                System.out.print(((row+col)%2 == 0)? "X" : " ");
            }
            System.out.println();
        }
    }

    public static void main (String[] args) {
        paint(3,3);
        System.out.println();
        paint(4,4);
    }

}

