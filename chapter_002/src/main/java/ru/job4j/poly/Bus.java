package ru.job4j.poly;

public class Bus implements Transport {

    @Override
    public void ride() {

    }

    @Override
    public void passengers(int count) {

    }

    @Override
    public double refuel(int liters) {
        double oneLiterPrice = 44.5;
        return liters * oneLiterPrice;
    }
}
