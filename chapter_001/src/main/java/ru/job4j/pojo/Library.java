package ru.job4j.pojo;

public class Library {
    public static void main (String[] args) {
        Book b1 = new Book("Clean code", 464);
        Book b2 = new Book("C++ 21 days", 9999);
        Book b3 = new Book("JavaScript for dummies", 300);
        Book b4 = new Book("Fahrenheit 451", 380);

        Book[] booksArr = new Book[4];
        booksArr[0] = b1;
        booksArr[1] = b2;
        booksArr[2] = b3;
        booksArr[3] = b4;

        for (int index = 0; index < booksArr.length; index++) {
            Book i = booksArr[index];
            System.out.println(" book name is " + i.getName() + "; count pages " + i.getPageCount());
        }

        Book temp = booksArr[0];
        booksArr[0] = booksArr[3];
        booksArr[3] = temp;

        System.out.println("Rearrange 0 and 3");
        for (int index = 0; index < booksArr.length; index++) {
            Book i = booksArr[index];
            System.out.println(" book name is " + i.getName() + "; count pages " + i.getPageCount());
        }

        System.out.println("Is Clean code?");
        for (int index = 0; index < booksArr.length; index++) {
            Book i = booksArr[index];
            if ((i.getName()).equals(b1.getName()))
                System.out.println(" book name is " + i.getName() + "; count pages " + i.getPageCount());
        }
    }
}
