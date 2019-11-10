package ru.job4j.loop;

public class Slash {
    /**
     * Метод Draw выводит на консоль изображение креста ("Х").
     * left = (row == cell) условие, по которому определяется, ставить ли символ или нет.
     * right = (cell == (size - 1 - row)) условие, что нужно ставить элемент в правый угол.
     * @param size размер креста
     */
    public static void draw(int size) {
        for (int row = 0; row < size; row++) {
            for (int cell = 0; cell < size; cell++) {
                boolean left = (row == cell); // добавить условие, по которому нужно определить ставить ли символ или нет.
                boolean right = (cell == (size - 1 - row)); // добавить условие, что нужно ставить элемент в правый угол.
                if (left) {
                    System.out.print("0");
                } else if (right) {
                    System.out.print("0");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        System.out.println("Draw by 3");
        draw(3);
        System.out.println("Draw by 5");
        draw(5);
    }
}