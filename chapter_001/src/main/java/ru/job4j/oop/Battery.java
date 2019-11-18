package ru.job4j.oop;

public class Battery {
    private int val;

    public Battery(int load){
        this.val = load;
    }

    public void exchange(Battery another){
        another.val += this.val;
        this.val = 0;
    }

    public static void main (String[] args) {
        Battery firstBat = new Battery(50);
        Battery secondBat = new Battery(40);
        System.out.println("Battery 1 is " +  firstBat.val +"% and Battery 2 is " + secondBat.val + "%.");
        firstBat.exchange(secondBat);
        System.out.println("Battery 1 is " +  firstBat.val +"% and Battery 2 is " + secondBat.val + "%.");
    }
}
