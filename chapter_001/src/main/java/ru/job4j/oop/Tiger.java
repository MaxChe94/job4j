package ru.job4j.oop;

public class Tiger extends Predator {
    public Tiger() {
        super();
        System.out.println("This is class Tiger, tiger name - ");
    }

    public Tiger(String name){
        super(name);
        System.out.println("This is class Tiger, tiger name - "+name);
    }
}
