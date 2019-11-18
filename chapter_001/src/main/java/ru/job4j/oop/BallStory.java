package ru.job4j.oop;

public class BallStory {
    public static void main (String[] args) {
        Ball ball = new Ball();
        Wolf wolf = new Wolf();
        Fox fox = new Fox();
        Haze haze = new Haze();
        haze.tryEat(ball);
        fox.tryEat(ball);
        wolf.tryEat(ball);
    }

}
