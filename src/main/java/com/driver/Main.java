package com.driver;

public class Main {
    public static void main(String[] args) {
        F1 mercedes = new F1("Mercedes", false);
        mercedes.move(40, 0);
        mercedes.accelerate(20);
        mercedes.accelerate(-60);
    }
}
